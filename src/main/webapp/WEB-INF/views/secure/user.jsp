<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:if test="${isCreateSuccess}">
  <div class="alert alert-success">
    <a class="close" data-dismiss="alert">×</a>
    <h4 class="alert-heading">Success!</h4>
    Successfully created a new User.
  </div>
</c:if>
<c:if test="${isUpdateSuccess}">
  <div class="alert alert-success">
    <a class="close" data-dismiss="alert">×</a>
    <h4 class="alert-heading">Success!</h4>
    Successfully update record.
  </div>
</c:if>
<c:choose>
  <c:when test="${isEdit}">
    <c:url value="/secure/user/update" var="url"/>
    <c:set var="formTitle" value="Update User"></c:set>
  </c:when>
  <c:otherwise>
    <c:url value="/secure/user" var="url"/>
    <c:set var="formTitle" value="Add a User"></c:set>
  </c:otherwise>
</c:choose>

<form:form class="form-horizontal" action="${url}" method="post" modelAttribute="model">
  <div class="row">
    <label for="username" class="col-lg-4 control-label">Username</label>
    <div class="col-lg-5">
      <form:input path="username" class="form-control input-with-feedback" placeholder="Username" autofocus="autofocus"/>
      <span class="help-block"><form:errors path="username" /></span>
    </div>
  </div>
  <div class="row">
    <label for="password" class="col-lg-4 control-label">Password</label>
    <div class="col-lg-5">
      <form:input type="password" path="password" class="form-control input-with-feedback" placeholder="Password" />
      <span class="help-block"><form:errors path="password" /></span>
    </div>
  </div>
  <div class="row">
    <div class="col-lg-5 col-lg-offset-4">
      <c:if test="${isEdit}">
        <input type="hidden" name="id" value="${model.id}" />
      </c:if>
      <button type="submit" class="btn btn-large btn-primary"><i class="icon-save"></i> Save</button>
      <button type="reset" class="btn btn-large"><i class="icon-repeat"></i> Reset</button>
    </div>
  </div>
</form:form>
