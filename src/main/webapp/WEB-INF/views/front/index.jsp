<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="/assets/css/bootstrap.min.css" rel="stylesheet">
    <style>
      body {
        padding-top: 60px;
      }
    </style>
    <link href="/assets/css/bootstrap-responsive.min.css" rel="stylesheet">
    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
  </head>

  <body>
    <div class="container">
      <div class="span5 offset3">
        <form class="well" action="/" method="post">
          <label for="username">Username</label>
          <input type="text" class="input-xlarge" name="username" placeholder="Your username..." autofocus="autofocus">
          <label for="password">Password</label>
          <input type="password" class="input-xlarge" name="password" placeholder="Your password...">
          <label class="checkbox">
            <input type="checkbox"> Remember Me
          </label>
          <button type="submit" class="btn btn-primary">Login</button>
          <button type="reset" class="btn">Clear</button>
          <c:if test="${not empty login}">
            <div class="alert alert-error" style="margin-top: 8px"><strong>Warning!</strong> ${login}</div>
          </c:if>
        </form>
      </div>
    </div>
    <script src="/assets/js/jquery.min.js"></script>
    <script src="/assets/js/bootstrap.min.js"></script>
  </body>
</html>
