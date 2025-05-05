/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.listas.circularessimples;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Test {

    public static void main(String[] args) {
        //String v = JOptionPane.showInputDialoLista Lista<Comparable<Object>> li = new Lista<>();
        Lista li = new Lista();
        li.insertarAlFrente(5);
        //String c = JOptionPane.showInputDialog("Introduce algo:)");
        li.insertarAlFrente(7);
        //String j = JOptionPane.showInputDialog("Introduce algo:)");
        li.insertarAlFrente("Guada");
        //String b = JOptionPane.showInputDialog("Introduce algo:)");
        li.insertarAlFrente(true);
        li.insertarAlFinal("HOLIIIII");
        li.insertarAlFinal("Brou");
        li.insertarAlFinal("HOLII");
        li.insertarAlFinal("Energia");
        li.insertarAlFinal("JB");
        li.imprimir();
        li.insertarEnCualquierLado(7777, 2);
        li.imprimir();
        li.eliminarAlFrente();
        li.imprimir();
        li.eliminarAlFinal();
        li.imprimir();
        li.eliminarEnCualquierLado(2);
        li.imprimir();
        System.out.println("\n-----------------burbuja----------------");
        li.ordenarNumerosYNoNumericos();
        li.imprimir();
//        System.out.println("\n-----------------quick----------------");
//        li.ordenarQuick(new MixedTypeComparator());
//        li.imprimir();
        System.out.println("\n-----------------busquedas----------------");
        Object elementoBuscado = 7;
        System.out.println("POSICION: "+li.busquedaSecuencial(elementoBuscado));
    }
}
