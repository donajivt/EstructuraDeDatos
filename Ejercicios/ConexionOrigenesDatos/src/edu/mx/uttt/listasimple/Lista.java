/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.listasimple;

import edu.mx.uttt.entidades.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Lista {
    private String nombre;
    private NodoLista primerNodo;
    private NodoLista ultimoNodo;
    public Lista() {
        this("Mi Listita :)");
    }
    public Lista(String nombre) {
        this.nombre = nombre;
        primerNodo = ultimoNodo = null;
    }
    public boolean estaVacia(){
        return primerNodo == null;
    }
    public void insertarAlFrente(Object dato){
        if(estaVacia()){
            primerNodo=ultimoNodo=new NodoLista(dato);
        }else{
            primerNodo = new NodoLista(dato, primerNodo);
        }
    }
    public void imprimir(){
        if(estaVacia()){
            //JOptionPane.showMessageDialog(null, this.nombre);
            System.out.println(this.nombre);
            return;
        }
        //JOptionPane.showMessageDialog(null, this.nombre);
        System.out.println(this.nombre);
        NodoLista aux;
        aux = primerNodo;
        while(aux != null){
            //JOptionPane.showMessageDialog(null, aux.getDato()+"↬");
            System.out.print(aux.getDato()+" => ");
            aux = aux.getSigNodo();
        }
    }

    public NodoLista getPrimerNodo() {
        return primerNodo;
    }

    public NodoLista getUltimoNodo() {
        return ultimoNodo;
    }
    public void insertarAlFinal(Object dato){
        if(estaVacia()){
            primerNodo=ultimoNodo=new NodoLista(dato);
        }else{
            ultimoNodo.setSigNodo(new NodoLista(dato));
            ultimoNodo = ultimoNodo.getSigNodo();
        }
    }
}
