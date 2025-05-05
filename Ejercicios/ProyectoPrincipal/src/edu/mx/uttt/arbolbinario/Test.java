/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.arbolbinario;

/**
 *
 * @author vania
 */
public class Test {
    public static void main(String[] args) {
        Arbol ar = new Arbol();
        ar.insertar(43);
        ar.insertar(10);
        ar.insertar(8);
        ar.insertar(54);
        ar.insertar(15); 
        ar.insertar(50);
        ar.insertar(53);
        System.out.println("INORDEN");
        ar.recorridoInOrden();
    }
}
