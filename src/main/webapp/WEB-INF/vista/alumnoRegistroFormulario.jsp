<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!--  libreria de jsp Tags    -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de Registro</title>
</head>
<body>

	<!-- 	elAlumno es el modelo del AlumnoController -->
	<form:form action="procesarFormulario" modelAttribute="elAlumno">
		
<!-- 		hace referencia al getter o setter de la clase alumno -->
		Nombre <form:input path="nombre"/>
		
		<br><br>
		
		Apellido <form:input path="apellido"/>
		
		<br><br>
		
		<input type="submit" value="Enviar">

	</form:form>

</body>
</html>