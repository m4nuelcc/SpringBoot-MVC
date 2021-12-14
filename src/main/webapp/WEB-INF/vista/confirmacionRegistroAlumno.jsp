<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmacion del Registro</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/recursos/estilos/miestilo.css">
</head>
<body>

	<div align="center">
		El alumno con el nombre <strong>${elAlumno.nombre}</strong> y apellido
		<strong>${elAlumno.apellido}</strong> ${elAlumno.apellido} ha sido
		registrado satisfactoriamente
		
		
		<br><br>
		
		El usario: <strong style="color: green;">${elAlumno.nombre } </strong>  ha elegido la asignatura optativa <strong>${elAlumno.optativa }</strong>
		
		<br><br>
		
		<p>El Estudiante:  <strong class="color">${elAlumno.nombre } 
		</strong>  ha elegido la elegido Estudiar en: <strong>${elAlumno.ciudadEstudios }</strong>
		y los idioma Elegidos son <strong>${elAlumno.idiomasAlumno}</strong>
		</p>

	</div>
</body>
</html>