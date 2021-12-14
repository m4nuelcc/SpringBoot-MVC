<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!--  libreria de jsp Tags    -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de Registro</title>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/recursos/estilos/miestilo.css">
</head>
<body>

	<!-- 	elAlumno es el modelo del AlumnoController -->
	<form:form action="procesarFormulario" modelAttribute="elAlumno">

		<!-- 		hace referencia al getter o setter de la clase alumno -->
		Nombre <form:input path="nombre" />

		<br>
		<br>
		
		Apellido <form:input path="apellido" />

		<br>
		<br>
		
		Asignatura Optativa
		
		<br>
		<br>

		<!-- 		con multiple se puede seleccionar varias options -->
		<form:select path="optativa" multiple="true">

			<form:option value="Danza" />
			<form:option value="Karate" />
			<form:option value="Comercio" />
			<form:option value="Manualidades" />

		</form:select>

		<br>
		<br>
		<div>
			<div>
				Madrid
				<form:radiobutton path="ciudadEstudios" value="Madrid" />
				Barcelona
				<form:radiobutton path="ciudadEstudios" value="Barcelona" />
				Lanzarote
				<form:radiobutton path="ciudadEstudios" value="Lanzarote" />
				Alicnate
				<form:radiobutton path="ciudadEstudios" value="Alicante" />
			</div>
			
			<div  >
			
				Ingles <form:checkbox path="idiomasAlumno" value="Ingles"/>		
				Frances <form:checkbox path="idiomasAlumno" value="Frances"/>	
				Aleman <form:checkbox path="idiomasAlumno" value="Aleman"/>	
				Chino <form:checkbox path="idiomasAlumno" value="Chino"/>		

			
			</div>
		</div>


		<br>
		<br>


		<input type="submit" value="Enviar">

	</form:form>

</body>
</html>