/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.ciclosyrecursividad;

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
}
