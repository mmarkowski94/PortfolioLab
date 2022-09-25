<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pl">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
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

    <section class="login-page">
      <h2>Załóż konto</h2>
<form:form method="post" modelAttribute="user">
        <div class="form-group">
          <form:input path="name" placeholder="Podaj imię" />
            <form:errors path="name"/>
        </div>
        <div class="form-group">
            <form:input path="surname" placeholder="Podaj nazwisko" />
            <form:errors path="surname"/>
        </div>
        <div class="form-group">
          <form:input type="email" path="email" placeholder="Podaj email" />
            <form:errors path="email"/>
        </div>
        <div class="form-group">
          <form:input type="password" path="password" placeholder="Podaj hasło" />
            <form:errors path="password"/>
        </div>
<%--        <div class="form-group">--%>
<%--          <form:input type="password" path="password2" placeholder="Powtórz hasło" />--%>
<%--        </div>--%>

        <div class="form-group form-group--buttons">
          <a href="login.jsp" class="btn btn--without-border">Zaloguj się</a>
          <button class="btn" type="submit">Załóż konto</button>
        </div>
      </form:form>
    </section>

    <jsp:include page="footer.jsp"/>
  </body>
</html>
