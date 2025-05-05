/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author vania
 */
public class MultiplicacionCiclica {
    public static int multiplicacionCiclica(int multiplicando, int multiplicador) {
        int resultado = 0;
        while (multiplicador > 0) {
            if (multiplicador % 2 != 0) {
                resultado += multiplicando;
            }
            multiplicando *= 2;
            multiplicador /= 2;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int multiplicando = 12;
        int multiplicador = 37;
        int resultado = multiplicacionCiclica(multiplicando, multiplicador);
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}

