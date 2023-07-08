<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/header.css">
    <link rel="stylesheet" type="text/css" href="/css/footer.css">
    <link rel="stylesheet" type="text/css" href="/css/categories.css">
    <title>Norwegian Language Project</title>
</head>
<body>
<%@ include file="header.jsp" %>

<div class="container">
    <h1 class="header-text">Welcome to level A1</h1>
    <table>
        <tbody>
        <c:forEach items="${categories}" var="category">
            <tr>
                <td>
                    <div class="category">
                        <a style="color: #ffffff; text-decoration: none;" class="category-link" href="/norwegian-language/vocabulary/${category.id}">
                                ${category.name}
                        </a>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>