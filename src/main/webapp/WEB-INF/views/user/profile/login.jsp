<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h2>Login</h2>
<form action= "<c:url value='/j_spring_security_check' />"  method="post">
	<table>
	<tr>
		<td> Name:</td>
		<td> <input type="text" name="j_username" /></td>
	</tr>
	<tr>
		<td>Phone:</td>
		<td> <input type="password" name="j_password"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="Login" />
	</tr>
</table>
</form>