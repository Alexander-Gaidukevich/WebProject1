<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>PAGE 1</title>
        <link href="static/css/styles.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        ${textA}
        ${textB}

        <form action="/s2" method="GET">
            <button type="submit" name="button" value="button1">GET LIST</button>
        </form>
        <form action="/s3" method="GET">
            <button type="submit" name="button" value="button1">GET WITH COST</button>
        </form>
    </body>
</html>