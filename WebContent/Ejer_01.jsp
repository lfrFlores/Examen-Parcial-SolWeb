<%@page import="java.util.List"%>
<%@page import="beans.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
	td{
		text-align: center;
	}
	h1{
		color: blue;
	}
</style>

</head>
<body>

<%

CiudadService cs= new CiudadService();
List<Ciudad> ciudades = cs.ciudades();
pageContext.setAttribute("listCiudades", ciudades);

%>


<center>
	<h1>Listado de Ciudades</h1>
</center>
<div>
	<table   style="width:100%"class="table" border=2>
		<tr>
			<th>
				Id
			</th>
			<th>
				Nombre
			</th>
			<th>
				Poblacion
			</th>
		</tr>
		<c:forEach var="ciudad" items="${ listCiudades}">
			<tr>
				<td>
				<c:out value="${ciudad.id}"/>
				</td>
				<td>
				<c:out value="${ciudad.nombre}"/>
				</td>
				<td>
				<c:out value="${ciudad.poblacion}"/>
				</td>
			</tr>
		</c:forEach>
	</table>

</div>

</body>
</html>