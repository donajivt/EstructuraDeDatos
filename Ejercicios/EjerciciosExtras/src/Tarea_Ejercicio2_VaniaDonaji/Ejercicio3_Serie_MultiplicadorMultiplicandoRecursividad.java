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
public class Ejercicio3_Serie_MultiplicadorMultiplicandoRecursividad {
    public static void main (String []args){
        int multiplicando = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor inicial de Multiplicando"));
        int multiplicador = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor inicial de Multiplicador"));
        
        calcular(multiplicador,multiplicando);
        JOptionPane.showMessageDialog(null, "La suma es: "+sumaImparRecursivo(multiplicando, multiplicador));
    }
    public static void calcular(int multiplicador, int multiplicando){
        if(multiplicador < 2){
            JOptionPane.showMessageDialog(null,"Multiplicador: "+ multiplicador+"\nMultiplicando: "+multiplicando);
        }
        else{
            calcular(multiplicador/2,multiplicando*2);
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
}
