/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author vania
 */
public class SumaVectores {

    public static void main(String[] args) {
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {6, 7, 8, 9, 10};

        int[] resultado = sumarVectores(vector1, vector2);

        System.out.print("Vector resultado: ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }

    public static int[] sumarVectores(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Los vectores deben tener la misma longitud.");
        }

        int longitud = vector1.length;
        int[] resultado = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            resultado[i] = vector1[i] + vector2[i];
        }

        return resultado;
    }
}


