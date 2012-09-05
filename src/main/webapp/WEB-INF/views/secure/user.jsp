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
  <fieldset>
    <legend>${formTitle}</legend>
    <div class="control-group">
      <label class="control-label" for="username">Username</label>
      <div class="controls">
        <form:input path="username" placeholder="Username" autofocus="autofocus"/>
        <span class="help-inline"><form:errors path="username" /></span>
      </div>
    </div>
    <div class="control-group">
      <label class="control-label" for="password">Password</label>
      <div class="controls">
        <form:input type="password" path="password" placeholder="Password" />
        <span class="help-inline"><form:errors path="password" /></span>
      </div>
    </div>
    <div class="form-actions">
      <c:if test="${isEdit}">
          <input type="hidden" name="id" value="${model.id}" />
      </c:if>
      <button type="submit" class="btn btn-large btn-primary"><i class="icon-save"></i> Save</button>
      <button type="reset" class="btn btn-large"><i class="icon-repeat"></i> Reset</button>
    </div>
  </fieldset>
</form:form>
