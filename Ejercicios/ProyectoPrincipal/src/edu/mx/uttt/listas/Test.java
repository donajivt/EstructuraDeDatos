/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.listas;

import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Test {

    public static void main(String[] args) {
        //String v = JOptionPane.showInputDialoLista Lista<Comparable<Object>> li = new Lista<>();
        Lista li = new Lista();
        Lista li2 = new Lista();
        ListaConcatenar lc= new ListaConcatenar();
        li.insertarAlFrente(5);
        //String c = JOptionPane.showInputDialog("Introduce algo:)");
        li.insertarAlFrente(7);
        //String j = JOptionPane.showInputDialog("Introduce algo:)");
        li.insertarAlFrente("Holiii");
        //String b = JOptionPane.showInputDialog("Introduce algo:)");
        li2.insertarAlFrente(true);
        li2.insertarAlFinal(2);
        li2.insertarAlFinal(25);
        li.insertarAlFinal(65);
        li.insertarAlFinal(63);
        li.insertarAlFinal(5);
        li.imprimir();
        System.out.println("------------------------LI2----------------------------");
        li2.imprimir();
        li.insertarEnCualquierLado(7777, 2);
        li.imprimir();
        li.eliminarAlFrente();
        li.imprimir();
        li.eliminarAlFinal();
        li.imprimir();
        li.eliminarEnCualquierLado(7);
        li.imprimir();
        lc.concatenar(li, li2);
        
//        System.out.println("\n-----------------burbuja----------------");
//        li.ordenarNumerosYNoNumericos();
//        li.imprimir();
//        li.ordenamientoShell();
//        System.out.println("\n-----------------shell----------------");
//        li.imprimir();
//        System.out.println("\n-----------------merge----------------");
//        li.ordenamientoMergeSort();
//        li.imprimir();
//        System.out.println("\n-----------------quick----------------");
//        li.ordenamientoQuickSort();
//        li.imprimir();
//        System.out.println("\n-----------------busquedas----------------");
//        Object elementoBuscado = "HOLIIIII";
//        Comparator<Object> comparador = new MixedTypeComparator();
//
//        int indiceSecuencial = li.buscarSecuencial(elementoBuscado, comparador);
//        if (indiceSecuencial != -1) {
//            System.out.println("Elemento encontrado en la posición (búsqueda secuencial): " + (indiceSecuencial));
//        } else {
//            System.out.println("Elemento no encontrado (búsqueda secuencial).");
//        }
//
//        int indiceBinario = li.buscarBinaria(elementoBuscado, comparador);
//        if (indiceBinario != -1) {
//            System.out.println("Elemento encontrado en la posición (búsqueda binaria): " + (indiceSecuencial));
//        } else {
//            System.out.println("Elemento no encontrado (búsqueda binaria).");
    //li.busquedaBinaria("Holiii");
        //System.out.println("POSICION: "+li.busquedaSecuencial("Holiii"));
    }
}
