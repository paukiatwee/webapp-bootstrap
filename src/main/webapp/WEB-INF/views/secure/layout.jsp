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
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title><tiles:getAsString name="title" /> | Company</title>
  <link href="/assets/css/style.css?${applicationScope.rev}" rel="stylesheet">
  <!--[if lt IE 9]>
  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->
</head>

  <body>
    <tiles:insertAttribute name="top-menu" />

    <div class="container">
      <div class="row">
        <div class="col-lg-3">
          <div class="well sidebar-nav">
            <tiles:insertAttribute name="side-menu" />
          </div>
        </div>
        <div class="col-lg-9">
          <h2><tiles:getAsString name="title" /></h2>
          <tiles:insertAttribute name="body" />
        </div>
      </div>
      <tiles:insertAttribute name="footer" />
    </div>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <script src="/assets/js/bootstrap.min.js?${applicationScope.rev}"></script>
    <script src="/assets/js/script.min.js?${applicationScope.rev}"></script>
  </body>
</html>
