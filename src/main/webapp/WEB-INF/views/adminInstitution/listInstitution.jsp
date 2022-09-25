<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
<header>
    <nav class="container container--70">
        <ul class="nav--actions">
            <li><a href="#">Zaloguj</a></li>
            <li class="highlighted"><a href="#">Załóż konto</a></li>
        </ul>

        <ul>
            <li><a href="index.html" class="btn btn--without-border active">Start</a></li>
            <li><a href="index.html#steps" class="btn btn--without-border">O co chodzi?</a></li>
            <li><a href="index.html#about-us" class="btn btn--without-border">O nas</a></li>
            <li><a href="index.html#help" class="btn btn--without-border">Fundacje i organizacje</a></li>
            <li><a href="index.html#contact" class="btn btn--without-border">Kontakt</a></li>
        </ul>
    </nav>
</header>
<section class="help">
    <h2>Lista fundacji</h2>
    <!-- SLIDE 1 -->

    <div class="help--slides active" data-id="1">
    <c:forEach items="${InstitutionList}" var="Institution" >
        <ul class="help--slides-items">
            <!-- Institution from DB -->
            <li>
                <div class="col">
                    <div class="title">${Institution.name}</div>
                    <div class="subtitle">${Institution.description}</div>
                    <a href="<c:url value="/admin/institution/edit/${Institution.id}"/>">Edytuj</a>
                    <a href="<c:url value="/admin/institution/delete/${Institution.id}"/>">Usuń</a>
                </div>
        </ul>
        <br>
        </c:forEach>
    </div>
</section>
<script src="<c:url value="/resources/js/app.js"/>"></script>
</body>
</html>
