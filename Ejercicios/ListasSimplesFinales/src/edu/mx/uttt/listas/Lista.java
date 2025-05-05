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
public class Lista<T> {

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

    public NodoLista getPrimerNodo() {
        return primerNodo;
    }

    public void setPrimerNodo(NodoLista primerNodo) {
        this.primerNodo = primerNodo;
    }

    public NodoLista getUltimoNodo() {
        return ultimoNodo;
    }

    public void setUltimoNodo(NodoLista ultimoNodo) {
        this.ultimoNodo = ultimoNodo;
    }

    public boolean estaVacia() {
        return primerNodo == null;
    }

    public void insertarAlFrente(Object dato) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(dato);
        } else {
            primerNodo = new NodoLista(dato, primerNodo);
        }
    }

    public String imprimir() {
        String salida="";
        if (estaVacia()) {
            //JOptionPane.showMessageDialog(null, this.nombre);
            salida=(this.nombre+"\n");
            return salida;
        }
        //JOptionPane.showMessageDialog(null, this.nombre);
        salida=(this.nombre+"\n");
        NodoLista aux;
        aux = primerNodo;
        while (aux != null) {
            //JOptionPane.showMessageDialog(null, aux.getDato()+"↬");
            salida+=(aux.getDato() + " \n");
            aux = aux.getSigNodo();
        }
        return salida;
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
            JOptionPane.showMessageDialog(null,"La posición no puede ser negativa.");
            return;
        }

        NodoLista nuevoNodo = new NodoLista(dato);

        if (estaVacia()) {
            primerNodo = ultimoNodo = nuevoNodo;
        }else if (posicion == 1 || posicion == 0) {
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
                JOptionPane.showMessageDialog(null,"\nLa posición excede la longitud de la lista.");
            }
        }
    }

    public void eliminarAlFrente() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null,"La lista está vacía");
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
            JOptionPane.showMessageDialog(null,"La lista está vacía");
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
            JOptionPane.showMessageDialog(null,"La lista está vacía. No se puede eliminar en cualquier lado.");
            return;
        }

        if (posicion < 0) {
            JOptionPane.showMessageDialog(null,"La posición no puede ser negativa.");
            return;
        }

        if (posicion == 0|| posicion ==1) {
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
                JOptionPane.showMessageDialog(null,"La posición excede la longitud de la lista.");
            }
        }
    }

    public void ordenarBurbuja(Comparator<Object> comparador) {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null,"La lista está vacía.");
            return;
        }

        boolean intercambio;
        do {
            intercambio = false;
            NodoLista actual = primerNodo;
            NodoLista siguiente = primerNodo.getSigNodo();

            while (siguiente != null) {
                if (comparador.compare(actual.getDato(), siguiente.getDato()) > 0) {
                    // Intercambiar los datos
                    Object temp = actual.getDato();
                    actual.setDato(siguiente.getDato());
                    siguiente.setDato(temp);
                    intercambio = true;
                }

                actual = siguiente;
                siguiente = siguiente.getSigNodo();
            }
        } while (intercambio);
    }
    public void ordenarShell(Comparator<T> comparador) {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null,"La lista está vacía.");
            return;
        }

        int n = contarElementos();
        int brecha = 1;

        // Calcular la brecha inicial
        while (brecha < n / 3) {
            brecha = brecha * 3 + 1;
        }

        while (brecha > 0) {
            for (int i = brecha; i < n; i++) {
                T temp = getElementoEn(i);
                int j = i;

                // Realizar la inserción por brecha
                while (j >= brecha && comparador.compare(getElementoEn(j - brecha), temp) > 0) {
                    setElementoEn(j, getElementoEn(j - brecha));
                    j -= brecha;
                }

                setElementoEn(j, temp);
            }

            brecha /= 3;
        }
    }

    private int contarElementos() {
        int contador = 0;
        NodoLista aux = primerNodo;
        while (aux != null) {
            contador++;
            aux = aux.getSigNodo();
        }
        return contador;
    }

    private T getElementoEn(int indice) {
        NodoLista aux = primerNodo;
        for (int i = 0; i < indice; i++) {
            aux = aux.getSigNodo();
        }
        return (T) aux.getDato();
    }

    private void setElementoEn(int indice, T dato) {
        NodoLista aux = primerNodo;
        for (int i = 0; i < indice; i++) {
            aux = aux.getSigNodo();
        }
        aux.setDato(dato);
    }
    public void ordenarMerge(Comparator<T> comparador) {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null,"La lista está vacía.");
            return;
        }

        int n = contarElementos();

        if (n > 1) {
            // Dividir la lista en mitades
            int mitad = n / 2;

            Lista<T> mitadIzquierda = dividir(0, mitad - 1);
            Lista<T> mitadDerecha = dividir(mitad, n - 1);

            // Ordenar recursivamente ambas mitades
            mitadIzquierda.ordenarMerge(comparador);
            mitadDerecha.ordenarMerge(comparador);

            // Combinar las mitades ordenadas
            combinar(mitadIzquierda, mitadDerecha, comparador);
        }
    }

    private Lista<T> dividir(int inicio, int fin) {
        Lista<T> nuevaLista = new Lista<>();

        for (int i = inicio; i <= fin; i++) {
            nuevaLista.insertarAlFinal(getElementoEn(i));
        }

        return nuevaLista;
    }

    private void combinar(Lista<T> izquierda, Lista<T> derecha, Comparator<T> comparador) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < izquierda.contarElementos() && j < derecha.contarElementos()) {
            if (comparador.compare(izquierda.getElementoEn(i), derecha.getElementoEn(j)) < 0) {
                setElementoEn(k, izquierda.getElementoEn(i));
                i++;
            } else {
                setElementoEn(k, derecha.getElementoEn(j));
                j++;
            }
            k++;
        }

        while (i < izquierda.contarElementos()) {
            setElementoEn(k, izquierda.getElementoEn(i));
            i++;
            k++;
        }

        while (j < derecha.contarElementos()) {
            setElementoEn(k, derecha.getElementoEn(j));
            j++;
            k++;
        }
    }
    public void ordenarQuick(Comparator<T> comparador) {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null,"La lista está vacía.");
            return;
        }

        int n = contarElementos();
        quickSort(0, n - 1, comparador);
    }

    private void quickSort(int izquierda, int derecha, Comparator<T> comparador) {
        if (izquierda < derecha) {
            // Obtener el índice de partición
            int indiceParticion = particionar(izquierda, derecha, comparador);

            // Recursivamente ordenar las dos sub-listas
            quickSort(izquierda, indiceParticion - 1, comparador);
            quickSort(indiceParticion + 1, derecha, comparador);
        }
    }

    private int particionar(int izquierda, int derecha, Comparator<T> comparador) {
        T pivot = getElementoEn(derecha); // Tomar el último elemento como pivote
        int i = izquierda - 1;

        for (int j = izquierda; j < derecha; j++) {
            if (comparador.compare(getElementoEn(j), pivot) <= 0) {
                i++;

                // Intercambiar los elementos en i y j
                T temp = getElementoEn(i);
                setElementoEn(i, getElementoEn(j));
                setElementoEn(j, temp);
            }
        }

        // Intercambiar el pivote con el elemento en (i + 1)
        T temp = getElementoEn(i + 1);
        setElementoEn(i + 1, pivot);
        setElementoEn(derecha, temp);

        return i + 1;
    }
    public int buscarSecuencial(T elemento, Comparator<T> comparador) {
        NodoLista actual = primerNodo;
        int indice = 1;

        while (actual != null) {
            if (comparador.compare((T) actual.getDato(), elemento) == 0) {
                // Elemento encontrado, devuelve el índice
                return indice;
            }

            actual = actual.getSigNodo();
            indice++;
        }

        // Elemento no encontrado
        return -1;
    }
    public int buscarBinaria(T elemento, Comparator<T> comparador) {
        ordenarQuick(comparador);

        return busquedaBinariaRecursiva(elemento, comparador, 0, contarElementos()-1);
    }

    private int busquedaBinariaRecursiva(T elemento, Comparator<T> comparador, int izquierda, int derecha) {
        if (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            int comparacion = comparador.compare(getElementoEn(medio), elemento);

            if (comparacion == 0) {
                return medio;
            }

            if (comparacion > 0) {
                return busquedaBinariaRecursiva(elemento, comparador, izquierda, medio - 1);
            }

            return busquedaBinariaRecursiva(elemento, comparador, medio + 1, derecha);
        }

        return -1;
    }
}
