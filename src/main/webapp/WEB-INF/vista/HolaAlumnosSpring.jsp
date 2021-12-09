<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" content="text/html">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/miestilo.css">
</head>
<body>
	<h1 align="center">Hola ${param.nombreAlumno} Bienvenido al curso de spring </h1>

	<h2 align="center">ATENCION A TODOS</h2>
	<p align="center">${miMensaje} 2021</p>
	
<%-- 		 ${pageContext.request.contextPtath} nos devuelve la raiz de nuestro sitio web   --%>
	
	<img alt="foto" align="top" src="${pageContext.request.contextPath}/recursos/imgs/karakol.jpg">

</body>
</html>