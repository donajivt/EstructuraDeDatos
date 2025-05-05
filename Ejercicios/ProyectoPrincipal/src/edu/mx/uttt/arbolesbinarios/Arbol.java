/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.arbolesbinarios;

/**
 *
 * @author vania
 */
public class Arbol {

    private NodoArbol raiz;

    public Arbol() {
        this.raiz = null;
    }

    public void insertar(int dato) {
        if (estaVacio()) {
            this.raiz = new NodoArbol(dato);
        } else {
            this.raiz.agregar(dato);
        }
    }

    public boolean estaVacio() {
        return this.raiz == null;
    }

    public String recorridoInOrden() {
        String s = inOrden(this.raiz);
        return s;
    }

    public String recorridoPostOrden() {
         return postOrden(this.raiz);
    }

    public String recorridoPreOrden() {
        return preOrden(this.raiz);
    }

    private String inOrden(NodoArbol nodo) {
        String s ="";
        if (nodo == null) {
            return s;
        } else {
            s +=inOrden(nodo.getNodoIzq());
            s+=(nodo.getDato() + " - ");
            s +=inOrden(nodo.getNodoDer());
        }
        return s;
    }

    //Metodo Preorden
    private String preOrden(NodoArbol raiz) {
        String s="";
        if (raiz != null) {
            //System.out.print(raiz.getDato() + " - ");
            s = raiz.getDato() + " - ";
            s +=preOrden(raiz.getNodoIzq());
            s +=preOrden(raiz.getNodoDer());
        } else {
            return s;
        }
        return s;
    }

    //Metodo PostOrden
    private String postOrden(NodoArbol raiz) {
        String s="";
        if (raiz != null) {
            s +=postOrden(raiz.getNodoIzq());
            s +=postOrden(raiz.getNodoDer());
            s +=(raiz.getDato() + " - ");
        }else{
            return s;
        }
        return s;
    }
}
