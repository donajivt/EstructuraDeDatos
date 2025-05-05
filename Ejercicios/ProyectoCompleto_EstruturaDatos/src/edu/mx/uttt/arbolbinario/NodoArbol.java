/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.arbolbinario;

/**
 *
 * @author vania
 */
public class NodoArbol {
    private int dato;
    private NodoArbol nodoDer;
    private NodoArbol nodoIzq;
    public NodoArbol(int dato){
        this.dato = dato;
        this.nodoIzq=null;
        this.nodoDer=null;
    }

    public int getDato() {
        return dato;
    }

    public NodoArbol getNodoDer() {
        return nodoDer;
    }

    public NodoArbol getNodoIzq() {
        return nodoIzq;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    public void agregar(int dato){
        if(dato<this.dato){
            //inserta de lado izquierdo
            if(this.nodoIzq == null){
                this.nodoIzq = new NodoArbol (dato);
            }else{
                this.nodoIzq.agregar(dato);
            }
        }else{
            //inserta de lado derecho
            if(this.nodoDer == null){
                this.nodoDer = new NodoArbol (dato);
            }else{
                this.nodoDer.agregar(dato);
            }
        }
    }
}
