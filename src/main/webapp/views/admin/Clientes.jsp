<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clientes</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.datatables.net/2.0.8/css/dataTables.dataTables.css" />
</head>
<body>
	<div
		class="d-flex flex-column m-3 justify-content-center align-items-center">
		<h1>Clientes</h1>
		<div class="container">
			<table id="example" class="display" style="width: 100%">
				<thead>
					<tr>
						<th>Username</th>
						<th>Name</th>
						<th>Email</th>
						<th>Active</th>
						<th>Role</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="usuario" items="${usuarios}" >
    					<tr>
							<td>${usuario.username}</td>
							<td>${usuario.name}</td>
							<td>${usuario.email}</td>
							<td>${usuario.active}</td>
							<td>${usuario.role}</td>
						</tr>
					</c:forEach>
				</tbody>
				<tfoot>
					<tr>
						<th>Username</th>
						<th>Name</th>
						<th>Email</th>
						<th>Active</th>
						<th>Role</th>
					</tr>
				</tfoot>
			</table>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	<script src="https://cdn.datatables.net/2.0.8/js/dataTables.js"></script>
	<script type="text/javascript">
    new DataTable('#example');
    </script>
</body>
</html>