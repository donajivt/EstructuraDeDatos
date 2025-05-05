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
public class Ejercicio2_SerieRecursividad {

    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("Coloca el numero que quieres que se repita la serie: ");
        int n = Integer.parseInt(x);
        double v = 3.0;
        double c = 1.0;
        double y = 3.0;
        int i = 1;
        JOptionPane.showMessageDialog(null, "El resultado es: " + serie3(n, y, v, c, i));
        //serie2(n);
    }

    public static double serie2(int n) {
        int c = 1;
        int v = 3;
        if (n == 1) {
            double x = (Math.pow(n, 3 / v) / c);
            return x;
        }
        c += 2;
        v += 3;
        double x = (Math.pow(n, 3 / v) / c);
        System.out.println(v);
        System.out.println(c);
        System.out.println(n);
        System.out.println(x);
        return x + serie2(n);
    }

    public static double serie3(int n, double x, double v, double c, int i) {

        if (i == n) {
            return Math.pow(x, 3.0 / v) / c;
        } else {

            return (Math.pow(x, 3.0 / v) / c) + serie3(n, x, v + 3, c + 2, i + 1);
        }
    }
}
