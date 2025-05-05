/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_Ejercicio2_VaniaDonaji;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Ejercicio1_Serie {
    public static void main (String [] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de n"));
        JOptionPane.showMessageDialog(null, "El resultado es: "+serie1(n));
    }
    public static double serie1(int n){
        double s=0;
        for(double i=1.0; i<=n; i++){
            s += (1/i);
            System.out.println(s);
        }
        return s;
    }
}
