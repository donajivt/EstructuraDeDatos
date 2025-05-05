/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.colas;

import edu.mx.uttt.arreglos.Operaciones;

/**
 *
 * @author vania
 */
public class ColasArreglos {

    Operaciones arreglo;
    private int tope;

    public ColasArreglos(int tamanio) {
        arreglo = new Operaciones(tamanio);
        tope = -1;
    }

    public void encolar(int valor) {
        if (tope == arreglo.getArreglo().length - 1) {
            System.out.println("La cola está llena");
        } else {
            arreglo.getArreglo()[++tope] = valor;
            System.out.println("Elemento agregado a la cola");
        }
    }

    public int desencolar() {
        if (tope == -1) {
            System.out.println("La cola está vacía");
            return -1;
        } else {
            int elementoDesencolado = arreglo.getArreglo()[0];
            for (int i = 0; i < tope; i++) {
                arreglo.getArreglo()[i] = arreglo.getArreglo()[i + 1];
            }
            arreglo.getArreglo()[tope] = 0;
            tope--;
            return elementoDesencolado;
        }
    }

    public void imprimir() {
        if (tope == -1) {
            System.out.println("La cola está vacía");
        } else {
            System.out.println("Elementos en la cola:");
            for (int i = 0; i <= tope; i++) {
                System.out.print(arreglo.getArreglo()[i] + "\n");
            }
            System.out.println();
        }
    }

    public void desencolar(int valor) {
        if (tope == -1) {
            System.out.println("La cola está vacía");
        } else {
            int i;
            for (i = 0; i <= tope; i++) {
                if (arreglo.getArreglo()[i] == valor) {
                    break;
                }
            }
            if (i == tope + 1) {
                System.out.println("Elemento no encontrado :(");
            } else {
                for (int j = i; j >= 0; j--) {
                    for (int k = j; k < tope; k++) {
                        arreglo.getArreglo()[k] = arreglo.getArreglo()[k + 1];
                    }
                    tope--;
                }
                System.out.println("Elemento " + valor + " y los elementos anteriores han sido eliminados");
            }
            if (tope == -1) {
                System.out.println("La cola quedó vacía :)");
            }
        }
    }

    public int peek() {
        if (tope == -1) {
            System.out.println("La cola está vacía");
            return -1;
        } else {
            return arreglo.getArreglo()[0];
        }
    }

    public int getTope() {
        return tope;
    }
}
