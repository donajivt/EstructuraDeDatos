/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.ventas;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Ventas {
    private double m1 [][];
    private int numeroFila = 5;
    private int numeroColumna;

    public Ventas(int numeroColumna) {
        this.setNumeroColumna(numeroColumna);
        m1 = new double[this.numeroFila][this.numeroColumna];
    }
    
//    public void setNumeroFila(int numeroFila){
//        this.numeroFila = (numeroFila>=0)?numeroFila: 2;
//    }
    
    public void setNumeroColumna(int numeroColumna){
        this.numeroColumna = (numeroColumna>=0)?numeroColumna: 2;
    }
    
    public void setM(double [][] m){
        for(int i = 0; i<this.m1.length; i++){
            this.m1[i] = m[i];
        }
    }

    public int getNumeroFila() {
        return numeroFila;
    }

    public void setNumeroFila(int numeroFila) {
        this.numeroFila = numeroFila;
    }
    
    public int getNumeroColumna (){
        return this.numeroColumna;
    }
    
    public double [][] getM1(){
        return this.m1;
    }
    public void llenarMatriz(){
        int n=m1.length;
        for(int i=0;i<m1.length;i++){
            for (int j = 0; j < m1[0].length; j++) {
                
                m1[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta del día "+(n)+": "));
                if(n==1){
                    n=6;
                }
                n--;
            }
        }
    }
    public  String imprimir(){
        int filas = 0;
        int columnas= 0;
        String resultado="";
        do{
            columnas=0;
            while(columnas<m1[filas].length){
                resultado += m1[filas][columnas] + "    |   ";
                columnas++;
            }
            resultado +="\n" + "\n"+"\n";
            filas++;
        }while(filas < m1.length);
        System.out.print(resultado);
        return resultado;
    }
}
