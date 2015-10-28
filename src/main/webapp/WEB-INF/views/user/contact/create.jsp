<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h2>Create contact</h2>
<form:form method="POST" commandName="contact">
	<table>
	<tr>
		<td> Name:</td>
		<td> <form:input path="name" /></td>
	</tr>
	<tr>
		<td>Phone:</td>
		<td> <form:input path="phone"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="submit" />
	</tr>
</table>
</form:form>