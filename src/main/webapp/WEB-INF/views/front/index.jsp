<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<div class="jumbotron">
  <h1>Hello, world!</h1>
  <p>This is a <a href="https://github.com/paukiatwee/webapp-bootstrap" target="_blank">webapp-bootstrap</a> for a quick startup in creating Java based webapp. It includes a several famous frameworks such as <a href="http://www.springsource.org/" target="_blank">Springframework</a>, <a href="http://www.hibernate.org/" target="_blank">Hibernate</a> and <a href="http://twitter.github.com/bootstrap/" target="_blank">Twitter Bootstrap</a>. Use it as a starting point to create something more unique.</p>
  <p><a class="btn btn-primary btn-large" href="https://github.com/paukiatwee/webapp-bootstrap" target="_blank">Learn more »</a></p>
</div>
<div class="row">
  <div class="col-xs-12 col-md-7">
    <h1>HTML Ipsum Presents</h1>
    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo. Quisque sit amet est et sapien ullamcorper pharetra. Vestibulum erat wisi, condimentum sed, commodo vitae, ornare sit amet, wisi. Aenean fermentum, elit eget tincidunt condimentum, eros ipsum rutrum orci, sagittis tempus lacus enim ac dui. Donec non enim in turpis pulvinar facilisis. Ut felis. Praesent dapibus, neque id cursus faucibus, tortor neque egestas augue, eu vulputate magna eros eu erat. Aliquam erat volutpat. Nam dui mi, tincidunt quis, accumsan porttitor, facilisis luctus, metus</p>
  </div>
  <div class="col-xs-12 col-md-5">
    <c:if test="${isLoginError}">
      <div class="alert alert-error">
        <a class="close" data-dismiss="alert">×</a>
        <h4 class="alert-heading">Authentication Failed</h4>
        Combination of <strong>Username</strong> and <strong>Password</strong> is wrong.<br />
        Please try again.
      </div>
    </c:if>
    <form class="well" action="/login" method="post">
      <h3>Sign In</h3>
      <label for="j_username"><strong>Username</strong></label>
      <input type="text" class="form-control" name="j_username" id="j_username" placeholder="Your username..." autocomplete="off">
      <label for="j_password"><strong>Password</strong></label>
      <input type="password" class="form-control" name="j_password" id="j_password" placeholder="Your password...">
      <label class="checkbox">
        <input type="checkbox"> Remember Me
      </label>
      <button type="submit" class="btn btn-primary">Sign In</button>
    </form>
  </div>
</div>

