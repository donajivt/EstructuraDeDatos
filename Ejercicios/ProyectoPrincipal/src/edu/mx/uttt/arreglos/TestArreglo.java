/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class TestArreglo {
    public static void main (String [] args){
        String tamanio = JOptionPane.showInputDialog("Ingresa el tamaño del arreglo");
        if(validarValor(tamanio)){
            Operaciones obj = new Operaciones(Integer.parseInt(tamanio));
            obj.llenarArreglo();
            obj.imprimir();
            obj.ordenarAsc();
            System.out.println(obj.imprimirBurbuja());
            obj.ordenarDesc();
            System.out.println(obj.imprimirBurbuja());
            
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
