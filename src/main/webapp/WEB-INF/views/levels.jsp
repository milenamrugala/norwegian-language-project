<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/header.css">
    <link rel="stylesheet" type="text/css" href="/css/footer.css">
    <link rel="stylesheet" type="text/css" href="/css/levels.css">
    <title>Norwegian Language Project</title>
</head>
<body>
<%@ include file="header.jsp" %>

<h1 class="header-text">Choose the language level you want to master</h1>

<table>
    <tbody>
    <tr>
        <td>
            <div class="level-names">
                <c:forEach items="${levels}" var="level">
                    <a href="/norwegian-language/${level.name.toLowerCase()}categories" class="level-name">
                            ${level.name}
                    </a>
                </c:forEach>
            </div>
        </td>
    </tr>
    </tbody>
</table>

<%@ include file="footer.jsp" %>
</body>
</html>