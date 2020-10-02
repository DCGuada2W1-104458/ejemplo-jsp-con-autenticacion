# Ejercicio #

Se nos ha solicitado el desarrollo de una aplicación web que permita gestionar información de los servicios registrados.

Las páginas del proyecto son:

index.jsp: permite que el usuario se loguee mediante un usuario y contraseña. 
El usuario y contraseña es: tecni/tecni. 
En el caso de ingresar los datos correctos permite visualizar la página menu.jsp, en caso contrario informar un mensaje de error al usuario.

menu.jsp: muestra las opciones de acceso de la aplicación:

* Alta de Servicio

* Listado de Servicios

* Estadísticas

altaServicio.jsp: permite visualizar los campos necesarios para dar de alta un determinado servicio.

listado.jsp: muestra un listado de servicios registrados.

reportes.jsp: muestra la siguiente información:

* Número de servicios registrados.

* Total en concepto de importe por cada servicio.
El proyecto web, en la carpeta Source Package, debe respetar la siguiente estructura:

* Paquete Base de Datos- AccesoBaseDatos.java: contiene la lógica para poder acceder a la BD Gestoría y los métodos necesarios para la registración y procesamiento de los servicios registrados.
* Paquete Modelo- Servicio.java: contiene los siguientes atributos: número (int), tipo (), descripción (String)y costo (double).
* Paquete Servlets- ServicioServlet.java: contiene la lógica necesaria que permite identificar de que página se originó la petición y permite su procesamiento.

La Base de Datos que se usará para realizar la práctica se llama: Gestoria

SERVICIOS
id int (PK) IDENTITY
tipo varchar(50)
descripcion varchar(50)
costo real
