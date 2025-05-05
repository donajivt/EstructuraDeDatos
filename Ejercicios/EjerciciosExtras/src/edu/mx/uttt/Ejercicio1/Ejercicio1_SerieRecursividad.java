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
public class Ejercicio1_SerieRecursividad {

    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("Coloca un numero: ");
        int n = Integer.parseInt(x);
        JOptionPane.showMessageDialog(null, "El resultado es: "+ serie1(n));

    }

    public static double serie1(int n) {

        if (n == 1) {

            return 1;
        } else {
            serie1(n - 1);
            return Math.pow(n, 2);
        }
    }
}
