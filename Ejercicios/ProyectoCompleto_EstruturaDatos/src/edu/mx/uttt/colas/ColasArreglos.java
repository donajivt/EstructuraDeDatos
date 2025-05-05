/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.colas;

import edu.mx.uttt.arreglos.Operaciones;
import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null,"La cola está llena");
        } else {
            arreglo.getArreglo()[++tope] = valor;
            JOptionPane.showMessageDialog(null,"Elemento agregado a la cola");
        }
    }

    public void desencolar() {
        if (tope == -1) {
            JOptionPane.showMessageDialog(null,"La cola está vacía");
        } else {
            int elementoDesencolado = arreglo.getArreglo()[0];
            for (int i = 0; i < tope; i++) {
                arreglo.getArreglo()[i] = arreglo.getArreglo()[i + 1];
            }
            arreglo.getArreglo()[tope] = 0;
            tope--;
            JOptionPane.showMessageDialog(null,"Elemento eliminado: "+elementoDesencolado);
        }
    }

    public String imprimir() {
        String salida = "";
        if (tope == -1) {
            JOptionPane.showMessageDialog(null,"La cola está vacía");
        } else {
            salida = "Elementos en la cola:\n";
            for (int i = 0; i <= tope; i++) {
                salida += (arreglo.getArreglo()[i] + "\n");
            }
        }
        return salida;
    }

    public void desencolar(int valor) {
        if (tope == -1) {
            JOptionPane.showMessageDialog(null,"La cola está vacía");
        } else {
            int i;
            for (i = 0; i <= tope; i++) {
                if (arreglo.getArreglo()[i] == valor) {
                    break;
                }
            }
            if (i == tope + 1) {
                JOptionPane.showMessageDialog(null,"Elemento no encontrado :(");
            } else {
                for (int j = i; j >= 0; j--) {
                    for (int k = j; k < tope; k++) {
                        arreglo.getArreglo()[k] = arreglo.getArreglo()[k + 1];
                    }
                    tope--;
                }
                JOptionPane.showMessageDialog(null,"Elemento " + valor + " y los elementos anteriores han sido eliminados");
            }
            if (tope == -1) {
                JOptionPane.showMessageDialog(null,"La cola quedó vacía :)");
            }
        }
    }

    public void peek() {
        if (tope == -1) {
            JOptionPane.showMessageDialog(null,"La cola está vacía");
        } else {
            JOptionPane.showMessageDialog(null,"Primer elemento de la cola: "+ arreglo.getArreglo()[0]);
        }
    }

    public int getTope() {
        return tope;
    }
}
