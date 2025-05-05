/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.matrices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class OperacionesMatrices{

    private int m[][];
    private int numeroFila;
    private int numeroColumna;

    public OperacionesMatrices(int numeroFila, int numeroColumna) {
        this.setNumeroFila(numeroFila);
        this.setNumeroColumna(numeroColumna);
        m = new int[this.numeroFila][this.numeroColumna];
    }

    public void setNumeroFila(int numeroFila) {
        this.numeroFila = (numeroFila >= 0) ? numeroFila : 2;
    }

    public void setNumeroColumna(int numeroColumna) {
        this.numeroColumna = (numeroColumna >= 0) ? numeroColumna : 2;
    }

    public void setM(int[][] m) {
        for (int i = 0; i < this.m.length; i++) {
            this.m[i] = m[i];
        }
    }

    public int getNumeroFilas() {
        return this.numeroFila;
    }

    public int getNumeroColumna() {
        return this.numeroColumna;
    }

    public int[][] getM() {
        return this.m;
    }

    public void llenarMatriz() {
        boolean flag = false;
        int i = 0;
        int j = 0;
        do {
            i = 0;
            while (i < this.m[this.m.length - 1].length) {
                do {
                    try {
                        this.m[j][i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
                        flag = false;
                    } catch (NumberFormatException e) {
                        flag = true;
                        JOptionPane.showMessageDialog(null, "Introduce un valor válido");
                    }
                } while (flag);
                i++;
            }
            j++;
        } while (j < m.length);
    }

    public int[][] sumar(int[][] m) {
        int[][] suma = new int[m.length][m[0].length];
        if (validarDimensiones(m.length, m[0].length)) {
            for (int i = 0; i < this.m.length; i++) {
                for (int j = 0; j < this.m[0].length; j++) {
                    suma[i][j] = m[i][j] + this.m[i][j];
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "La operación seleccionada no se puede realizar.");
        }
        return suma;
    }

    public int[][] restar(int[][] m) {
        int[][] resta = new int[m.length][m[0].length];
        if (validarDimensiones(m.length, m[0].length)) {
            for (int i = 0; i < this.m.length; i++) {
                for (int j = 0; j < this.m[0].length; j++) {
                    resta[i][j] = m[i][j] - this.m[i][j];
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "La operación seleccionada no se puede realizar.");
        }
        return resta;
    }

    public int[][] multiplicar(int[][] m) {
        int filaA = this.m.length;
        int columnaA = this.m[0].length;
        int filaB = m.length;
        int columnaB = m[0].length;

        if (columnaA != filaB) {
            throw new IllegalArgumentException("No se pueden multiplicar las matrices: el número de columnas de la primer matriz debe ser igual al número de filas de la segunda matriz .");
        }
        int[][] resultado = new int[filaA][columnaB];

        for (int i = 0; i < filaA; i++) {
            for (int j = 0; j < columnaB; j++) {
                for (int k = 0; k < columnaA; k++) {
                    resultado[i][j] += this.m[i][k] * m[k][j];
                }
            }
        }

        return resultado;
    }

    private boolean validarDimensiones(int f, int c) {
        return this.numeroFila == f && this.numeroColumna == c;
    }
    public boolean validar() {
        return numeroFila == numeroColumna;
    }

    public int sumaDiagonal() {

        int mul = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i == j) {
                    mul += m[i][j];

                }
            }

        }

        return mul;
    }

    public static int[][] acomodar(int[][] m) {
        int r = m.length;
        int s = 0;
        int h = 0;
        int[][] resultado = new int[r][r];
        for (int i = 0; i < m.length; i++) {
            h = 0;
            for (int j = r - 1; j >= 0; j--) {
                resultado[s][h] = m[i][j];
                h++;
            }
            s++;
        }
        return resultado;
    }

    public int sumaAntidiagonal() {
        int[][] ac = acomodar(m);
        String s = "";
        int mul = 0;
        for (int i = 0; i < ac.length; i++) {
            for (int j = 0; j < ac[0].length; j++) {
                if (i == j) {
                    mul += ac[i][j];
                }
                s += ac[i][j] + " | ";
            }
            s += "\n";
        }
        System.out.println(s);
        return mul;
    }

    public void llenarMatriz1() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición: [" + (i + 1) + "]"));
            }
        }
    }

    public String imprimir() {
        int filas = 0;
        int columnas = 0;
        String resultado = "";
        do {
            columnas = 0;
            while (columnas < m[filas].length) {
                resultado += m[filas][columnas] + " ";
                columnas++;
            }
            resultado += "\n";
            filas++;
        } while (filas < m.length);
        System.out.print(resultado);
        return resultado;
    }

    public double calcularMedia() {
        int totalElementos = 0;
        int suma = 0;

        // Recorre la matriz y suma todos los elementos
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];
                totalElementos++;
            }
        }

        // Calcula la media
        if (totalElementos > 0) {
            double media = (double) suma / totalElementos;
            return media;
        } else {
            // En caso de una matriz vacía o sin elementos
            return 0.0; // O puedes manejar este caso de otra manera, como lanzar una excepción
        }
    }

    public double calcularMediana() {
        // Obtén todos los elementos de la matriz y guárdalos en una lista
        List<Integer> elementos = new ArrayList<>();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                elementos.add(m[i][j]);
            }
        }

        // Ordena la lista de elementos
        Collections.sort(elementos);

        int n = elementos.size();

        if (n % 2 == 0) {
            // Si el número de elementos es par, toma el promedio de los dos elementos del medio
            int middle1 = elementos.get(n / 2 - 1);
            int middle2 = elementos.get(n / 2);
            return (double) (middle1 + middle2) / 2.0;
        } else {
            // Si el número de elementos es impar, toma el elemento del medio
            return (double) elementos.get(n / 2);
        }
    }

    public List<Integer> calcularModa() {
        // Obtén todos los elementos de la matriz y guárdalos en una lista
        List<Integer> elementos = new ArrayList<>();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                elementos.add(m[i][j]);
            }
        }

        // Calcula la moda
        Map<Integer, Integer> conteo = new HashMap<>();
        List<Integer> moda = new ArrayList<>();
        int maxFrecuencia = 0;

        for (int elemento : elementos) {
            int frecuencia = conteo.getOrDefault(elemento, 0) + 1;
            conteo.put(elemento, frecuencia);

            if (frecuencia > maxFrecuencia) {
                moda.clear();
                moda.add(elemento);
                maxFrecuencia = frecuencia;
            } else if (frecuencia == maxFrecuencia && !moda.contains(elemento)) {
                moda.add(elemento);
            }
        }

        return moda;
    }

    public double calcularDesviacionEstandar() {
        // Calcular la media de la matriz
        double media = calcularMedia();

        // Calcular la suma de los cuadrados de las diferencias entre cada elemento y la media
        double sumaDiferenciasCuadradas = 0.0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                double diferencia = m[i][j] - media;
                sumaDiferenciasCuadradas += Math.pow(diferencia, 2);
            }
        }

        // Calcular la varianza
        double varianza = sumaDiferenciasCuadradas / (m.length * m[0].length);

        // Calcular la desviación estándar como la raíz cuadrada de la varianza
        double desviacionEstandar = Math.sqrt(varianza);

        return desviacionEstandar;
    }
    public void ordenarBurbuja(boolean tipo){
     
       convertirAMatriz(ordenarBurbuja(convertirAVector(), tipo));
    }
   
    private void convertirAMatriz(int [] vector){
        int k =0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = vector[k];
                k++;
            }
        }
    }
   
    private int[] convertirAVector (){
          int [] vector = new int [m.length * m[0].length];
        int k =0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                vector[k] = m[i][j];
                k++;
            }
        }
       
        return vector;
    }
   
    private int [] ordenarBurbuja(int [] vector, boolean tipo){
        if(tipo){
          //Ordenar Ascendente
           
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    // Intercambiar arreglo[j] y arreglo[j+1]
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
      } else{
          //Ordenar Descendente
           for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] < vector[j + 1]) {
                    // Intercambiar arreglo[j] y arreglo[j+1]
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
      }
        return vector;
    }

}
