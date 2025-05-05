/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.pilas;

import edu.mx.uttt.listas.Lista;
import edu.mx.uttt.listas.NodoLista;
import javax.swing.JOptionPane;

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
        
    }

    public void pop() {
        if (lista.estaVacia()) {
            JOptionPane.showMessageDialog(null,"La pila está vacía");
        } else {
            Object valorEliminado = tope.getDato();
            lista.eliminarAlFrente();
            tope = lista.getPrimerNodo();
            JOptionPane.showMessageDialog(null,"Elemento eliminado: " + valorEliminado);
        }
    }

    public void pop(Object valor) {
        if (lista.estaVacia()) {
            JOptionPane.showMessageDialog(null,"La pila está vacía");
            return;
        }

        NodoLista nodoActual = lista.getPrimerNodo();
        NodoLista nodoAnterior = null;
        NodoLista nodoToDelete = tope;

        while (nodoActual != null) {
            if (nodoActual.getDato().equals(valor)) {
                if (nodoAnterior == null) {
                    lista.setPrimerNodo(null); 
                    tope = null;
                } else {
                    nodoAnterior.setSigNodo(null); 
                    tope = nodoAnterior; 
                }
                JOptionPane.showMessageDialog(null,"Elementos eliminados");
                return;
            }
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.getSigNodo();
        }

        JOptionPane.showMessageDialog(null,"Elemento no encontrado en la pila");
    }

    public void pick() {
        if (lista.estaVacia()) {
            JOptionPane.showMessageDialog(null,"\nLa pila está vacía");
        } else {
            JOptionPane.showMessageDialog(null,"Elemento en la cima de la pila: " + tope.getDato());
        }
    }

    public String imprimir() {
        return lista.imprimir();
    }
}
