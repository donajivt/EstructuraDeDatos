/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.conexionsqlserver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author vania
 */
public class ConexionSQLServer {
    private static Connection con;
    public static Connection conectar(){
       String url = "jdbc:sqlserver://localhost:1433;databaseName=bdconexionsqlserver;user=sa;password=1234;TrustServerCertificate=True";

        try{
            con = DriverManager.getConnection(url);
            System.out.println("Coneccion a SQLServer exitosa");
        }catch(SQLException e){
            System.out.println("ERROR: "+e.getMessage());
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
