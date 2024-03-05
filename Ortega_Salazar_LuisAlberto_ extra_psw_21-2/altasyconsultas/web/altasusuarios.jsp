<%-- 
    Document   : altasusuarios
    Created on : 17/06/2021, 10:40:39 AM
    Author     : INSPIRON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Alta</h1>
        <div class="container">
            <div class="registroEmpleado">
                <form method="post" name="registroempleado" action="guardarEmpleado">
                    <table border="2">
                        <tr>
                            <td>Nombre:</td>
                            <td> <input type="text" name="nombre" size="35"> </td>
                        </tr>
                        <tr>
                            <td>Contraseña:</td>
                            <td> <input type="password" name="password" size="35"> </td>
                        </tr>
                        <tr>
                            <td>Puesto</td>
                            <td> <select name="puesto">
                                    <option>Gerente</option>
                                    <option>Pasante</option>
                                    <option>Oficinista</option>
                                </select> 
                            </td>
                        </tr>
                        <tr>
                            <td>Sueldo:</td>
                            <td> <input type="sueldo" name="sueldo" size="35"> </td>
                        </tr>
                        
                        <tr>
                            <td colspan="2"><input type="submit"
                                                   value="Alta"></td>
                        </tr>
                    </table>
                </form>
            </div>
            <br>
            <div class="containeregreso">
                <a href="index.html">Regresar al menu</a>
                
            </div>
        </div>
    </body>
</html>
