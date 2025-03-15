<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello World - JSP</title>
    <style>
        header {
            background-color: #f8f9fa;
            padding: 20px;
            text-align: center;
            border-bottom: 1px solid #e7e7e7;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <header>
        <h1>Todo List Application</h1>
    </header>
    <h1>Welcome ${name}!</h1>
    <h2>${message}</h2>
</body>
</html>