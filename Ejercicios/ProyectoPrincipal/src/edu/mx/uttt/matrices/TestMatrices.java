/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.matrices;

import edu.mx.uttt.arreglos.Operaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class TestMatrices {
    public static void main(String[] args) {
        String filas = JOptionPane.showInputDialog("Ingresa el tamaño de las filas");
        String columnas = JOptionPane.showInputDialog("Ingresa el tamaño de las columnas");
        String filas2 = JOptionPane.showInputDialog("Ingresa el tamaño de las filas");
        String columnas2 = JOptionPane.showInputDialog("Ingresa el tamaño de las columnas");
        if(validarValor(filas)&& validarValor(columnas) && validarValor(filas2)&& validarValor(columnas2)){
            OperacionesMatrices obj = new OperacionesMatrices(Integer.parseInt(filas),Integer.parseInt(columnas));
            OperacionesMatrices obj2 = new OperacionesMatrices(Integer.parseInt(filas2),Integer.parseInt(columnas2));
            
            obj.llenarMatriz();
            System.out.println("Matriz 1:");
            obj.imprimir();
            obj2.llenarMatriz();
            System.out.println("Matriz 2:");
            obj2.imprimir();
            //System.out.println("Suma: \n"+obj.suma(obj2.getMatriz()));
            //System.out.println("Suma: \n"+obj.totalVentas());
            System.out.println("Multi: \n"+obj.multiplicar(obj2.getMatriz()));
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Valores incorrectos");
        }
    }
    public static boolean validarValor(String tamanio){
        try{
            Integer.parseInt(tamanio);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    
    }
}
