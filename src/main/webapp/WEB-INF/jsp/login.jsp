<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login</title>
</head>
<body>
<form action="#" th:action="@{/login}" th:object="${formLogin}" method="post">
    <p>email: <input type="text" th:field="*{email}" /></p>
    <p>password: <input type="text" th:field="*{password}" /></p>
    <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /> </p>
</form>


</body>
</html>