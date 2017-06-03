<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>

<html>
    <head>
        <title>PAGE 4</title>
        <link href="static/css/styles.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <c:out value="CARS WITH COST MORE THEN ${cost}"/>

        <table>
            <th>Name</th>
            <th>Cost</th>

            <c:forEach items="${newCarByCost}" var="element">
                <tr>
                    <td><c:out value="${element.name}"/></td>
                    <td><c:out value="${element.cost}"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>