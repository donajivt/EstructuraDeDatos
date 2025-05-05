/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Ejercicio1_SerieCiclos {
    public static void main (String [] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de tu serie"));
        double sumador = 0;
        if(n>0){
            for(int i= 1; i <= n; i++){
                sumador = Math.pow(i, 2);
                System.out.println(sumador);
            }
            JOptionPane.showMessageDialog(null, "El resultado es: "+ sumador);
        }
        
    }
}
