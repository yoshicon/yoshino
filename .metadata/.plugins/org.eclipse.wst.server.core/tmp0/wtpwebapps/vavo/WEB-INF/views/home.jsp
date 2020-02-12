<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>바보</title>
    </head>
    <body>
        <% if (request.getParameter("error") == null) { %>
            <h1>로그인 하셉</h1> 
        <% } else { %>
            <h1><%= request.getParameter("error") %></h1>
        <% } %>
        <form action="logck.jsp" method="post">
            <label>ID: </label>
            <input name="id" type="text"><br>
            <label>PW: </label>
            <input name="pw" type="password"><br>
            <input type="submit" value="로그인">
        </form>
    </body>
</html>
