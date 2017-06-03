<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>

<html>
    <head>
        <title>PAGE 3</title>
        <link href="static/css/styles.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <form action="/s3" method="POST">
            <input type="cost" name="cost"><br><br>
            <button type="submit" name="button" value="button1">GET LIST</button>
        </form>
    </body>
</html>