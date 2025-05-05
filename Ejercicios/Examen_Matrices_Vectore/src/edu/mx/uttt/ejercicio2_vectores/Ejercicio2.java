/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.ejercicio2_vectores;

/**
 *
 * @author vania
 */
public class Ejercicio2 {
    char [] caracteres;
    public Ejercicio2(String palabra){
        caracteres = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            caracteres[i] = palabra.charAt(i);
        }
    }
    public String mayusculas(){
        int mayusculas = 0;
        
        for (char caracter : caracteres) {
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            }
        }
        return "Mayusculas:    "+mayusculas;
    } 
    public String minusculas(){
        int minusculas = 0;
        
        for (char caracter : caracteres) {
            if (Character.isLowerCase(caracter)) {
                minusculas++;
            }
        }
        return "Minusculas:    "+minusculas;
    } 
    public boolean contrario() {
        int i = 0;
        int j = caracteres.length - 1;
        
        while (i < j) {
            char charI = Character.toLowerCase(caracteres[i]);
            char charJ = Character.toLowerCase(caracteres[j]);
            
            if (charI != charJ) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
