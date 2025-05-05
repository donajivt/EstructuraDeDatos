/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.listas.circulares;


/**
 *
 * @author vania
 */
public class NodoLista {
    private Object dato;
    private NodoLista sigNodo;

    public NodoLista(Object dato) {
        this(dato,null);
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoLista(Object dato, NodoLista sigNodo) {
        this.dato = dato;
        this.sigNodo = sigNodo;
    }

    public Object getDato() {
        return dato;
    }

    public NodoLista getSigNodo() {
        return sigNodo;
    }

    public void setSigNodo(NodoLista sigNodo) {
        this.sigNodo = sigNodo;
    }
    
}
