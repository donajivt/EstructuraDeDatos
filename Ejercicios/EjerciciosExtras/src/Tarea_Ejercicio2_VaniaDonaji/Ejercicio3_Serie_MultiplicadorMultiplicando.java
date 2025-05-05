/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_Ejercicio2_VaniaDonaji;

import static java.lang.Math.round;
import javax.swing.JOptionPane;
import static pruebas.MultiplicacionCiclica.multiplicacionCiclica;

/**
 *
 * @author vania
 */
public class Ejercicio3_Serie_MultiplicadorMultiplicando {


    public static void main(String[] args) {
        //Pedimos los valores
        int multiplicando = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor inicial de Multiplicando"));
        int multiplicador = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor inicial de Multiplicador"));
        int resultado = sumaImpares(multiplicando, multiplicador);
        //Lo iniciamos en un ciclo While
        // En este ciclo solo entra si se cumple la condición, en este caso el multiplicador debe ser mayor a dos
        // si el multiplicador llega a ser menor a dos, el ciclo se cierra.
        serie(multiplicando, multiplicador);
        JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
    }
    public static void serie(int multiplicando, int multiplicador){
        int suma = 0;
        while (multiplicador > 1) {
            
            // Multiplicamos a multiplicando y lo imprimimos para verificar los resultados
            multiplicando *= 2;
            // volvemos a redondear cada que lo llame el ciclo ya que es una división y sale punto decimal
            System.out.println("multiplicando " + multiplicando);
            // Dividimos a multiplicador y lo imprimimos para verificar los resultados
            multiplicador /= 2;
            System.out.println("multiplicador " + multiplicador);
        }
        //Imprimimos el resultado correcto
        JOptionPane.showMessageDialog(null, "Multiplicando: " + multiplicando + "\nMultiplicador: " + multiplicador);
    }
    //Realizamos un metodo para sumar los numeros del multiplicando, cada que el multiplicador sea impar
    public static int sumaImpares(long multiplicando, long multiplicador) {
        int resultado = 0;
        while (multiplicador > 0) {
            if (multiplicador % 2 != 0) {
                resultado += multiplicando;
            }
            multiplicando *= 2;
            multiplicador /= 2;
        }
        return resultado;
    }

}
