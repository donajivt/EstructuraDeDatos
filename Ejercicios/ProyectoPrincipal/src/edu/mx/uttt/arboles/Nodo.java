/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.arboles;

/**
 *
 * @author vania
 */
public class Nodo {
  //Variables
  private int dato;
  private Nodo izq;
  private Nodo der;
 
  //Constructor 
  public Nodo(int dato){
    this.dato = dato;
  }
  //Para saber el nodo izquierdo
  public Nodo getNodoIzquierdo(){
    return izq;
  }
  //Para saber el nodo derecho
  public Nodo getNodoDerecho(){
    return der;
  }
  //Se crea nodo derecho
  public void setNodoDerecho(Nodo nodo){
    der = nodo;
  }
  //Se crea nodo Izquierdo
  public void setNodoIzquierdo(Nodo nodo){
    izq = nodo;
  }
 
  public int getDato(){
    return dato;
  }
}
