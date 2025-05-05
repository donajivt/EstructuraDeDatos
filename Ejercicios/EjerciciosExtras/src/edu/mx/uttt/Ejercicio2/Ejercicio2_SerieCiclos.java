/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.Ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Ejercicio2_SerieCiclos {
    public static void main (String [] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de tu serie"));
        double sumador = 0;
        int expo = 3;
        int t = 1;
        if(n>0){
            for(int i= 1; i <= n; i++){
                sumador += (Math.pow(i, 3/expo))/t;
                System.out.println(sumador);
                expo +=3;
                t +=2;
            }
            JOptionPane.showMessageDialog(null, "El resultado es: " + sumador);
        }
        
    }
}
