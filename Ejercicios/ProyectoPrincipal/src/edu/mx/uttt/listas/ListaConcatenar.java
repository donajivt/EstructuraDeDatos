/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.listas;
/**
 *
 * @author vania
 */
public class ListaConcatenar {

    public ListaConcatenar() {
    }
    public Lista concatenar(Lista li1, Lista li2){
        Lista liR = new Lista("Lista Conactenar");
        liR = li1;
            liR.insertarAlFinal(li2.getPrimerNodo().getDato());
            
        System.out.println("-----------------Lista3--------------");
        liR.imprimir();
        return liR;
    }
}
