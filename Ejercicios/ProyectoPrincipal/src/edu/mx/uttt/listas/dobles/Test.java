/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.listas.dobles;

import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Test {

    public static void main(String[] args) {
        Scanner hola = new Scanner(System.in);
        //String v = JOptionPane.showInputDialoLista Lista<Comparable<Object>> li = new Lista<>();
        Lista li = new Lista();
        System.out.println("\n-----------------insertar al frente----------------");
        li.insertarAlFrente(5);
        //String c = JOptionPane.showInputDialog("Introduce algo:)");
        li.insertarAlFrente(7);
        //String j = JOptionPane.showInputDialog("Introduce algo:)");
        li.insertarAlFrente("Guada");
        //String b = JOptionPane.showInputDialog("Introduce algo:)");
        li.insertarAlFrente(true);
        System.out.println(li.imprimir());
        System.out.println("\n-----------------insertar al final----------------");
        li.insertarAlFinal(1500);
        li.insertarAlFinal("HOLIIIII");
        li.insertarAlFinal("Brou");
        li.insertarAlFinal("HOLII");
        li.insertarAlFinal("Energia");
        li.insertarAlFinal("JB");
        System.out.println(li.imprimir());

        System.out.println("\n-----------------insertar y eliminar en cualquier posicion----------------");
        System.out.println("\nIngresa la posición donde quieres insertar");
        int n = hola.nextInt();
        li.insertarEnCualquierLado(77, n);
        System.out.println(li.imprimir());
        System.out.println("\nIngresa la posición donde quieres eliminar");
        int s = hola.nextInt();
        li.eliminarEnCualquierLado(s);
        System.out.println(li.imprimir());
        System.out.println("\n-----------------eliminar al frente----------------");
        li.eliminarAlFrente();
        System.out.println(li.imprimir());
        System.out.println("\n-----------------eliminar al final----------------");
        li.eliminarAlFinal();
        System.out.println(li.imprimir());
        System.out.println("\n-----------------burbuja----------------");
        li.ordenarNumerosYNoNumericos();
        System.out.println(li.imprimir());

        System.out.println("\n-----------------busquedas----------------");
        System.out.println("POSICION: "+li.busquedaSecuencial(5));
        System.out.println(li.imprimirReves());
    }
}
