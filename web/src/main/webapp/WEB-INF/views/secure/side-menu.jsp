<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<ul class="nav nav-list">
  <li class="nav-header">Home</li>
  <li><a href="<c:url value="/secure/home" />"><i class="icon-home"></i>Dashboard</a></li>
  <li><a href="<c:url value="/secure/profile" />"><i class="icon-user"></i>Profile</a></li>
  <li><a href="<c:url value="/secure/settings" />"><i class="icon-cog"></i>Settings</a></li>
  <li class="nav-header">Users</li>
  <li><a href="<c:url value="/secure/user" />"><i class="icon-group"></i>User</a></li>
  <li><a href="<c:url value="/secure/users" />"><i class="icon-list"></i>List of Users</a></li>
  <li class="nav-header">System</li>
  <li><a href="<c:url value="/secure/system" />"><i class="icon-cogs"></i>System Properties</a></li>
</ul>
