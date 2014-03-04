<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table class="list">
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
  <c:forEach items="${list}" var="model">
    <tr>
      <td class="id">${model.id}</td>
      <td>${model.username}</td>
      <td>${model.enabled}</td>
      <td>${model.accountNonExpired}</td>
      <td>${model.accountNonLocked}</td>
      <td class="action">
        <a class="btn btn-primary btn-sm" href="/secure/users/${model.id}">
          <span class="glyphicon glyphicon-edit"></span> Edit
        </a>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>