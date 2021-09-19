<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Utenti registrati</title>
</head>
<body>
<c:forEach items="${myList}" var="user">
    <ul>
        <li>${user.name}</li>
        <li>${user.cognome}</li>
        <li>${user.email}</li>
    </ul>
</c:forEach>
</body>