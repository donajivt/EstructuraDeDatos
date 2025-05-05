/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.listas.dobles;

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
        } else {
            primerNodo = new NodoLista(dato, primerNodo, null);
        }
    }

    public String imprimir() {
        String salida = "";
        if (estaVacia()) {
            salida = (this.nombre);
            return salida;
        }
        salida = (this.nombre);
        NodoLista aux = primerNodo;
        while (aux != null) {
            salida += (aux.getDato() + " => ");
            aux = aux.getSigNodo();
        }
        return salida;
    }

    public String imprimirReves() {
        String salida = "";
        if (estaVacia()) {
            salida = (this.nombre + "\n");
            return salida;
        }
        salida = (this.nombre + "\n");
        NodoLista aux = ultimoNodo;
        while (aux != null) {
            salida += (aux.getDato() + " => ");
            aux = aux.getAntNodo();
        }
        return salida;
    }

    public void insertarAlFinal(Object dato) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(dato);
        } else {
            ultimoNodo.setSigNodo(new NodoLista(dato, null, ultimoNodo));
            ultimoNodo = ultimoNodo.getSigNodo();
        }
    }

    public void insertarEnCualquierLado(Object dato, int posicion) {
        if (posicion < 0) {
            JOptionPane.showMessageDialog(null, "La posición no puede ser negativa.");
            return;
        }

        NodoLista nuevoNodo = new NodoLista(dato);

        if (estaVacia()) {
            primerNodo = ultimoNodo = nuevoNodo;
        } else if (posicion == 1 || posicion == 0) {
            nuevoNodo.setSigNodo(primerNodo);
            primerNodo.setAntNodo(nuevoNodo);
            primerNodo = nuevoNodo;
        } else {
            NodoLista aux = primerNodo;
            int contador = 1;

            while (aux != null && contador < posicion - 1) {
                aux = aux.getSigNodo();
                contador++;
            }

            if (aux != null) {
                nuevoNodo.setSigNodo(aux.getSigNodo());
                nuevoNodo.setAntNodo(aux);
                if (aux.getSigNodo() != null) {
                    aux.getSigNodo().setAntNodo(nuevoNodo);
                }
                aux.setSigNodo(nuevoNodo);

                if (aux == ultimoNodo) {
                    ultimoNodo = nuevoNodo;
                }
            } else {
                JOptionPane.showMessageDialog(null, "\nLa posición excede la longitud de la lista.");
            }
        }
    }

    public void eliminarEnCualquierLado(int posicion) {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
            return;
        }

        if (posicion < 0) {
            JOptionPane.showMessageDialog(null, "La posición no puede ser negativa.");
            return;
        }

        if (posicion == 1 || posicion == 0) {
            if (primerNodo == ultimoNodo) {
                primerNodo = ultimoNodo = null;
            } else {
                primerNodo = primerNodo.getSigNodo();
                primerNodo.setAntNodo(null);
            }
        } else {
            NodoLista aux = primerNodo;
            int contador = 1;

            while (aux != null && contador < posicion - 1) {
                aux = aux.getSigNodo();
                contador++;
            }

            if (aux != null && aux.getSigNodo() != null) {
                NodoLista nodoEliminar = aux.getSigNodo();
                aux.setSigNodo(nodoEliminar.getSigNodo());

                if (nodoEliminar == ultimoNodo) {
                    ultimoNodo = aux;
                } else {
                    nodoEliminar.getSigNodo().setAntNodo(aux);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La posición excede la longitud de la lista.");
            }
        }
    }

    public void eliminarAlFrente() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }

        if (primerNodo == ultimoNodo) {
            primerNodo = ultimoNodo = null;
        } else {
            primerNodo = primerNodo.getSigNodo();
            primerNodo.setAntNodo(null);
        }
    }

    public void eliminarAlFinal() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }

        if (primerNodo == ultimoNodo) {
            primerNodo = ultimoNodo = null;
        } else {
            ultimoNodo = ultimoNodo.getAntNodo();
            ultimoNodo.setSigNodo(null);
        }
    }

    public void ordenarBurbuja() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null,"La lista está vacía. No hay elementos para ordenar.");
            return;
        }

        NodoLista actual;
        boolean intercambio;

        do {
            intercambio = false;
            actual = primerNodo;

            while (actual.getSigNodo() != null) {
                if (((Comparable<Object>) actual.getDato()).compareTo(actual.getSigNodo().getDato()) > 0) {
                    intercambiar(actual, actual.getSigNodo());
                    intercambio = true;
                }
                actual = actual.getSigNodo();
            }
        } while (intercambio);
    }

    private void intercambiar(NodoLista nodo1, NodoLista nodo2) {
        Object temp = nodo1.getDato();
        nodo1.setDato(nodo2.getDato());
        nodo2.setDato(temp);
    }
    public void ordenarNumerosYNoNumericos() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía. No hay elementos para ordenar.");
            return;
        }

        Lista numeros = new Lista();
        Lista noNumericos = new Lista();

        NodoLista actual = primerNodo;

        while (actual != null) {
            if (actual.getDato() instanceof Number) {
                numeros.insertarAlFinal(actual.getDato());
            } else {
                noNumericos.insertarAlFinal(actual.getDato());
            }
            actual = actual.getSigNodo();
        }

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
                noNumericos.primerNodo.setAntNodo(ultimoNodo);
            }
            ultimoNodo = noNumericos.ultimoNodo;
        }
    }

    public int busquedaSecuencial(Object datoABuscar) {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía. No se puede buscar.");
            return -1;
        }

        NodoLista actual = primerNodo;
        int posicion = 1;

        while (actual != null) {
            if (actual.getDato().equals(datoABuscar)) {
                return posicion; // Devuelve la posición del dato
            }
            actual = actual.getSigNodo();
            posicion++;
        }

        JOptionPane.showMessageDialog(null, "El dato no se encuentra en la lista.");
        return -1;
    }
}
