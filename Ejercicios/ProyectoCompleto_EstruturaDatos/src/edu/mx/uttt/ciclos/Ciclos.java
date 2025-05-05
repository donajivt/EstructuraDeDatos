/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Ciclos {

    public static void factorialFor() {
        boolean sentinel = true;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de tu serie"));
        long fact = 1;
        do {
            try {
                if (n > 0) {
                    for (int i = 1; i <= n; i++) {
                        fact *= i;
                    }
                    JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + fact);
                    sentinel = false;
                }else{
                    JOptionPane.showMessageDialog(null, "Datos no validos ");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Datos no validos ");
                System.out.println(e);
            }
        } while (sentinel);
    }

    public static void factorialDoWhile() {
        boolean sentinel = true;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de tu serie"));
        do {
            try {
                long fact = 1;
                if (n > 0) {
                    int i = 1;
                    do {
                        fact *= i;
                        i++;
                    } while (i <= n);
                    JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + fact);
                    sentinel = false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Datos no validos ");
                System.out.println(e);
            }
        } while (sentinel);
    }

    public static void serie1() {
        int n = 2;
        double x = 3.0, den1 = 3.0, den2 = 1.0;
        JOptionPane.showMessageDialog(null,serieCiclica(x, n, den1, den2));
    }

    private static double serieCiclica(double x, int n, double den1, double den2) {
        int i = 1;
        double r = 0;
        do {
            r += Math.pow(x, 3.0 / den1) / den2;

            den1 += 3;
            den2 += 2;
            i++;
        } while (i <= n);

        return r;
    }

    public static double serie2(int n) {
        double s = 0;
        for (double i = 1.0; i <= n; i++) {
            s += (1 / i);
            System.out.println(s);
        }
        return s;
    }

    public static void serie3() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        double sumador = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sumador = Math.pow(i, 2);
                System.out.println(sumador);
            }
            JOptionPane.showMessageDialog(null, "El resultado es: " + sumador);
        }
    }

    private static long serieFactorial(int n) {
        // n es el numero a sacar el factorial
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        // imprimimos la variable fact donde se acumula el resultado del factorial para comprobar que este correcto
        System.out.println("Factorial: " + fact);

        // retornamos el factorial de n
        return fact;
    }

    // Hacemos un método para calcular la serie, donde n es las veces que se repetira la serie
    public static double serieDivision4(int n) {
        // inicializamos nuestro sumador del resultado de la serie
        double s = 0;
        double t = 0;
        // le decimos que f es igual a 2, ya que nuestro factorial va de 2 en 2 en nuestra serie
        int f = 2;
        for (double i = 1; i <= n; i++) {
            // Hacemos nuestra operacion, mandando a f en el metodo para sacar el factorial
            s += i / serieFactorial(f);
            // hago esta operación para ver mi operación sin la suma y saber si esta correcta cada división.
            t = i / serieFactorial(f);
            //sumamos de 2 en 2 el factorial de nuestra serie
            f += 2;
            // imprimimos para checar que este bien según nuestra prueba de escritorio.
            System.out.println("Resultado: " + s);
            System.out.println(t);
        }
        // retornamos nuestro sumador.
        return s;
    }

    public static void serie5(int multiplicando, int multiplicador) {
        int suma = 0;
        while (multiplicador > 1) {

            // Multiplicamos a multiplicando y lo imprimimos para verificar los resultados
            multiplicando *= 2;
            // volvemos a redondear cada que lo llame el ciclo ya que es una división y sale punto decimal
            System.out.println("multiplicando " + multiplicando);
            // Dividimos a multiplicador y lo imprimimos para verificar los resultados
            multiplicador /= 2;
            System.out.println("multiplicador " + multiplicador);
        }
        //Imprimimos el resultado correcto
        JOptionPane.showMessageDialog(null, "Multiplicando: " + multiplicando + "\nMultiplicador: " + multiplicador);
    }

    //Realizamos un metodo para sumar los numeros del multiplicando, cada que el multiplicador sea impar
    public static int sumaImpares(long multiplicando, long multiplicador) {
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

    public static int mcd(int v1, int v2) {
        int aux = 0;
        while (v1 % v2 != 0) {
            aux = v2;
            v2 = v1 % v2;
            v1 = aux;
        }
        return v2;
    }

    public static int potencia(int base, int exponente) {
        if (exponente >= 0 && base > 0) {
            int potencia = 1;
            for (int i = 1; i <= exponente; i++) {
                potencia *= base;
            }
            return potencia;
        } else {
            return 0;
        }
    }
}
