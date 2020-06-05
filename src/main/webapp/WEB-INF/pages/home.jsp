<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<style>
.grid {
	display: flex;
	border: 1px white solid;
}

.box {
	background-color: green;
	color: white;
	border: 1px white solid;
	flex: 1;
}

ul {
	list-style-type: none;
}
</style>

<html lang="en">
<title>XYZ Company Details</title>

<body>

	<header id="header">
		<img src="<c:url value='logo.JPG'/>" alt="">
	</header>

	<section>
		<h3>Employee Details</h3>
	</section>

	<c:if test="${not empty lists}">
		<c:forEach var="listValue" items="${lists}">
			<div class="grid">
				<div class="box">
					<ul>
						<li>Id: ${listValue.id}</li>
						<li>First Name: ${listValue.firstName}</li>
						<li>Last Name: ${listValue.lastName}</li>
					</ul>
				</div>
				<div class="box">
					<ul>
						<li>Age: ${listValue.age}</li>
						<li>Joining Date: ${listValue.doj}</li>
						<li>Dept: ${listValue.department}</li>
						<li>Salary: Rs.${listValue.salary}</li>
					</ul>
				</div>
				<div class="box">
					<ul>
						<li>Projects:</li>
						<c:if test="${not empty listValue.projects}">
							<c:forEach var="project" items="${listValue.projects}">${project.name},</c:forEach>
						</c:if>
					</ul>
				</div>
			</div>
			<br>
		</c:forEach>
		<%
			Integer pageNo = (Integer) session.getAttribute("pageNo");
				if (pageNo >= 3) {
		%>
		<a href="/xyz" type=submit style="color: black">More</a>
		<%
			session.setAttribute("pageNo", pageNo + 3);
				}
		%>
	</c:if>




</body>

</html>