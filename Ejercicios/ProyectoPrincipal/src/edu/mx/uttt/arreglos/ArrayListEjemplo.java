/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.arreglos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author vania
 */
public class ArrayListEjemplo {

    public static void main(String[] args) {

        // Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
        ArrayList<String> nombreArrayList = new ArrayList<String>();

        // Añadimos 10 Elementos en el ArrayList
        System.out.println("------------------------ Añadimos 10 Elementos en el ArrayList ---------------------------");
        for (int i = 1; i <= 10; i++) {
            nombreArrayList.add("Elemento " + i);
        }
        imprimir(nombreArrayList);
        // Añadimos un nuevo elemento al ArrayList en la posición 2
        System.out.println("------------------------ Añadimos un nuevo elemento al ArrayList en la posición 2 ---------------------------");
        nombreArrayList.add(2, "Elemento extra");
        imprimir(nombreArrayList);

        // Añade el elemento al ArrayList
        System.out.println("------------------------ Añade el elemento al ArrayList ---------------------------");
        nombreArrayList.add("Elemento");
        imprimir(nombreArrayList);
        // Añade el elemento al ArrayList en la posición 'n'
        System.out.println("------------------------ Añade el elemento al ArrayList en la posición 'n' ---------------------------");
        int n = 2;
        System.out.println("n= " + n);
        nombreArrayList.add(n, "Elemento otro");
        imprimir(nombreArrayList);
        // Devuelve el numero de elementos del ArrayList
        System.out.println("\nNumero de elementos del ArrayList: " + nombreArrayList.size());
        // Devuelve el elemento que esta en la posición '2' del ArrayList
        System.out.println("\nElemento que esta en la posición '2' del ArrayList: " + nombreArrayList.get(2));
        // Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
        System.out.println("Comprueba se existe del elemento ('Elemento') que se le pasa como parametro: " + nombreArrayList.contains("Elemento"));
        // Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList  
        System.out.println("\nPosición de la primera ocurrencia ('Elemento') en el ArrayList: " + nombreArrayList.indexOf("Elemento"));
        // Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList   
        System.out.println("\nPosición de la última ocurrencia ('Elemento') en el ArrayList:  " + nombreArrayList.lastIndexOf("Elemento"));
        // Copiar un ArrayList 
        System.out.println("------------------------ Copiar el ArrayList a otro ---------------------------");
        ArrayList<String> arrayListCopia = (ArrayList<String>) nombreArrayList.clone();
        imprimir(arrayListCopia);
        // Borra el elemento de la posición '5' del ArrayList   
        nombreArrayList.remove(5);
        // Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
        System.out.println("------------------------ Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro ---------------------------");
        nombreArrayList.remove("\nElemento");
        imprimir(nombreArrayList);
        //Borra todos los elementos de ArrayList   
        System.out.println("------------------------ Borra todos los elementos de ArrayList ---------------------------");
        nombreArrayList.clear();
        imprimir(nombreArrayList);
        // Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
        System.out.println("\nEl ArrayList esta vacio: " + nombreArrayList.isEmpty());
        imprimir(nombreArrayList);
        // Pasa el ArrayList a un Array 
        Object[] array = nombreArrayList.toArray();
    }

    public static void imprimir(ArrayList<String> nombreArrayList) {
        // Declaramos el Iterador e imprimimos los Elementos del ArrayList
        Iterator<String> nombreIterator = nombreArrayList.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.println(elemento);
        }
    }
}
