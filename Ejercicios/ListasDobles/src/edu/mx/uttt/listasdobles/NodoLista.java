/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.listasdobles;

/**
 *
 * @author vania
 */
public class NodoLista {
    private Object dato;
    private NodoLista sigNodo;
    private NodoLista antNodo;

    public NodoLista(Object dato) {
        this(dato,null,null);
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoLista(Object dato, NodoLista sigNodo, NodoLista antNodo) {
        this.dato = dato;
        this.sigNodo = sigNodo;
        this.antNodo = antNodo;
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
    public NodoLista getAntNodo() {
        return antNodo;
    }

    public void setAntNodo(NodoLista antNodo) {
        this.antNodo = antNodo;
    }
}
