<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>

<html>
    <head>
        <title>PAGE 2</title>
        <link href="static/css/styles.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        ${textA}
        ${textB}

        <c:out value="This is JSTL output"/>

        <c:forEach items="${list}" var="element">
            <c:out value="${element}"/>
        </c:forEach>

    </body>
</html>