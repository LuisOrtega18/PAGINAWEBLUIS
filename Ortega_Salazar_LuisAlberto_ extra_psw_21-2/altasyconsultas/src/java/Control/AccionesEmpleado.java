/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.*;
import java.util.*;
import Modelo.Empleado;

/**
 *
 * @author INSPIRON
 */
public class AccionesEmpleado {
    
    public static int registrarEmpleado(Empleado e){
        int estatus = 0;
        try{
            Connection con = Conexion.getConnection();
            String q = "insert into trabajadores(nom_tra, pass_tra, puesto_tra, sueldo_tra)"
                    +"values (?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getPassword());
            ps.setString(3, e.getPuesto());
            ps.setString(4, e.getSueldo());
            
            estatus = ps.executeUpdate();
            System.out.println("El registro del empleado fue exitoso");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Se produjo un error al registrar el empleado");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }
    
    public static Empleado buscarEmpleadoById(int id){
        Empleado e = new Empleado();
        try{
            Connection con = Conexion.getConnection();
            String q = "select * from trabajadores where id_tra = ?";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                e.setId(rs.getInt(1));
                e.setNombre(rs.getString(2));
                e.setPassword(rs.getString(3));
                e.setPuesto(rs.getString(4));
                e.setSueldo(rs.getString(5));
            }
            System.out.println("La busqueda del empleado fue exitosa");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Se produjo un error al buscar al empleado");
            System.out.println(ed.getMessage());
        }
        return e;
    }
    
    public static List<Empleado> getAllEmpleados(){
        List <Empleado> lista = new ArrayList<Empleado>();
        
        try{
            Connection con = Conexion.getConnection();
            String q = "select * from trabajadores";
            
            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Empleado e = new Empleado();
                e.setId(rs.getInt(1));
                e.setNombre(rs.getString(2));
                e.setPassword(rs.getString(3));
                e.setPuesto(rs.getString(4));
                e.setSueldo(rs.getString(5));
                lista.add(e);
            }
            System.out.println("La busqueda de los empleados fue exitosa");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Se produjo un error al buscar los empleados");
            System.out.println(ed.getMessage());
        }
        return lista;
    }
}
