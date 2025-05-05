/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.pilas;

/**
 *
 * @author vania
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("-------------------------------PILA ARREGLOS ------------------------------");
        PilasArreglos pa = new PilasArreglos(5);
        pa.push(10);
        pa.push(2);
        pa.push(23);
        pa.push(9);
        pa.push(7);
        System.out.println("tope: "+pa.tope);
        System.out.println("Imprimir: \n"+pa.imprimir());
        pa.pick();
        System.out.println("tope: "+pa.tope);
        pa.pop();
        System.out.println("Imprimir: \n"+pa.imprimir());
        System.out.println("tope: "+pa.tope);
        System.out.println("------------------------------PILA LISTAS -------------------------------");
        PilasListas pl = new PilasListas();
        pl.push(10);
        pl.push(2);
        pl.push(23);
        pl.push(9);
        pl.push(7);
        pl.imprimir();
        pl.pick();
        pl.pop();
        pl.imprimir();
        pl.pop(111);
        pl.imprimir();
    }
}