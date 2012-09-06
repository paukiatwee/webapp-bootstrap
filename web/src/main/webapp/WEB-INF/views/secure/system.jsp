<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<h3>Product Information</h3>
<table class="list">
  <tr>
    <td>build.timestamp</td>
    <td><fmt:message key="build.timestamp" /></td>
  </tr>
  <tr>
    <td>git.commit.id</td>
    <td><fmt:message key="git.commit.id" /></td>
  </tr>
  <tr>
    <td>git.commit.id.abbrev</td>
    <td><fmt:message key="git.commit.id.abbrev" /></td>
  </tr>
  <tr>
    <td>git.commit.id.describe</td>
    <td><fmt:message key="git.commit.id.describe" /></td>
  </tr>
  <tr>
    <td>git.commit.time</td>
    <td><fmt:message key="git.commit.time" /></td>
  </tr>
</table>
<h3>Environment Variables</h3>
<table class="list">
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