/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.recursividad;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Recursividad {

    public static int factorialRecursividad(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialRecursividad(n - 1);
        }
    } 
    public static double serie1(int n) {

        if (n == 1) {

            return 1;
        } else {
            serie1(n - 1);
            return Math.pow(n, 2);
        }
    }
    public static double serieDivision2(int n, double i){
        //Caso Base
            // si n es igual a 1, solo retornará nuestra operación 1/1
        if(n==1){
            return 1/i;
        }
        // Caso General
            // si n es diferente a 1 entra a este caso
        else{
            //Retorna a 1/i y se llamará nuevamente al método restandole 1 a n y sumandole 1 a i
            // esto hasta que n sea igual a 1 y empiece a retornar los resultados y nos de el que buscamos.
            return 1/i + serieDivision2(n-1,i+1);
        }
    }
    

    public static double serie3(int n, double x, double v, double c, int i) {

        if (i == n) {
            return Math.pow(x, 3.0 / v) / c;
        } else {

            return (Math.pow(x, 3.0 / v) / c) + serie3(n, x, v + 3, c + 2, i + 1);
        }
    }
    private static double factorial(double n){
        if (n == 1.0) {
            return 1.0;
        } else {
            double y = n * factorial(n - 1.0);
            System.out.println("Factorial es: "+y);
            return y;
        }
    }
    public static double calcularSerie5(double n, int f){
        //Caso Base
            //Si n es igual a 1 se retornara la primer secuencia de la serie en este caso 1 entre factorial de 2
        if(n==1){
            
            return  1/factorialRecursividad(f);
        }else{
            //Caso General
            return (n/factorialRecursividad(f)) + calcularSerie5(n-1.0,f-2);
        }
    }
    public static void serie2(int multiplicador, int multiplicando){
        if(multiplicador < 2){
            JOptionPane.showMessageDialog(null,"Multiplicador: "+ multiplicador+"\nMultiplicando: "+multiplicando);
        }
        else{
            serie2(multiplicador/2,multiplicando*2);
            JOptionPane.showMessageDialog(null, "Multiplicando: "+multiplicador+"\nMultiplicador: "+multiplicando);
        }
    }
    public static int sumaImparRecursivo(int multiplicando, int multiplicador) {
        if (multiplicador == 0) {
            return 0;
        }
        if (multiplicador % 2 == 0) {
            return sumaImparRecursivo(multiplicando * 2, multiplicador / 2);
        }
        return multiplicando + sumaImparRecursivo(multiplicando * 2, multiplicador / 2);
    }
    public static int mcd(int divisor, int dividendo){
        if(dividendo == 0){
            return divisor;
        }else{
            return mcd(dividendo,divisor%dividendo);
        }
    }
    public static double ejercicio1(int n){
        if(n==1){
            return Math.pow(n, 3)/(n*(n+1));
        }
        else{
            
            return  Math.pow(n, 3)/(n*(n+1)) + ejercicio1(n-1);
        }
    }
    private static double ejercicio2(int n){
        if(n==1){
            return Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion"));
            
        } 
        else{
            return Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion"))+ ejercicio2(n-1);
        }
    }
    public static double calcularEjercicio2(int n){
        return ejercicio2(n)/n;
    }
    public static int potencia(int base, int exponente) {
        if (exponente >= 0 && base > 0) {
            if (exponente == 0) {
                return 1;
            }
            if (base == 1) {
                return base;
            }
            return base * potencia(base, (exponente - 1));
        } else {
            return 0;
        }
    }
}
