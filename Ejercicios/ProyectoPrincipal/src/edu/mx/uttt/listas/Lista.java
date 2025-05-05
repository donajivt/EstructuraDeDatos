/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.listas;

import java.util.Comparator;
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

    public NodoLista getPrimerNodo() {
        return this.primerNodo;
    }

    public void insertarAlFrente(Object dato) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(dato);
        } else {
            primerNodo = new NodoLista(dato, primerNodo);
        }
    }

    public void imprimir() {
        if (estaVacia()) {
            //JOptionPane.showMessageDialog(null, this.nombre);
            System.out.println(this.nombre);
            return;
        }
        //JOptionPane.showMessageDialog(null, this.nombre);
        System.out.println(this.nombre);
        NodoLista aux;
        aux = primerNodo;
        while (aux != null) {
            //JOptionPane.showMessageDialog(null, aux.getDato()+"↬");
            System.out.print(aux.getDato() + "\n");
            aux = aux.getSigNodo();
        }
    }

    public NodoLista getUltimoNodo() {
        return ultimoNodo;
    }

    public void setUltimoNodo(NodoLista ultimoNodo) {
        this.ultimoNodo = ultimoNodo;
    }

    public void setPrimerNodo(NodoLista primerNodo) {
        this.primerNodo = primerNodo;
    }

    public void insertarAlFinal(Object dato) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(dato);
        } else {
            ultimoNodo.setSigNodo(new NodoLista(dato));
            ultimoNodo = ultimoNodo.getSigNodo();
        }
    }

    public void insertarEnCualquierLado(Object dato, int posicion) {
        if (posicion < 0) {
            System.out.println("La posición no puede ser negativa.");
            return;
        }

        NodoLista nuevoNodo = new NodoLista(dato);

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
                nuevoNodo.setSigNodo(aux.getSigNodo());
                aux.setSigNodo(nuevoNodo);

                if (aux == ultimoNodo) {
                    ultimoNodo = nuevoNodo;
                }
            } else {
                System.out.println("\nLa posición excede la longitud de la lista.");
            }
        }
    }

    public void eliminarAlFrente() {
        if (estaVacia()) {
            System.out.println("La lista está vacía");
            return;
        }

        if (primerNodo == ultimoNodo) {
            primerNodo = ultimoNodo = null;
        } else {
            primerNodo = primerNodo.getSigNodo();
        }
    }

    public void eliminarAlFinal() {
        if (estaVacia()) {
            System.out.println("La lista está vacía");
            return;
        }

        if (primerNodo == ultimoNodo) {
            primerNodo = ultimoNodo = null;
        } else {
            NodoLista aux = primerNodo;

            while (aux.getSigNodo() != ultimoNodo) {
                aux = aux.getSigNodo();
            }
            aux.setSigNodo(null);
            ultimoNodo = aux;
        }
    }

    public void eliminarEnCualquierLado(int posicion) {
        if (estaVacia()) {
            System.out.println("La lista está vacía. No se puede eliminar en cualquier lado.");
            return;
        }

        if (posicion < 0) {
            System.out.println("La posición no puede ser negativa.");
            return;
        }

        if (posicion == 0 || posicion == 1) {
            eliminarAlFrente();
        } else {
            NodoLista aux = primerNodo;
            int contador = 1;

            while (aux != null && contador < posicion - 1) {
                aux = aux.getSigNodo();
                contador++;
            }

            if (aux != null && aux.getSigNodo() != null) {
                aux.setSigNodo(aux.getSigNodo().getSigNodo());

                if (aux.getSigNodo() == null) {
                    ultimoNodo = aux;
                }
            } else {
                System.out.println("La posición excede la longitud de la lista.");
            }
        }
    }
    
    public void ordenarNumerosYNoNumericos() {
        if (estaVacia()) {
            System.out.println("La lista está vacía. No hay elementos para ordenar.");
            return;
        }

        NodoLista current = primerNodo;
        NodoLista ultimoNumerico = null;

        while (current != null) {
            if (current.getDato() instanceof Number) {
                ultimoNumerico = current;
            } else if (ultimoNumerico != null) {
                Object temp = current.getDato();
                eliminarNodo(current);
                insertarDespues(ultimoNumerico, temp);
            }
            current = current.getSigNodo();
        }
        ordenarBurbujaNumeros();
    }

    public void ordenarBurbujaNumeros() {
        if (estaVacia()) {
            System.out.println("La lista está vacía. No hay elementos para ordenar.");
            return;
        }

        boolean intercambio;
        do {
            intercambio = false;
            NodoLista actual = primerNodo;
            NodoLista siguiente = primerNodo.getSigNodo();

            while (siguiente != null) {
                if (actual.getDato() instanceof Number && siguiente.getDato() instanceof Number) {
                    double actualNum = ((Number) actual.getDato()).doubleValue();
                    double siguienteNum = ((Number) siguiente.getDato()).doubleValue();

                    if (actualNum > siguienteNum) {
                        // Intercambiar los datos
                        Object temp = actual.getDato();
                        actual.setDato(siguiente.getDato());
                        siguiente.setDato(temp);
                        intercambio = true;
                    }
                }

                actual = siguiente;
                siguiente = siguiente.getSigNodo();
            }
        } while (intercambio);
    }

    // Métodos adicionales para listas simples (asumiendo que se encuentran en la clase Lista)

    public void insertarDespues(NodoLista nodoAnterior, Object dato) {
        if (nodoAnterior != null) {
            NodoLista nuevoNodo = new NodoLista(dato);
            nuevoNodo.setSigNodo(nodoAnterior.getSigNodo());
            nodoAnterior.setSigNodo(nuevoNodo);
        }
    }

    public void eliminarNodo(NodoLista nodo) {
        if (nodo != null) {
            NodoLista current = primerNodo;
            NodoLista anterior = null;

            while (current != null && current != nodo) {
                anterior = current;
                current = current.getSigNodo();
            }

            if (current != null) {
                if (anterior == null) {
                    primerNodo = current.getSigNodo();
                } else {
                    anterior.setSigNodo(current.getSigNodo());
                }
            }
        }
    }
    public int busquedaSecuencial(Object datoABuscar) {
        NodoLista actual = primerNodo;
        int posicion = 1;

        while (actual != null) {
            if (actual.getDato().equals(datoABuscar)) {
                return posicion; // Se encontró el dato, devuelve la posición actual
            }
            actual = actual.getSigNodo();
            posicion++;
        }

        return -1; // No se encontró el dato
    }

    
}
