/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.listas.circulares;

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
        this("\nMi Listita :)");
    }

    public Lista(String nombre) {
        this.nombre = nombre;
        primerNodo = ultimoNodo = null;
    }

    public boolean estaVacia() {
        return primerNodo == null;
    }

    public void insertarAlFrente(Object dato) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(dato);
            primerNodo.setSigNodo(ultimoNodo);
            ultimoNodo.setSigNodo(primerNodo);
        } else {
            NodoLista aux = new NodoLista(dato);
            aux.setSigNodo(primerNodo);
            primerNodo = aux;
            ultimoNodo.setSigNodo(primerNodo);
        }
    }

    public void insertarAlFinal(Object dato) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(dato);
            primerNodo.setSigNodo(ultimoNodo);
            ultimoNodo.setSigNodo(primerNodo);
        } else {
            NodoLista aux = new NodoLista(dato);
            ultimoNodo.setSigNodo(aux);
            aux.setSigNodo(primerNodo);
            ultimoNodo = aux;
        }
    }

    public String imprimir() {
        String salida = "";

        if (estaVacia()) {
            return this.nombre;
        }
        salida = this.nombre + "\n";
        NodoLista aux = primerNodo;
        do {
            if (aux != null) {
                salida += (aux.getDato()) + (" => ");
                aux = aux.getSigNodo();
            } else {
                break;
            }
        } while (aux != primerNodo);

        return salida;
    }

    public void insertarEnCualquierLado(Object dato, int posicion) {
        if (posicion < 0) {
            System.out.println("La posición no puede ser negativa.");
            return;
        }

        if (posicion == 1 || posicion == 0) {
            insertarAlFrente(dato);
        } else {
            NodoLista aux = primerNodo;
            int contador = 1;

            while (aux != null && contador < posicion - 1) {
                aux = aux.getSigNodo();
                contador++;
            }

            if (aux != null) {
                aux.setSigNodo(new NodoLista(dato, aux.getSigNodo())); // Insertar un nuevo nodo después del nodo en la posición deseada
            } else {
                System.out.println("\nLa posición excede la longitud de la lista.");
            }
        }
    }

    public void eliminarAlFrente() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (primerNodo.getSigNodo() == primerNodo) {
            primerNodo = ultimoNodo = null;
        } else {
            ultimoNodo.setSigNodo(primerNodo.getSigNodo());
            primerNodo = primerNodo.getSigNodo();
        }
    }

    public void eliminarAlFinal() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (primerNodo.getSigNodo() == primerNodo) {
            primerNodo = ultimoNodo = null;
        } else {
            NodoLista aux = primerNodo;

            while (aux.getSigNodo() != ultimoNodo) {
                aux = aux.getSigNodo();
            }

            aux.setSigNodo(primerNodo);
            ultimoNodo = aux;
        }
    }

    public void eliminarEnCualquierLado(int posicion) {
        if (estaVacia() || posicion < 0) {
            System.out.println("La lista está vacía o la posición es inválida.");
            return;
        }

        if (posicion == 0 || posicion == 1) {
            eliminarAlFrente();
            return;
        }

        NodoLista aux = primerNodo;
        int contador = 1;

        while (aux != null && contador < posicion - 1) {
            aux = aux.getSigNodo();
            contador++;
        }

        if (aux != null && aux.getSigNodo() != null) {
            aux.setSigNodo(aux.getSigNodo().getSigNodo());
        } else {
            System.out.println("La posición excede la longitud de la lista.");
        }
    }

    public void ordenarNumerosYNoNumericos() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía. No hay elementos para ordenar.");
            return;
        }

        Lista numeros = new Lista();
        Lista noNumericos = new Lista();

        NodoLista actual = primerNodo;

        do {
            if (actual.getDato() instanceof Number) {
                numeros.insertarAlFinal(actual.getDato());
            } else {
                noNumericos.insertarAlFinal(actual.getDato());
            }
            actual = actual.getSigNodo();
        } while (actual != primerNodo);

        numeros.ordenarBurbuja();
        noNumericos.ordenarBurbuja();

        // Combinar los resultados
        primerNodo = null;
        ultimoNodo = null;

        if (!numeros.estaVacia()) {
            primerNodo = numeros.primerNodo;
            ultimoNodo = numeros.ultimoNodo;
        }

        if (!noNumericos.estaVacia()) {
            if (estaVacia()) {
                primerNodo = noNumericos.primerNodo;
            } else {
                ultimoNodo.setSigNodo(noNumericos.primerNodo);
            }
            ultimoNodo = noNumericos.ultimoNodo;
        }

        ultimoNodo.setSigNodo(primerNodo);
    }
    public void ordenarBurbuja() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía. No hay elementos para ordenar.");
            return;
        }

        NodoLista actual;
        boolean intercambio;

        do {
            intercambio = false;
            actual = primerNodo;

            do {
                if (((Comparable<Object>) actual.getDato()).compareTo(actual.getSigNodo().getDato()) > 0) {
                    intercambiar(actual, actual.getSigNodo());
                    intercambio = true;
                }
                actual = actual.getSigNodo();
            } while (actual != ultimoNodo);
        } while (intercambio);
    }

    private void intercambiar(NodoLista nodo1, NodoLista nodo2) {
        Object temp = nodo1.getDato();
        nodo1.setDato(nodo2.getDato());
        nodo2.setDato(temp);
    }

    public int busquedaSecuencial(Object datoABuscar) {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía. No se puede buscar.");
            return -1;
        }

        NodoLista actual = primerNodo;
        int posicion = 1;

        do {
            if (actual.getDato().equals(datoABuscar)) {
                return posicion; // Devuelve la posición del dato
            }
            actual = actual.getSigNodo();
            posicion++;
        } while (actual != primerNodo);

        JOptionPane.showMessageDialog(null, "El dato no se encuentra en la lista.");
        return -1;
    }
}
