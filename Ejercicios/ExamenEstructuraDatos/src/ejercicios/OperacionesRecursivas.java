/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class OperacionesRecursivas {
    public static double ejercicio1(int n){
        if(n==1){
            return Math.pow(n, 3)/(n*(n+1));
        }
        else{
            
            return  Math.pow(n, 3)/(n*(n+1)) + ejercicio1(n-1);
        }
    }
    public static double ejercicio2(int n){
        if(n==1){
            return Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion"));
            
        } 
        else{
            return Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion"))+ ejercicio2(n-1);
        }
    }
    public static double calcularEjercicio(int n){
        return ejercicio2(n)/n;
    }
}
