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
public class Ejercicio2_Serie_FactorialRecursividad {
    public static void main (String []args){
        // Pedimos las veces que se repetira nuestra serie
        double n = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de n"));
        // declaramos a f en double para que nuestra división sea correcta y le decimos que será igual a n * 2
        // esto ya que hara la función de llamar al factorial y este es el doble de nuestra variable 'n'
        double f=n*2;
        JOptionPane.showMessageDialog(null,"Resultado: "+calcularSerie(n,f)); 
    }
    //Hacemos un metodo para calcular nuestro factorial
    private static double factorial(double n){
        if (n == 1.0) {
            return 1.0;
        } else {
            double y = n * factorial(n - 1.0);
            System.out.println("Factorial es: "+y);
            return y;
        }
    }
    public static double calcularSerie(double n, double f){
        //Caso Base
            //Si n es igual a 1 se retornara la primer secuencia de la serie en este caso 1 entre factorial de 2
        if(n==1){
            
            return  1/factorial(f);
        }else{
            //Caso General
            return (n/factorial(f)) + calcularSerie(n-1.0,f-2.0);
        }
    }
}
