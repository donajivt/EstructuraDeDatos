/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.ciclosyrecursividad;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Ciclos {

    public static void factorialFor() {
        boolean sentinel = true;
        do {
            try {
                int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del factorial a calcular: "));
                long fact = 1;
                if (n > 0) {
                    for (int i = 1; i <= n; i++) {
                        fact *= i;
                    }
                    JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + fact);
                    sentinel = false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Datos no validos ");
                System.out.println(e);
            }
        } while (sentinel);
    }

    public static void factorialDoWhile() {
        boolean sentinel = true;
        do {
            try {
                int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del factorial a calcular: "));
                long fact = 1;
                if (n > 0) {
                    int i = 1;
                    do {
                        fact *= i;
                        i++;
                    } while (i <= n);
                    JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + fact);
                    sentinel = false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Datos no validos ");
                System.out.println(e);
            }
        } while (sentinel);
    }
    public static double serie1(){
        int n = 2 ;
        double x = 3.0, den1 =3.0, den2 =1.0;
        double r = serieCiclica(x,n,den1,den2);
        return r;
    }
    private static double serieCiclica(double x, int n, double den1, double den2){
        int i= 1;
        double r= 0;
        do{
            r+=Math.pow(x, 3.0/den1)/den2;
            
            den1+=3;
            den2+=2;
            i++;
        }while(i<=n);
        
        return r;
    }
}
