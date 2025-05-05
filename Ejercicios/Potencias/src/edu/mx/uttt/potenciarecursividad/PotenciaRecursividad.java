/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.potenciarecursividad;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class PotenciaRecursividad {
    public static void main (String [] args){
        String b = JOptionPane.showInputDialog("Coloca la base de la potencia: ");
        int base = Integer.parseInt(b);
        String n = JOptionPane.showInputDialog("Coloca el exponente de la potencia: ");
        int exponente = Integer.parseInt(n);
        
        JOptionPane.showMessageDialog(null,"El resultado de la potencia es: "+potencia(base,exponente));
    
    }
    public static int potencia (int base, int exponente){
       if (exponente>=0 && base>0){
        if (exponente == 0) return 1;
        if (base == 1) return base;
        return base * potencia(base,(exponente-1));
    } else {
        return 0;
    } 
    }
}
