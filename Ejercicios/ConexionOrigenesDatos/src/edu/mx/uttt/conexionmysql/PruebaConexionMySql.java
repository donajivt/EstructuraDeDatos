/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.conexionmysql;
import edu.mx.uttt.control.Controlproducto;
import edu.mx.uttt.listasimple.*;
import edu.mx.uttt.entidades.Producto;
import javax.swing.JOptionPane;
/**
 *
 * @author vania
 */
public class PruebaConexionMySql {
    public static void main(String[] args) {
        Lista list = null;
        list = Controlproducto.consultar();
        imprimir(list);
        crear(list);
        list = Controlproducto.consultar();
        imprimir(list);
    }
    public static void imprimir(Lista list){
        
        NodoLista aux = list.getPrimerNodo();
        
        while(aux != null){
            Producto pr = (Producto)aux.getDato();
            System.out.println("ID: "+pr.getId()+"\tDESCRIPCIÓN: "+pr.getDescripcion()+"\tPRECIO: "+pr.getPrecio()+"\tSTOCK: "+pr.getStock());
            aux = aux.getSigNodo();
        }
    }
    public static void crear(Lista list){
        Producto pr = new Producto();
        pr.setDescripcion("Papas Fritas");
        pr.setPrecio(22.5);
        pr.setStock(29);
        list.insertarAlFrente(pr);
        if(Controlproducto.agregar(list)){
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "ERROR al Insertar");
        }
    }
}
