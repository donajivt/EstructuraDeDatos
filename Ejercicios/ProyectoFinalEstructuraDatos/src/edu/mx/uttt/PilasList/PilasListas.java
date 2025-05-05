/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.PilasList;

import edu.mx.uttt.listas.Lista;

/**
 *
 * @author vania
 */
public class PilasListas {
    private Lista pilas;
    
    public PilasListas(){
        pilas = new Lista();
    }
    
    public void push(Object valor){
        pilas.insertarAlFrente(valor);
    }
    public void imprimir (){
        pilas.imprimir();
    }
    public int peek(){
        return (int) pilas.getPrimerNodo().getDato();
    }
}
