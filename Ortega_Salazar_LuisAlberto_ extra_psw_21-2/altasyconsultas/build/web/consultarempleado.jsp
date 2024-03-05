<%-- 
    Document   : consultarempleado
    Created on : 17/06/2021, 10:37:25 AM
    Author     : INSPIRON
--%>

<%@page import="Control.AccionesEmpleado"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabla de todos los empleados</h1>
        <br>
        <table border="2">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Contrasena</th>
                    <th>Puesto</th>
                    <th>Sueldo</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Empleado> lista = AccionesEmpleado.getAllEmpleados();
                    for (Empleado e :lista){
                    %>
                    <tr>
                        <td><%=e.getId() %> </td>
                        <td><%=e.getNombre() %> </td>
                        <td><%=e.getPassword() %> </td>
                        <td><%=e.getPuesto() %> </td>
                        <td><%=e.getSueldo() %> </td>
                    </tr>
                    <%
                    }
                    %>    
            </tbody>
        </table>
        <br>
        <a href="index.html">Regresar al Menu Principal</a>
    </body>
</html>
