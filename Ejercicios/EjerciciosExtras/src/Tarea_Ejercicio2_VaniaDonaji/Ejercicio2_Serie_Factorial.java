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
public class Ejercicio2_Serie_Factorial {
    public static void main (String [] args){
        // Pedimos el numero que se repetira la serie
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de n"));
        // Mandamos llamar nuestro metodo para calcular la serie correspondiente e imprimimos nuestro resultado
        JOptionPane.showMessageDialog(null, "El resultado es: "+serieDivision(n));
    }
    // Hacemos un método para calcular el factorial
    public static long serieFactorial(int n){
        // n es el numero a sacar el factorial
        long fact=1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        // imprimimos la variable fact donde se acumula el resultado del factorial para comprobar que este correcto
        System.out.println("Factorial: "+fact);
        
        // retornamos el factorial de n
        return fact;
    }
    // Hacemos un método para calcular la serie, donde n es las veces que se repetira la serie
    public static double serieDivision(int n){
        // inicializamos nuestro sumador del resultado de la serie
        double s=0;
        double t=0;
        // le decimos que f es igual a 2, ya que nuestro factorial va de 2 en 2 en nuestra serie
        int f=2;
        for(double i = 1; i <=n; i++){
            // Hacemos nuestra operacion, mandando a f en el metodo para sacar el factorial
            s+=i/serieFactorial(f);
            // hago esta operación para ver mi operación sin la suma y saber si esta correcta cada división.
            t=i/serieFactorial(f);
            //sumamos de 2 en 2 el factorial de nuestra serie
            f+=2;
            // imprimimos para checar que este bien según nuestra prueba de escritorio.
            System.out.println("Resultado: "+s);
            System.out.println(t);
        }
        // retornamos nuestro sumador.
        return s;
    }
    
}
