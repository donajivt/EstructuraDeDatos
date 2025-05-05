/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.ventas;

/**
 *
 * @author vania
 */
public class TotalVentas extends Ventas {

    double totalV[] = new double[5];

    public TotalVentas(int numeroColumna) {
        super(numeroColumna);
    }

    public String totalVentas(double [][] matriz) {
        String salida = "";
        double suma = 0;
        salida = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                totalV[i] += matriz[i][j];
                
                suma = 0;
            }
            salida += totalV[i] + "\n";
            salida += "\n" +"\n";
        }

        return salida;
    }
}
