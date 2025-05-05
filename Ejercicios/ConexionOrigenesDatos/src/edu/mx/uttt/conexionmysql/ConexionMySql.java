/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.conexionmysql;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author vania
 */
public class ConexionMySql {
    private static Connection con;
    
    public static Connection conectar(){
        try{
            String url="jdbc:mysql://localhost/bdconexionsql";
            String user = "root";
            String pass = "1234";
            
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion satisfactoria a la bd");
        }catch (SQLException e){
            System.out.println("Error " + e.getMessage());
        }
        return con;
    }
    public static void desconectar(){
        try{
            con.close();
            System.out.println("La conexión se cerro");
        }catch(SQLException e){
            System.out.println("ERROR: "+e.getMessage());
        }
    }
}
