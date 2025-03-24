package com.learning.springboot.my_first_web_app.service;

import com.learning.springboot.my_first_web_app.model.Todo;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Iterator;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();
    
    // Private constructor to prevent instantiation
    private TodoService() {
    }

    static {
        todos.add(new Todo(1, "cheikh", "learn spring boot", LocalDate.of(2025, 1, 10), false));
        todos.add(new Todo(2, "wassim", "learn Java", LocalDate.of(2025, 3, 12), false));
        todos.add(new Todo(3, "cheikh", "learn spring boot", LocalDate.of(2025, 2, 10), false));
    }
    
    public static List<Todo> findAll() {
        return todos;
    }
    
    // Get todos by username
    public List<Todo> findByUsername(String username) {
        List<Todo> userTodos = new ArrayList<>();
        for (Todo todo : todos) {
            if (todo.getUsername().equals(username)) {
                userTodos.add(todo);
            }
        }
        return userTodos;
    }
    
    public boolean deleteById(int id) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
