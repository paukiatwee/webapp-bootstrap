<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<ul class="nav nav-pills nav-stacked side">
  <li class="nav-header">Home</li>
  <li><a href="<c:url value="/secure/home" />"><span class="glyphicon glyphicon-home"></span> Dashboard</a></li>
  <li><a href="<c:url value="/secure/profile" />"><span class="glyphicon glyphicon-user"></span> Profile</a></li>
  <li><a href="<c:url value="/secure/settings" />"><span class="glyphicon glyphicon-cog"></span> Settings</a></li>
  <li class="nav-header">Users</li>
  <li><a href="<c:url value="/secure/user" />"><i class="icon-group"></i>User</a></li>
  <li><a href="<c:url value="/secure/users" />"><span class="glyphicon glyphicon-list"></span> List of Users</a></li>
  <li class="nav-header">System</li>
  <li><a href="<c:url value="/secure/system" />"><i class="icon-cogs"></i>System Properties</a></li>
</ul>
