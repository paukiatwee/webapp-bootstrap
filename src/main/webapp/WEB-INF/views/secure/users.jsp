<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${isDeleteSuccess}">
  <div class="alert alert-success">
    <a class="close" data-dismiss="alert">×</a>
    <h4 class="alert-heading">Success!</h4>
    Successfully delete record.
  </div>
</c:if>

<c:url value="/secure/user" var="url" />
<table class="table table-striped table-bordered table-condensed">
  <thead>
    <tr>
      <th class="id">#</th>
      <th>Username</th>
      <th>Enabled?</th>
      <th>Non Expired?</th>
      <th>Locked?</th>
      <th class="action">Action</th>
    </tr>
  </thead>
  <tbody>
    <c:if test="${empty list}">
      <tr><td colspan="11" style="text-align: center;"><h3>No record found, click <a href="${url}" />here</a> to add one</h3></td></tr>
    </c:if>
    <c:forEach items="${list}" var="model">
      <tr>
        <td class="id">${model.id}</td>
        <td>${model.username}</td>
        <td>${model.enabled}</td>
        <td>${model.accountNonExpired}</td>
        <td>${model.accountNonLocked}</td>
        <td class="action">
          <form action="${url}/${model.id}">
            <button type="submit" class="btn btn-primary btn-small"><span class="glyphicon glyphicon-edit"></span> Edit</button>
            <button type="button" data-id="${model.id}" class="btn btn-small btn-danger delete"><i class="icon-trash icon-white"></i> Delete</button>
          </form>
        </td>
      </tr>
    </c:forEach>
  </tbody>
</table>
