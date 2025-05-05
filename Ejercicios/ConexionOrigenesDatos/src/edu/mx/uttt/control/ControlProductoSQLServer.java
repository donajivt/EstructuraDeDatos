/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.control;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import edu.mx.uttt.conexionsqlserver.ConexionSQLServer;
/**
 *
 * @author vania
 */
public class ControlProductoSQLServer {
    public static void consultar(){
        Connection con =ConexionSQLServer.conectar();
        String query ="select productoid,descripcion, precio, stock from producto";
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);  
            while(rs.next()){
                System.out.println("ProductoId: "+rs.getInt("productoid")+
                        "   Descripcion: "+rs.getString("descripcion")+
                        "   Precio: "+rs.getDouble("precio")+
                        "   Stock: "+rs.getInt("stock"));
            }
        }catch(SQLException e){
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            ConexionSQLServer.desconectar();
        }
    }
}
