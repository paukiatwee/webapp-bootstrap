<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container">
  <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
    <span class="icon-bar"></span>
    <span class="icon-bar"></span>
    <span class="icon-bar"></span>
  </a>
  <a class="brand" href="<c:url value="/" />">Webapp Bootstrap</a>
  <sec:authorize access="isAuthenticated()">
    <div class="btn-group pull-right">
      <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
        <i class="icon-user"></i> <sec:authentication property="principal.username" />
        <span class="caret"></span>
      </a>
      <ul class="dropdown-menu">
        <li><a href="<c:url value="/secure/profile" />">Profile</a></li>
        <li class="divider"></li>
        <li><a href="<c:url value="/logout" />">Sign Out</a></li>
      </ul>
    </div>
    <div class="nav-collapse pull-right">
      <ul class="nav top">
        <li id="top"><a href="<c:url value="/secure/home" />">Dashboard</a></li>
      </ul>
    </div>
  </sec:authorize>
  <sec:authorize access="isAnonymous()">
  <ul class="nav pull-right">
    <li class="divider-vertical"></li>
    <li class="dropdown">
      <a class="dropdown-toggle" href="#" data-toggle="dropdown">Sign In <strong class="caret"></strong></a>
      <div class="dropdown-menu" style="padding: 15px; padding-bottom: 0px;">
        <form action="/login" method="post" accept-charset="UTF-8">
          <label for="j_username"><strong>Username</strong></label>
          <input type="text" class="input" name="j_username" id="j_username" placeholder="Your username..." autocomplete="off" autofocus="autofocus">
          <label for="j_password"><strong>Password</strong></label>
          <input type="password" class="input" name="j_password" id="j_password" placeholder="Your password...">
          <label class="checkbox">
            <input type="checkbox"> Remember Me
          </label>
          <button type="submit" class="btn btn-primary" style="clear: left; width: 100%; height: 32px; font-size: 13px;">Sign In</button>
        </form>
      </div>
    </li>
  </ul>
  </sec:authorize>
  <div class="nav-collapse">
    <ul class="nav top">
      <li><a href="<c:url value="/about" />">About</a></li>
    </ul>
  </div>
</div>
