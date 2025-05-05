/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.pilas;

import edu.mx.uttt.listas.Lista;
import edu.mx.uttt.listas.NodoLista;

/**
 *
 * @author vania
 */
public class PilasListas {

    private Lista lista;
    private NodoLista tope;

    public PilasListas() {
        lista = new Lista("\nPila Lista jaja\n");
        tope = null;
    }

    public void push(Object dato) {
        lista.insertarAlFrente(dato);
        tope = lista.getPrimerNodo();
        System.out.println("primerNodo: " + lista.getPrimerNodo().getDato());
        System.out.println("ultimoNodo: " + lista.getUltimoNodo().getDato());
    }

    public void pop() {
        if (lista.estaVacia()) {
            System.out.println("La pila está vacía");
        } else {
            Object valorEliminado = tope.getDato();
            lista.eliminarAlFrente();
            tope = lista.getPrimerNodo();
            System.out.println("Elemento eliminado: " + valorEliminado);
        }
    }

    public void pop(Object valor) {
        if (lista.estaVacia()) {
            System.out.println("La pila está vacía");
            return;
        }

        NodoLista nodoActual = lista.getPrimerNodo();
        NodoLista nodoAnterior = null;
        NodoLista nodoToDelete = tope;

        while (nodoActual != null) {
            if (nodoActual.getDato().equals(valor)) {
                if (nodoAnterior == null) {
                    lista.setPrimerNodo(null); // Si el valor está en el tope, se vacía la lista
                    tope = null;
                } else {
                    nodoAnterior.setSigNodo(null); // Elimina los nodos desde nodoAnterior hasta el tope
                    tope = nodoAnterior; // Actualiza el tope al último nodo eliminado
                }
                System.out.println("Elementos desde el tope hasta el valor dado han sido eliminados");
                return;
            }
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.getSigNodo();
        }

        System.out.println("Elemento no encontrado en la pila");
    }

    public void pick() {
        if (lista.estaVacia()) {
            System.out.println("\nLa pila está vacía");
        } else {
            System.out.println("\nElemento en la cima de la pila: " + tope.getDato());
        }
    }

    public void imprimir() {
        lista.imprimir();
    }
}
