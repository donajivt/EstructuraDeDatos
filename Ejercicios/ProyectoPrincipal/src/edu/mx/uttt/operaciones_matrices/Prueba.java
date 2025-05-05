/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.operaciones_matrices;

/**
 *
 * @author vania
 */
public class Prueba {
    public static void main(String[] args) {
        OperacionesMatrices obj1= new OperacionesMatrices(2,2);
        OperacionesMatrices obj2=new OperacionesMatrices(2,2);
        obj1.llenarMatriz();
        obj2.llenarMatriz();
        String r=obj1.sumar(obj2.getM());
        System.out.println(r);
        
    }
}
