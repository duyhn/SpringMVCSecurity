<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<sec:authorize var="loggedIn" access="isAuthenticated()" />
<c:choose>
    <c:when test="${loggedIn}">
    	<c:url value="/j_spring_security_logout" var="logoutUrl" />
        You are loged in:<a href="${logoutUrl}">logout</a>
    </c:when>
    <c:otherwise>
        You are logged out
    </c:otherwise>
</c:choose>
<h2>Header- Employee Management System</h2>