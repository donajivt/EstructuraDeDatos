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
public class Ejercicio1_SerieRecursividad {
    public static void main (String [] args){
        // Pedimos las veces que se repetira nuestra serie
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de n"));
        // declaramos a i en double para que nuestra división sea correcta y la inicializamos en 1.0
        double i=1;
        //Mandamos llamar nuestro metodo e imprimimos el resultado
        JOptionPane.showMessageDialog(null, "El resultado es: "+serieDivision(n,i));
    }
    // Creamos nuestro metodo dandole 2 parametros, en este caso 'n' e 'i'
    public static double serieDivision(int n, double i){
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
            return 1/i + serieDivision(n-1,i+1);
        }
    }
}
