<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>Document</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
</head>
<body>
<jsp:include page="header.jsp"/>
<section class="login-page">
    <h2>Dodaj instytucję</h2>
    <form:form method="post" modelAttribute="institution">
        <div class="form-group">
            <label>Nazwa instytuacji</label>
            <form:input path="name" />
            <form:errors path="name"/>
            <div class="form-group">
                <br>
                <label>Cel instytuacji</label>
                <form:textarea path="description" />
                <form:errors path="description"/>
            </div>
            <button class="btn" type="submit">Dodaj Instytucję</button>
            <div class="form-group form-group--buttons">
            </div>
        </div>
    </form:form>
</section>
<jsp:include page="footer.jsp"/>
</body>
</html>
