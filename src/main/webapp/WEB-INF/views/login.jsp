<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page - Todo List</title>
</head>
<body>
    <h1>${title}</h1>
    <p>Please provide your username and password</p>
    <form method="post">
    	Name: <input type="text" name="name">
    	Password: <input type="password" name="password">
    	<input type="submit">
    </form>
</body>
</html>