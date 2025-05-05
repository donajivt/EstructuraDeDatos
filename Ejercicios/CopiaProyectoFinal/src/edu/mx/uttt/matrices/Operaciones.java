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
public class Operaciones {
    private int[][] matriz;

    public Operaciones(int fila, int columna) {
        matriz = new int[fila][columna];
    }

    public void llenarMatriz() {
        boolean flag = false;
        int i = 0;
        int j= 0;
        do{
            i=0;
            while(i<this.matriz[this.matriz.length-1].length){
                do {
                try {
                    this.matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
                    flag = false;
                } catch (NumberFormatException e) {
                    flag = true;
                    JOptionPane.showMessageDialog(null, "Introduce un valor válido");
                }
            } while (flag);
                i++;
            }
            j++;
        }while(j < matriz.length);
    }
    
    public  String suma(int [][]m){
        int filas = 0;
        int columnas= 0;
        String resultado="";
        int f= m.length;
        int c = m[0].length;
        int [][] res = new int[f][c];
        do{
            columnas=0;
            while(columnas<m[filas].length){
                res[filas][columnas]= m[filas][columnas] + matriz[filas][columnas];
                resultado += res[filas][columnas] + " ";
                columnas++;
            }
            resultado +="\n";
            filas++;
        }while(filas < m.length);
        System.out.print(resultado);
        return resultado;
    }
    public  String resta(int [][]m){
        int filas = 0;
        int columnas= 0;
        String resultado="";
        int f= m.length;
        int c = m[0].length;
        int [][] res = new int[f][c];
        do{
            columnas=0;
            while(columnas<m[filas].length){
                res[filas][columnas]= m[filas][columnas] - matriz[filas][columnas];
                resultado += res[filas][columnas] + " ";
                columnas++;
            }
            resultado +="\n";
            filas++;
        }while(filas < m.length);
        System.out.print(resultado);
        return resultado;
    }
    public  String imprimir(){
        int filas = 0;
        int columnas= 0;
        String resultado="";
        do{
            columnas=0;
            while(columnas<matriz[filas].length){
                resultado += matriz[filas][columnas] + " ";
                columnas++;
            }
            resultado +="\n";
            filas++;
        }while(filas < matriz.length);
        System.out.print(resultado);
        return resultado;
    }
    
    public String totalVentas() {
        String salida = "";
        int [] holi = new int[2];
        double suma = 0;
        salida = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                holi[i] += matriz[i][j];
                
                suma = 0;
            }
            salida += holi[i] + " ";
            salida += "\n";
        }

        return salida;
    }

    public int[][] getMatriz() {
        return matriz;
    }
    public String multiplicar(int[][] m) {
        String salida="";
        int mul=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < m.length; k++) {
                    mul += matriz[i][k] * m[k][j];
                }
                salida += mul + " | ";
                mul=0;
            }
           salida += "\n"; 
        }
        return salida;
    }
}
