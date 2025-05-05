/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.colas;

import edu.mx.uttt.listas.Lista;
import edu.mx.uttt.listas.NodoLista;
import javax.swing.JOptionPane;

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
        if (tope == null) {
            tope = lista.getPrimerNodo();
        }
        JOptionPane.showMessageDialog(null, "Elemento Agregado a la cola.");
        System.out.println("primerNodo: " + lista.getPrimerNodo().getDato());
        System.out.println("ultimoNodo: " + lista.getUltimoNodo().getDato());
    }

    public void desencolar() {
        if (lista.estaVacia()) {
            JOptionPane.showMessageDialog(null, "La cola está vacía");
            tope = null;
        } else {
            Object valorEliminado = tope.getDato();
            lista.eliminarAlFrente();
            tope = lista.getPrimerNodo();
            JOptionPane.showMessageDialog(null, "Elemento eliminado: " + valorEliminado);
        }
    }

    public void desencolar(Object valor) {
        if (lista.estaVacia() || tope == null) {
            JOptionPane.showMessageDialog(null,"La cola está vacía");
            return;
        }

        NodoLista nodoActual = lista.getPrimerNodo();
        NodoLista nodoAnterior = null;

        while (nodoActual != null && !nodoActual.getDato().equals(valor)) {
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.getSigNodo();
        }

        if (nodoActual != null && nodoActual != tope) {
            lista.setPrimerNodo(nodoActual.getSigNodo());
            JOptionPane.showMessageDialog(null,"Elemento " + valor + " y los elementos anteriores han sido eliminados");
        } else if (nodoActual != null && nodoActual == tope) {
            lista.setPrimerNodo(null);
            tope = null;
            JOptionPane.showMessageDialog(null,"Elemento " + valor + " y todos los elementos anteriores han sido eliminados");
        } else {
            JOptionPane.showMessageDialog(null,"Elemento no encontrado:(");
        }
    }

    public void peek() {
        if (lista.estaVacia()) {
            JOptionPane.showMessageDialog(null, "\nLa cola está vacía");
        } else {
            JOptionPane.showMessageDialog(null, "\nElemento al principio de la cola: " + lista.getPrimerNodo().getDato());
        }
    }

    public String imprimir() {
        System.out.println("Lista: \n" + lista.imprimir());
        return lista.imprimir();
    }
}
