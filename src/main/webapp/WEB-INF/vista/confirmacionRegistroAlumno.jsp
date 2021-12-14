<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmacion del Registro</title>
</head>
<body>

	<div align="center">
		El alumno con el nombre <strong>${elAlumno.nombre}</strong> y apellido
		<strong>${elAlumno.apellido}</strong> ${elAlumno.apellido} ha sido
		registrado satisfactoriamente
		
		
		<br><br>
		
		El usario: <strong style="color: green;">${elAlumno.nombre } </strong>  ha elegido la asignatura optativa <strong>${elAlumno.optativa }</strong>

	</div>
</body>
</html>