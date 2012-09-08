<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title><tiles:getAsString name="title" /> | Company</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">

  <!-- Le styles -->
  <link href="/assets/css/style.css?${applicationScope.rev}" rel="stylesheet">

  <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
  <!--[if lt IE 9]>
  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->
</head>

<body>
<div class="navbar navbar-fixed-top">
  <div class="navbar-inner">
    <tiles:insertAttribute name="top-menu" />
  </div>
</div>

<div class="container">
  <tiles:insertAttribute name="body" />
  <tiles:insertAttribute name="footer" />
</div><!--/.fluid-container-->

<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="/assets/js/jquery.min.js?${applicationScope.rev}"></script>
<script src="/assets/js/bootstrap.min.js?${applicationScope.rev}"></script>
<script src="/assets/js/script.min.js?${applicationScope.rev}"></script>
</body>
</html>
