/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.control;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import edu.mx.uttt.conexionmysql.ConexionMySql;
import edu.mx.uttt.listasimple.*;
import edu.mx.uttt.entidades.Producto;
/**
 *
 * @author vania
 */
public class Controlproducto {
    
    public static Lista consultar(){
        Connection con =ConexionMySql.conectar();
        String query ="select productoid,descripcion, precio, stock from producto";
        Lista list = new Lista();
        try{
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);  
            while(rs.next()){
                Producto pr = new Producto();
                pr.setId(rs.getInt("productoid"));
                pr.setDescripcion(rs.getString("descripcion"));
                pr.setPrecio(rs.getDouble("precio"));
                pr.setStock(rs.getInt("stock"));
                
                
//                System.out.println("ProductoId: "+rs.getInt("productoid")+
//                        "   Descripcion: "+rs.getString("descripcion")+
//                        "   Precio: "+rs.getDouble("precio")+
//                        "   Stock: "+rs.getInt("stock"));

                list.insertarAlFinal(pr);

            }
        }catch(SQLException e){
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            ConexionMySql.desconectar();
        }
        return list;
    }
    public static boolean agregar(Lista list){
        String sql = "insert into producto (descripcion,precio,stock) values(?,?,?)";
        try{
            Connection con = ConexionMySql.conectar();
            PreparedStatement st = con.prepareStatement(sql);
            Producto pr =(Producto) list.getPrimerNodo().getDato();
            
            st.setString(1, pr.getDescripcion());
            st.setDouble(2, pr.getPrecio());
            st.setInt(3, pr.getStock());
            
            System.out.println(st.executeUpdate());
            
            return true;
        }catch(SQLException e){
            System.out.println("ERROR: "+e.getMessage());
            return false;
        }
    }
}
