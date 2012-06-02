<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container-fluid">
  <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
    <span class="icon-bar"></span>
    <span class="icon-bar"></span>
    <span class="icon-bar"></span>
  </a>
  <a class="brand" href="#">Project name</a>
  <div class="nav-collapse">
    <ul class="nav">
      <li class="active"><a href="/secure/home">Home</a></li>
      <li><a href="<c:url value="/secure/about" />">About</a></li>
      <li><a href="<c:url value="/secure/contact" />">Contact</a></li>
    </ul>
    <p class="navbar-text pull-right">Welcome, <sec:authentication property="principal.username" />. <a href="<c:url value="/logout" />">Logout</a></p>
  </div>
</div>
