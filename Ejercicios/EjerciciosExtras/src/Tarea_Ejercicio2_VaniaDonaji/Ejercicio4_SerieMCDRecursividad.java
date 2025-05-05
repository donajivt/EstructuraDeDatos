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
public class Ejercicio4_SerieMCDRecursividad {
    public static void main (String [] args){
        int v1= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el divisor: "));
        int v2= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dividendo: "));
        
        JOptionPane.showMessageDialog(null,"El MCD es: " +mcd(v1,v2)); 
    }
    public static int mcd(int divisor, int dividendo){
        if(dividendo == 0){
            return divisor;
        }else{
            return mcd(dividendo,divisor%dividendo);
        }
    }
}
