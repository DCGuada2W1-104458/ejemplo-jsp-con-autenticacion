<%-- 
    Document   : altaServicio
    Created on : 02/10/2020, 11:43:30
    Author     : mnava
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Alta Servicio</h1>

		<form method="POST" action="/EjemploJSPconAutenticacion/AltaServicioServlet"> 
			<label for="txtTipo">Tipo</label>
			<input type="text" name="txtTipo"/>
			<label for="txtDescripcion">Descripcion</label>
			<input type="text" name="txtDescripcion"/>
			<label for="txtCosto">Costo</label>
			<input type="number" name="txtCosto"/>

			<input type="submit" value="Enviar" />
		</form>
    </body>
</html>
