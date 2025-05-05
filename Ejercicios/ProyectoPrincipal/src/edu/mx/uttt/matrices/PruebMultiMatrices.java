/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class PruebMultiMatrices {

    public static void main(String[] args) {
        String filas = JOptionPane.showInputDialog("Ingresa el tamaño de las filas");
        String columnas = JOptionPane.showInputDialog("Ingresa el tamaño de las columnas");
        String filas2 = JOptionPane.showInputDialog("Ingresa el tamaño de las filas");
        String columnas2 = JOptionPane.showInputDialog("Ingresa el tamaño de las columnas");
        int f = Integer.parseInt(filas);
        int c = Integer.parseInt(columnas);
        int f2 = Integer.parseInt(filas2);
        int c2 = Integer.parseInt(columnas2);
        int[][] m = new int[f][c];
        int[][] matriz = new int[f2][c2];
        llenarMatriz(m);
        llenarMatriz2(matriz);
        System.out.println("Multiplicacion: \n" + multiplicar(m, matriz));
        System.out.println("Suma Diagonal: \n" + sumaDiagonal(m));
        System.out.println("Imprimir al reves:\n" + imprimirAlrz(m));
        System.out.println("Suma antidiagonal:\n" + sumaAntidiagonal(m));
    }

    public static void llenarMatriz(int[][] matriz) {
        int i = 0;
        int j = 0;
        do {
            i = 0;
            while (i < matriz[0].length) {
                matriz[j][i] = solicitarValor();
                i++;
            }
            j++;
        } while (j < matriz.length);
    }

    public static void llenarMatriz2(int[][] matriz) {
        int i = 0;
        int j = 0;
        do {
            i = 0;
            while (i < matriz[0].length) {
                matriz[j][i] = solicitarValor();
                i++;
            }
            j++;
        } while (j < matriz.length);
    }

    private static int solicitarValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor"));
    }

    public static String multiplicar(int[][] m, int[][] matriz) {
        String salida = "";
        int mul = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    mul += m[i][k] * matriz[k][j];
                }
                salida += mul + " | ";
                mul = 0;
            }
            salida += "\n";
        }
        return salida;
    }

    public static int sumaDiagonal(int[][] m) {

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

    public static String imprimirAlrz(int[][] m) {
        String salida = "";
        int mul = m.length - 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = mul; j >= 0; j--) {
                salida += m[i][j] + " | ";
            }
            salida += "\n";
        }

        return salida;
    }

    public static int[][] acomodar(int[][] m) {
        int r = m.length;
        int s = 0;
        int h = 0;
        int[][] resultado = new int[r][r];
        for (int i = 0; i < m.length; i++) {
            h=0;
            for (int j = r - 1; j >= 0; j--) {
                resultado[s][h] = m[i][j];
                h++;
            }
            s++;
        }
        return resultado;
    }

    public static int sumaAntidiagonal(int[][] m) {
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
}