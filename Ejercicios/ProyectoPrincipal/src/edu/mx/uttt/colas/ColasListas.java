/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.colas;

import edu.mx.uttt.listas.Lista;
import edu.mx.uttt.listas.NodoLista;

/**
 *
 * @author vania
 */
public class ColasListas {

    private Lista lista;
    private NodoLista tope;

    public ColasListas() {
        lista = new Lista("\nColas - Listas jaja\n");
        tope = null;
    }

    public void encolar(Object dato) {
        lista.insertarAlFinal(dato);
        // Si tope es null, asignamos el nuevo nodo como tope
        if (tope == null) {
            tope = lista.getPrimerNodo();
        }
        System.out.println("primerNodo: " + lista.getPrimerNodo().getDato());
        System.out.println("ultimoNodo: " + lista.getUltimoNodo().getDato());
    }

    public void desencolar() {
        if (lista.estaVacia()) {
            System.out.println("La cola está vacía");
            tope = null;
        } else {
            Object valorEliminado = tope.getDato();
            lista.eliminarAlFrente();
            tope = lista.getPrimerNodo();
            System.out.println("Elemento eliminado: " + valorEliminado);
        }
    }

    public void desencolar(Object valor) {
        if (lista.estaVacia() || tope == null) {
            System.out.println("La cola está vacía");
            return;
        }

        NodoLista nodoActual = lista.getPrimerNodo();
        NodoLista nodoAnterior = null;

        // Busca el nodo con el valor dado en la cola
        while (nodoActual != null && !nodoActual.getDato().equals(valor)) {
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.getSigNodo();
        }

        // Si se encontró el nodo y no es el tope
        if (nodoActual != null && nodoActual != tope) {
            // Elimina los nodos desde el principio hasta el nodo justo antes del valor dado
            lista.setPrimerNodo(nodoActual.getSigNodo());
            System.out.println("Elemento " + valor + " y los elementos anteriores han sido eliminados");
        } else if (nodoActual != null && nodoActual == tope) {
            // Si el valor es el tope de la cola
            lista.setPrimerNodo(null);
            tope = null;
            System.out.println("Elemento " + valor + " y todos los elementos anteriores han sido eliminados");
        } else {
            System.out.println("Elemento no encontrado o está en el tope de la cola");
        }
    }

    public void peek() {
        if (lista.estaVacia()) {
            System.out.println("\nLa cola está vacía");
        } else {
            System.out.println("\nElemento al principio de la cola: " + lista.getPrimerNodo().getDato());
        }
    }

    public void imprimir() {
        lista.imprimir();
    }
}
