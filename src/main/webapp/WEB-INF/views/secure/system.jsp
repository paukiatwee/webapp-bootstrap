<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table class="table table-striped table-bordered table-condensed">
  <thead>
    <tr>
      <th>Key</th>
      <th>Value</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${properties}" var="property">
      <tr>
        <td>${property.key}</td>
        <td>${property.value}</td>
      </tr>
    </c:forEach>
  </tbody>
</table>