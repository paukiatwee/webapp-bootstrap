<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container-fluid">
  <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
    <span class="icon-bar"></span>
    <span class="icon-bar"></span>
    <span class="icon-bar"></span>
  </a>
  <a class="brand" href="<c:url value="/" />">Webapp Bootstrap</a>
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
  <div class="nav-collapse">
    <ul class="nav">
      <li><a href="/secure/home">Home</a></li>
      <li><a href="<c:url value="/secure/about" />">About</a></li>
      <li><a href="<c:url value="/secure/contact" />">Contact</a></li>
    </ul>
  </div>
</div>
