/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.pilas;

import edu.mx.uttt.arreglos.Operaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class PilasArreglos {

    Operaciones arreglo;
    int tope = -1;

    public PilasArreglos(int tamanio) {
        arreglo = new Operaciones(tamanio);
    }

    public void push(int valor) {
        if (tope == arreglo.getArreglo().length - 1) {
            JOptionPane.showMessageDialog(null,"La pila está llena");
        } else {
            arreglo.getArreglo()[++tope] = valor;
            JOptionPane.showMessageDialog(null,"Elemento agregado a la pila");
        }
    }

    public void pop() {
        if (tope == -1) {
            JOptionPane.showMessageDialog(null,"La pila está vacía");
        } else {
            JOptionPane.showMessageDialog(null,"Elemento eliminado: " + arreglo.getArreglo()[tope--]);
        }
    }

    public void pop(int valor) {
        if (tope == -1) {
            JOptionPane.showMessageDialog(null,"La pila está vacía");
        } else {
            int i;
            for (i = tope; i >= 0; i--) {
                if (arreglo.getArreglo()[i] == valor) {
                    break;
                }
            }
            if (i == -1) {
                JOptionPane.showMessageDialog(null,"Elemento no encontrado :(");
            } else {
                tope = i - 1;
                JOptionPane.showMessageDialog(null,"Elementos eliminados hasta el valor: " + valor);
            }
            if (tope == -1) {
                JOptionPane.showMessageDialog(null,"La pila quedó vacía :)");
            }
        }
    }

    public void pick() {
        if (tope == -1) {
            JOptionPane.showMessageDialog(null,"La pila está vacía");
        } else {
            JOptionPane.showMessageDialog(null,"Elemento en la cima de la pila: " + arreglo.getArreglo()[tope]);
        }
    }

    public String imprimir() {
        String resultado = "Elementos de la pila: \n";
        if (tope == -1) {
            resultado = ("La pila está vacía:(");
        } else {
            for (int i = tope; i >= 0; i--) {
                resultado += (arreglo.getArreglo()[i]) + (" \n");
            }
        }
        return resultado;

    }
}
