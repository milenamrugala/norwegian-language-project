<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/header.css">
    <link rel="stylesheet" type="text/css" href="/css/footer.css">
    <link rel="stylesheet" type="text/css" href="/css/vocabulary.css">
    <title>Norwegian Language Project</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h1 class="header-text">Category: ${categoryName}</h1>
<table>
    <thead>
    <tr>
        <th>NO</th>
        <th>ENG</th>
        <%--<th>Sentence</th>--%>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${vocabularies}" var="vocabulary">
        <tr>
            <td>${vocabulary.word}</td>
            <td>${vocabulary.translation}</td>
            <%--<td>${vocabulary.sentence}</td>--%>
        </tr>
    </c:forEach>
    </tbody>
</table>
<%@ include file="footer.jsp" %>
</body>
</html>