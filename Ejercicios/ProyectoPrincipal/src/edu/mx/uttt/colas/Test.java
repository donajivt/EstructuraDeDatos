/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.colas;

/**
 *
 * @author vania
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("------------------------------- COLAS ARREGLOS ------------------------------");
        ColasArreglos ca= new ColasArreglos(5);
        ca.encolar(2);
        ca.encolar(6);
        ca.encolar(3);
        ca.encolar(7);
        ca.encolar(9);
        ca.imprimir();
        ca.desencolar(6);
        ca.imprimir();
        System.out.println("Peek de la cola: "+ca.peek());
        System.out.println("----------------------------- COLAS LISTAS -------------------------------");
        ColasListas cl = new ColasListas();
        cl.encolar(2);
        cl.encolar(6);
        cl.encolar(3);
        cl.encolar(7);
        cl.encolar("holiii");
        cl.imprimir();
        cl.desencolar(6);
        cl.imprimir();
        cl.peek();
        
    }
}
