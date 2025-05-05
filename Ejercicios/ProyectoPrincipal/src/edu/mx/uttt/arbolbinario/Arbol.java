/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.arbolbinario;

/**
 *
 * @author vania
 */
public class Arbol {
    private NodoArbol raiz;
    public Arbol(){
        this.raiz=null;
    }
    public void insertar(int dato){
        if(estaVacio()){
            this.raiz = new NodoArbol(dato);
        }else{
            this.raiz.agregar(dato);
        }
    }
    public boolean estaVacio(){
        return this.raiz == null;
    }
    public void recorridoInOrden(){
        inOrden(this.raiz);
    }
    private void inOrden(NodoArbol nodo){
        if(nodo == null){
            
            return;
        }else{
          inOrden(nodo.getNodoIzq());
        System.out.print(nodo.getDato()+" - ");
        inOrden(nodo.getNodoDer());  
        }
        
    }
}
