<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$title$</title>
</head>
<body>

    <table border="1" width="60%">
        <c:forEach var="item" items="${employees}">
            <tr>
                <td>${item.sn}</td>
                <td>${item.name}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
