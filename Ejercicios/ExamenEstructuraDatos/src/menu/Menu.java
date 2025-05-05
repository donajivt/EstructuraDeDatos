/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import javax.swing.JOptionPane;
import ejercicios.OperacionesRecursivas;
/**
 *
 * @author vania
 */
public class Menu {
    public static void principal() {
        String menu = "Menu Principal\n" + "1)Ejercicio 1\n" + "2)Ejercicio 2\n"
                + "3)Regresar\n"+ "Elegir la opción:";
        String opc = "";
        boolean sentinel = true;
        boolean sentinela = true;
        do {
            opc = JOptionPane.showInputDialog(menu);

            switch (opc) {
                case "1":
                    do {
                        try {
                            String num = JOptionPane.showInputDialog("Ingresa un numero");
                            int n = Integer.parseInt(num);
                            JOptionPane.showMessageDialog(null, "El resultado de es: "+OperacionesRecursivas.ejercicio1(n));
                            sentinela = false;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Datos no validos ");
                            System.out.println(e);
                        }
                    } while (sentinela);
                    break;
                case "2":
                    do {
                        try {
                            String num = JOptionPane.showInputDialog("Ingresa el numero de calificaciones");
                            int n = Integer.parseInt(num);
                            if(n>=0){
                            JOptionPane.showMessageDialog(null, "El promedio es: "+ OperacionesRecursivas.calcularEjercicio(n));
                            sentinela = false;
                            }else{
                                JOptionPane.showMessageDialog(null, "El valor ingresado es inválido, intente con otro valor");
                            }
                            
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Datos no validos ");
                            System.out.println(e);
                        }
                    } while (sentinela);
                    break;
                case "3":
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (sentinel);
    }
}
