/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.colas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author vania
 */
public class EjecutaCola {

    static int n = 0, elemento = 0;

    public static void main(String[] args) throws Exception {
        ColaArray k = new ColaArray();
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("\n---- ELIJA LA OPERACION A REALIZAR ----");
            System.out.println("----------------- MENU -----------------");
            System.out.println("1. Ingresar elementos");
            System.out.println("2. Eliminar elementos");// CONTROLAR QUE SI ELIMINA SE PERCATE DE QUE NO ESTE VACIA 
            System.out.println("3. Ver si la cola esta vacia");
            System.out.println("4. Ver el frente de la cola");// SI NO HAY ELEMENTOS QUE DESPLIGUE UN MENSAJE DE QUE NO HAY ELEMENTOS
            System.out.println("5. Borrar");
            System.out.println("6. Ver si la cola esta  llena");
            System.out.println("7. SALIR");
            n = Integer.parseInt(b.readLine());
            if (n == 1) {
                if (k.ColaLlena()) {
                    System.out.println("COLA LLENA NO SE PUEDE INGRESAR ELEMENTOS");
                } else {
                    System.err.print("// INGRESE LOS ELEMNTOS //= ");
                }
                elemento = Integer.parseInt(b.readLine());
                k.insertarQ(elemento);
            }
            if (n == 2) {
                if (k.ColaVacia()) {
                    System.err.println("LA COLA ESTA VACIA NO PUEDE ELIMINAR ELEMENTOS");
                } else {
                    System.out.println(k.eliminarQ());
                }
            }
            if (n == 3) {
                if (k.ColaVacia()) {
                    System.out.println("LA COLA ESTA VACIA");
                } else {
                    System.out.println("LA COLA NO ESTA VACIA ");
                }
            }
            if (n == 4) {
                if (k.ColaVacia()) {
                    System.err.println("LA COLAN ESTA VACIA, NO hay elementos en el frente");
                } else {
                    System.out.println("EL FRENTE DE LA COLA ES= " + k.frenteQ());
                }

            }
            if (n == 5) {
                k.BorrarQ();

            }
            if (n == 6) {
                k.ColaLlena();
                if (k.ColaLlena()) {
                    System.out.println("LA COLA ESTA LLENA");
                } else {
                    System.out.println("LA COLA NO ESTA LLENA");
                }
            }
            if (n == 7) {
                System.exit(0);
            }

        } while (n != 7);
    }

}
