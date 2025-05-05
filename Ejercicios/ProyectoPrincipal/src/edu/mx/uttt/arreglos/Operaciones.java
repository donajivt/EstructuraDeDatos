/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Operaciones {

    private int[] arreglo;

    public Operaciones(int tamanio) {
        arreglo = new int[tamanio];
    }

    public void llenarArreglo() {
        int i = 0;
        while (i < arreglo.length) {
            arreglo[i] = solicitarValor();
            i++;
        }
    }

    public  void llenarArreglo2(int[] arreglo2) {
        int i = 0;
        while (i < arreglo2.length) {
            arreglo2[i] = solicitarValor();
            i++;
        }
    }

    public String imprimirArreglo(int[] arreglo2) {

        String n = "Suma de Vectores: ";
        int[] resultado = sumarVectores(arreglo2);
        for (int i = 0; i < this.arreglo.length; i++) {
            n += resultado[i] + " | ";
        }
        return n;
    }

    public int solicitarValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor"));
    }

    public String imprimir() {
        String n = "Vector Ingresado: \n";
        for (int i = 0; i < this.arreglo.length; i++) {
            n += arreglo[i] + "\n";
        }
        return n;
    }

    public String imprimirArreglo2(int [] arreglo2) {
        String n = "Vector 2: ";
        for (int i = 0; i < arreglo2.length; i++) {
            n += arreglo2[i] + " | ";
        }
        return n;
    }
    public int numeroMayor() {

        int mayor = arreglo[0]; 

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i]; 
            }
        }

        return mayor;
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int numerosPrimos() {
        int s = 0;

        for (int num : arreglo) {
            if (isPrimo(num)) {
                s++;
            }
        }

        return s;
    }

    public int sumaValores() {
        int s = 0;
        for (int i = 0; i < this.arreglo.length; i++) {
            s += arreglo[i];
        }
        return s;
    }

    public int numerosPares() {
        int s = 0;

        for (int numero : arreglo) {
            if (numero % 2 == 0) {
                s++;
            }
        }

        return s;
    }

    public int[] sumarVectores(int[] arreglo2) {

        int longitud = arreglo.length;
        int[] resultado = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            resultado[i] = arreglo[i] + arreglo2[i];
            System.out.println(resultado[i]);
        }

        return resultado;
    }


    public String buscarValor(int[] arreglo2) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor a buscar en el Vector"));
        String n = "";
        for (int i = 0; i < arreglo2.length; i++) {
            if (arreglo2[i] == x) {
                n = "Posición: " + i;
                return n;
            }
        }
        n = "El valor no existe en el vector";
        return n;
    }
    public String copiarVector(int [] arreglo2){
        String n="Vector 2: ";
        for (int i = 0; i < arreglo.length; i++) {
            arreglo2[i] = arreglo[i];
            n+= arreglo2[i] + " | ";
        }
        return n;
    }
    public void ordenarAsc(){
       
        int s=0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    s = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = s;
                }
            }
        }
    }

    public int[] getArreglo() {
        return arreglo;
    }
    public void ordenarDesc(){
        int s=0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    s = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = s;
                }
            }
        }
    }
    

    public  String imprimirBurbuja() {
        String n="";
        for (int value : arreglo) {
            n+= value + " | ";
        }
        return n+="\n";
    }
}
