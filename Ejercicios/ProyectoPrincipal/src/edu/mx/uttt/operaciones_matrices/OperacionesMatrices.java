/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.operaciones_matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class OperacionesMatrices implements IOperaciones {
    private int m [][];
    private int numeroFila;
    private int numeroColumna;

    public OperacionesMatrices(int numeroFila, int numeroColumna) {
        this.setNumeroFila(numeroFila);
        this.setNumeroColumna(numeroColumna);
        m=new int[this.numeroFila][this.numeroColumna];
    }
    
    public void setNumeroFila(int numeroFila){
        this.numeroFila = (numeroFila>=0)?numeroFila: 2;
    }
    
    public void setNumeroColumna(int numeroColumna){
        this.numeroColumna = (numeroColumna>=0)?numeroColumna: 2;
    }
    
    public void setM(int [][] m){
        for(int i = 0; i<this.m.length; i++){
            this.m[i] = m[i];
        }
    }
    public int getNumeroFilas (){
        return this.numeroFila;
    }
    
    public int getNumeroColumna (){
        return this.numeroColumna;
    }
    
    public int [][] getM(){
        return this.m;
    }

    @Override
    public String sumar(int[][] m) {
        String salida = "ERROR";
        int suma=0;
        if(validarDimensiones(m.length,m[0].length)){
            salida = "";
            for (int i = 0; i < this.m.length; i++) {
                for (int j = 0; j < this.m[0].length; j++) {
                    suma+=m[i][j] + this.m[i][j];
                    salida+=suma+" ";
                    suma=0;
                }
                salida+="\n";
            }
            
        }
        return salida;
    }

    @Override
    public String restar(int[][] m) {
        String salida = "ERROR";
        int suma=0;
        if(validarDimensiones(m.length,m[0].length)){
            salida = "";
            for (int i = 0; i < this.m.length; i++) {
                for (int j = 0; j < this.m[0].length; j++) {
                    suma+=m[i][j] - this.m[i][j];
                    salida+=suma+" ";
                    suma=0;
                }
                salida+="\n";
            }
            
        }
        return salida;
    }

    @Override
    public String multiplicar(int[][] m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private boolean validarDimensiones(int f, int c){
        return this.numeroFila== f && this.numeroColumna == c;
    }
    public void llenarMatriz(){
        for(int i=0;i<m.length;i++){
            for (int j = 0; j < m[0].length; j++) {
                m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición: ["+(i+1)+"]"));
            }
        }
    }
}

