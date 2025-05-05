/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.principal;

import edu.mx.uttt.ciclosyrecursividad.Ciclos;
import edu.mx.uttt.ciclosyrecursividad.Recursividad;
import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Menus {

    public static void principal() {
        String menu = "Menu Principal\n" + "1)Ciclos\n" + "2)Recursividad\n"
                + "3)Arreglos\n" + "4)Listas\n" + "5)Arboles binarios\n"
                + "6)Salir\n" + "Elegir la opción:";
        String opc = "";
        boolean sentinel = true;
        do {
            opc = JOptionPane.showInputDialog(menu);

            switch (opc) {
                case "1":
                    menuCiclos();
                    break;
                case "2":
                    menuRecursividad();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (sentinel);
    }

    private static void menuCiclos() {
        String menu = "Menu de Ciclos\n"
                + "1)Ejercicio 1.-Ciclo For (Factorial)\n"
                + "2)Ejercicio 2.-Ciclo do While (Factorial)\n"
                + "3)Regresar\n"
                + "Elegir Opción: ";
        boolean sentinel = true;
        do {
            String opc = JOptionPane.showInputDialog(menu);
            switch (opc) {
                case "1":
                    Ciclos.factorialFor();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "El resultado es: "+Ciclos.serie1());
                    break;
                case "3":
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }

        } while (sentinel);
    }

    private static void menuRecursividad() {
        String menu = "Menu de Recursividad\n"
                + "1)Ejercicio 1 (Factorial)\n"
                + "2)Regresar\n"
                + "Elegir Opción: ";
        boolean sentinel = true;
        boolean sentinela = true;
        do {
            String opc = JOptionPane.showInputDialog(menu);
            switch (opc) {
                case "1":
                    do {
                        try {
                            String num = JOptionPane.showInputDialog("Ingresa el numero a calcular su factorial");
                            int n = Integer.parseInt(num);
                            JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + Recursividad.factorialRecursividad(n));
                            sentinela = false;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Datos no validos ");
                            System.out.println(e);
                        }
                    } while (sentinela);
                    break;
                case "2":
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Datos no válidos");
            }

        } while (sentinel);
    }
}
