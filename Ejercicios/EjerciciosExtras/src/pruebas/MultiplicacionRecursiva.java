/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author vania
 */
public class MultiplicacionRecursiva {
    public static int multiplicacionRecursiva(int multiplicando, int multiplicador) {
        if (multiplicador == 0) {
            return 0;
        }
        if (multiplicador % 2 == 0) {
            return multiplicacionRecursiva(multiplicando * 2, multiplicador / 2);
        }
        return multiplicando + multiplicacionRecursiva(multiplicando * 2, multiplicador / 2);
    }

    public static void main(String[] args) {
        int multiplicando = 12;
        int multiplicador = 37;
        int resultado = multiplicacionRecursiva(multiplicando, multiplicador);
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}

