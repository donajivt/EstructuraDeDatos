/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author vania
 */
import java.util.Scanner;

public class l {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String input = scanner.nextLine();
        
        char[] caracteres = input.toCharArray();
        
        int mayusculas = 0;
        int minusculas = 0;
        
        for (char c : caracteres) {
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            }
        }
        
        System.out.println("Mayúsculas: " + mayusculas);
        System.out.println("Minúsculas: " + minusculas);
        
        if (esPalindromo(caracteres)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }
    
    public static boolean esPalindromo(char[] caracteres) {
        int i = 0;
        int j = caracteres.length - 1;
        
        while (i < j) {
            if (caracteres[i] != caracteres[j]) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}

