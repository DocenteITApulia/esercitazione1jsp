<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Registrazione utente</title>
</head>
<body>
<c:url var="add_user_url" value="register"/>
<form:form action="${add_user_url}" method="post" modelAttribute="formutente">
    <form:label path="nome">Nome: </form:label><form:input type="text" path="nome" />
    <form:label path="cognome">Cognome: </form:label><form:input type="text" path="cognome" />
    <form:label path="email">Email: </form:label><form:input type="text" path="email" />
    <form:label path="password">password: </form:label><form:input type="text" path="password" />
    <form:label path="nome">verifica password: </form:label><form:input type="text" path="vpassword" />
    <form:label path="checkbox">Accetta condizioni privacy: </form:label><form:checkbox path="privacy"/>

    <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /> </p>
</form:form>

</body>
</html>