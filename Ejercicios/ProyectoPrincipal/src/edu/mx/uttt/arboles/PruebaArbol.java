/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.arboles;

/**
 *
 * @author vania
 */
public class PruebaArbol {
  public static void main(String[] args) {
 
    //Se asignan los valores a los nodos = 1,2,3,4,5 y 6 dentro del arbol
    //Nodo raiz = 1
    Nodo raiz = new Nodo(1);
 
    //Nodo2 Izquierdo = 2
    Nodo nodo2 = new Nodo(2);
 
    //Nodo3 Derecho = 3
    Nodo nodo3 = new Nodo(3);
 
    //Se asigna el valor 6 al nodo que sera hijo del nodo 3 a la derecha
    nodo3.setNodoDerecho(new Nodo(6));
 
    //Se asigna el valor 5 al nodo que sera hijo del nodo 3 a la izquierda
    nodo3.setNodoIzquierdo(new Nodo(5));
 
    //Se asigna el valor 4 al nodo que sera hijo del nodo 4 a la izquierda
    nodo2.setNodoIzquierdo(new Nodo(4));
 
    //Se crean el Nodo 2 a la izquierda y el Nodo 3 a la derecha de la raiz 
    raiz.setNodoIzquierdo(nodo2);
    raiz.setNodoDerecho(nodo3);
 
    //Resultado en pantalla
    System.out.println("Recorrido Preorden: ");
    preOrden(raiz);
    System.out.println("\nRecorrido Inorden: ");
    inorden(raiz);
    System.out.println("\nRecorrido PostOrden: ");
    posOrden(raiz);
  }
 
  //Metodo Preorden
  private static void preOrden(Nodo raiz) {
    if (raiz != null) {
      System.out.print(raiz.getDato() + " - ");
      preOrden(raiz.getNodoIzquierdo());
      preOrden(raiz.getNodoDerecho());
    }
  }
 
  //Metodo Inorden
  private static void inorden(Nodo raiz) {
    if (raiz != null) {
      inorden(raiz.getNodoIzquierdo());
      System.out.print(raiz.getDato()+ " - ");
      inorden(raiz.getNodoDerecho());
    }
  }
 
  //Metodo PostOrden
  private static void posOrden(Nodo raiz) {
    if (raiz != null) {
      posOrden(raiz.getNodoIzquierdo());
      posOrden(raiz.getNodoDerecho());
      System.out.print(raiz.getDato() + " - ");
    }
  }
 
}
