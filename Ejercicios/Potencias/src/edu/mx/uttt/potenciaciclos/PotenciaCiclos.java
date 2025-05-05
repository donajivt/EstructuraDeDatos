/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.potenciaciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class PotenciaCiclos {
    public static void main (String [] args){
        String b = JOptionPane.showInputDialog("Coloca la base de la potencia: ");
        int base = Integer.parseInt(b);
        String n = JOptionPane.showInputDialog("Coloca el exponente de la potencia: ");
        int exponente = Integer.parseInt(n);
        
        JOptionPane.showMessageDialog(null,"El resultado de la potencia es: "+potencia(base,exponente));
    
    }
    public static int potencia (int base, int exponente){
       if (exponente>=0 && base>0){
           int potencia= 1;
      for(int i = 1; i <= exponente; i++){
          potencia *= base;
      }  
      return potencia;
    } else {
        return 0;
    } 
    }
}
