<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Welcome to webapp-bootstrap</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="/assets/css/bootstrap.min.css" rel="stylesheet">
    <style>
      body {
        padding-top: 10px;
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
      <div class="hero-unit">
        <h1>Hello, world!</h1>
        <p>This is a <a href="https://github.com/paukiatwee/webapp-bootstrap" target="_blank">webapp-bootstrap</a> for a quick startup in creating Java based webapp. It includes a several famous frameworks such as <a href="http://www.springsource.org/" target="_blank">Springframework</a>, <a href="http://www.hibernate.org/" target="_blank">Hibernate</a> and <a href="http://twitter.github.com/bootstrap/" target="_blank">Twitter Bootstrap</a>. Use it as a starting point to create something more unique.</p>
        <p><a class="btn btn-primary btn-large" href="https://github.com/paukiatwee/webapp-boostrap" target="_blank">Learn more »</a></p>
      </div>
      <div class="row">
        <div class="span7">
          <div class="well">
            <h1>HTML Ipsum Presents</h1>
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo. Quisque sit amet est et sapien ullamcorper pharetra. Vestibulum erat wisi, condimentum sed, commodo vitae, ornare sit amet, wisi. Aenean fermentum, elit eget tincidunt condimentum, eros ipsum rutrum orci, sagittis tempus lacus enim ac dui. Donec non enim in turpis pulvinar facilisis. Ut felis. Praesent dapibus, neque id cursus faucibus, tortor neque egestas augue, eu vulputate magna eros eu erat. Aliquam erat volutpat. Nam dui mi, tincidunt quis, accumsan porttitor, facilisis luctus, metus</p>
          </div>
        </div>
        <div class="span5">
          <form class="well" action="/login" method="post">
            <h3>Sign In</h3>
            <label for="username">Username</label>
            <input type="text" class="input-xlarge" name="j_username" placeholder="Your username..." autocomplete="off" autofocus="autofocus">
            <label for="password">Password</label>
            <input type="password" class="input-xlarge" name="j_password" placeholder="Your password...">
            <label class="checkbox">
              <input type="checkbox"> Remember Me
            </label>
            <button type="submit" class="btn btn-primary">Login</button>
            <button type="reset" class="btn">Clear</button>
          </form>
        </div>
      </div>
    </div>
    <script src="/assets/js/jquery.min.js"></script>
    <script src="/assets/js/bootstrap.min.js"></script>
  </body>
</html>
