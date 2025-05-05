/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.arreglos;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Operaciones {

    private int[] arreglo;

    public Operaciones(int tamanio) {
        arreglo = new int[tamanio];
    }
    public Operaciones(){
        
    }

    public void llenarArreglo() {
        boolean flag = false;
        for (int i = 0; i < this.arreglo.length; i++) {
            do {
                try {
                    this.arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
                    flag = false;
                } catch (NumberFormatException e) {
                    flag = true;
                    JOptionPane.showMessageDialog(null, "Introduce un valor válido");
                }
            } while (flag);
        }
    }

    public void llenarArreglo2(int[] arreglo2) {
        int i = 0;
        while (i < arreglo2.length) {
            arreglo2[i] = solicitarValor();
            i++;
        }
    }

    public String imprimirArreglo(int[] arreglo2) {

        String n = "Suma de Vectores: ";
        int[] resultado = sumarVectores(arreglo2);
        for (int i = 0; i < this.arreglo.length; i++) {
            n += resultado[i] + " | ";
        }
        return n;
    }

    private static int solicitarValor() {

        return Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor"));
    }

    public String imprimir() {
        String n = "Vector Ingresado: ";
        for (int i = 0; i < this.arreglo.length; i++) {
            n += arreglo[i] + " | ";
        }
        return n;
    }

    public String imprimirArreglo2(int[] arreglo2) {
        String n = "Vector 2: ";
        for (int i = 0; i < arreglo2.length; i++) {
            n += arreglo2[i] + " | ";
        }
        return n;
    }

    public int numeroMayor() {

        int mayor = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }

        return mayor;
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int numerosPrimos() {
        int s = 0;

        for (int num : arreglo) {
            if (isPrimo(num)) {
                s++;
            }
        }

        return s;
    }

    public int sumaValores() {
        int s = 0;
        for (int i = 0; i < this.arreglo.length; i++) {
            s += arreglo[i];
        }
        return s;
    }

    public int numerosPares() {
        int s = 0;

        for (int numero : arreglo) {
            if (numero % 2 == 0) {
                s++;
            }
        }

        return s;
    }

    public int[] sumarVectores(int[] arreglo2) {

        int longitud = arreglo.length;
        int[] resultado = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            resultado[i] = arreglo[i] + arreglo2[i];
            System.out.println(resultado[i]);
        }

        return resultado;
    }

    public String buscarValor(int[] arreglo2) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor a buscar en el Vector"));
        String n = "";
        for (int i = 0; i < arreglo2.length; i++) {
            if (arreglo2[i] == x) {
                n = "Posición: " + i;
                return n;
            }
        }
        n = "El valor no existe en el vector";
        return n;
    }

    public String copiarVector(int[] arreglo2) {
        String n = "Vector 2: ";
        for (int i = 0; i < arreglo.length; i++) {
            arreglo2[i] = arreglo[i];
            n += arreglo2[i] + " | ";
        }
        return n;
    }

    public void ordenarAsc() {

        int s = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {

            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    s = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = s;
                }
            }
        }
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void ordenarDesc() {
        int s = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {

            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    s = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = s;
                }
            }
        }
    }
    // Función de búsqueda binaria que devuelve el índice del elemento si se encuentra, o -1 si no se encuentra.

    public  int busquedaBinaria() {
        int elementoBuscado = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor a buscar en el Vector"));
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            // Comprobar si el elemento buscado es igual al elemento en la posición media.
            if (arreglo[medio] == elementoBuscado) {
                return medio;
            }

            // Si el elemento buscado es mayor que el elemento en la posición media, buscar en la mitad derecha.
            if (arreglo[medio] < elementoBuscado) {
                izquierda = medio + 1;
            } // Si el elemento buscado es menor, buscar en la mitad izquierda.
            else {
                derecha = medio - 1;
            }
        }

        // Si el elemento no se encuentra en el arreglo, regresamos -1.
        JOptionPane.showMessageDialog(null, "Elemento no encontrado, vuelve a intarlo.");
        return -1;
    }

    public String imprimirOrdenado() {
        String n = "";
        for (int value : arreglo) {
            n += value + " | ";
        }
        return n += "\n";
    }
    public void burbujaMejorada() {
        int n = arreglo.length;
        boolean intercambiado;
        
        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar los elementos si están en el orden incorrecto
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambiado = true;
                }
            }
            
            // Si no hubo intercambios en esta pasada, el arreglo ya está ordenado
            if (!intercambiado) {
                break;
            }
        }
    }
    public void burbujaMejoradaDesc() {
        int n = arreglo.length;
        boolean intercambiado;
        
        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    // Intercambiar los elementos si están en el orden incorrecto
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambiado = true;
                }
            }
            
            // Si no hubo intercambios en esta pasada, el arreglo ya está ordenado
            if (!intercambiado) {
                break;
            }
        }
    }
    public void ordenamientoShell() {
        int n = arreglo.length;
        
        // Comenzar con una brecha grande y reducirla en cada iteración
        for (int brecha = n / 2; brecha > 0; brecha /= 2) {
            for (int i = brecha; i < n; i++) {
                int temp = arreglo[i];
                int j;
                
                // Mover elementos que están a 'brecha' distancia el uno del otro
                for (j = i; j >= brecha && arreglo[j - brecha] > temp; j -= brecha) {
                    arreglo[j] = arreglo[j - brecha];
                }
                
                // Colocar el elemento 'temp' en su posición correcta
                arreglo[j] = temp;
            }
        }
    }
    
    public void ordenamientoShellDesc() {
        int n = arreglo.length;
        
        // Comenzar con una brecha grande y reducirla en cada iteración
        for (int brecha = n / 2; brecha > 0; brecha /= 2) {
            for (int i = brecha; i < n; i++) {
                int temp = arreglo[i];
                int j;
                
                // Mover elementos que están a 'brecha' distancia el uno del otro
                for (j = i; j >= brecha && arreglo[j - brecha] < temp; j -= brecha) {
                    arreglo[j] = arreglo[j - brecha];
                }
                
                // Colocar el elemento 'temp' en su posición correcta
                arreglo[j] = temp;
            }
        }
    }
    public void ordenamientoQuickSort(int inicio, int fin) {
        if (inicio < fin) {
            // Encuentra la posición del pivote en el arreglo
            int indicePivote = particion( inicio, fin);

            // Ordena los elementos antes y después del pivote
            ordenamientoQuickSort( inicio, indicePivote - 1);
            ordenamientoQuickSort( indicePivote + 1, fin);
        }
    }

    private int particion(int inicio, int fin) {
        int pivote = arreglo[fin];
        int i = (inicio - 1);

        for (int j = inicio; j < fin; j++) {
            if (arreglo[j] <= pivote) {
                i++;

                // Intercambia arreglo[i] y arreglo[j]
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        // Intercambia arreglo[i + 1] y arreglo[fin] (el pivote)
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;

        return i + 1;
    }
    public void ordenamientoQuickSortDesc(int inicio, int fin) {
        if (inicio < fin) {
            // Encuentra la posición del pivote en el arreglo
            int indicePivote = particionDescendente( inicio, fin);

            // Ordena los elementos antes y después del pivote
            ordenamientoQuickSortDesc(inicio, indicePivote - 1);
            ordenamientoQuickSortDesc(indicePivote + 1, fin);
        }
    }

    private int particionDescendente( int inicio, int fin) {
        int pivote = arreglo[fin];
        int i = (inicio - 1);

        for (int j = inicio; j < fin; j++) {
            if (arreglo[j] >= pivote) {
                i++;

                // Intercambia arreglo[i] y arreglo[j]
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        // Intercambia arreglo[i + 1] y arreglo[fin] (el pivote)
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;

        return i + 1;
    }
    public void ordenamientoMerge(int[] arreglo) {
        if (arreglo == null) {
            return;
        }
        int n = arreglo.length;
        if (n < 2) {
            return;
        }

        int medio = n / 2;

        int[] izquierda = new int[medio];
        int[] derecha = new int[n - medio];

        System.arraycopy(arreglo, 0, izquierda, 0, medio);
        System.arraycopy(arreglo, medio, derecha, 0, n - medio);

        ordenamientoMerge(izquierda);
        ordenamientoMerge(derecha);

        merge( izquierda, derecha);
    }
    private void merge( int[] izquierda, int[] derecha) {
        int n1 = izquierda.length;
        int n2 = derecha.length;

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (izquierda[i] <= derecha[j]) {
                arreglo[k++] = izquierda[i++];
            } else {
                arreglo[k++] = derecha[j++];
            }
        }

        while (i < n1) {
            arreglo[k++] = izquierda[i++];
        }

        while (j < n2) {
            arreglo[k++] = derecha[j++];
        }
    }
    public void ordenamientoMergeDesc(int[] arreglo) {
        if (arreglo == null) {
            return;
        }
        int n = arreglo.length;
        if (n < 2) {
            return;
        }

        int medio = n / 2;

        int[] izquierda = new int[medio];
        int[] derecha = new int[n - medio];

        System.arraycopy(arreglo, 0, izquierda, 0, medio);
        System.arraycopy(arreglo, medio, derecha, 0, n - medio);

        ordenamientoMergeDesc(izquierda);
        ordenamientoMergeDesc(derecha);

        mergeDescendente( izquierda, derecha);
    }

    private void mergeDescendente(int[] izquierda, int[] derecha) {
        int n1 = izquierda.length;
        int n2 = derecha.length;

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (izquierda[i] >= derecha[j]) { // Invertimos el signo para ordenar en descendente
                arreglo[k++] = izquierda[i++];
            } else {
                arreglo[k++] = derecha[j++];
            }
        }

        while (i < n1) {
            arreglo[k++] = izquierda[i++];
        }

        while (j < n2) {
            arreglo[k++] = derecha[j++];
        }
    }
    public double calcularMedia() {
        if (arreglo == null || arreglo.length == 0) {
            return 0.0; // Devolvemos 0 si el arreglo está vacío o es nulo
        }

        int suma = 0;
        for (int elemento : arreglo) {
            suma += elemento;
        }

        return (double) suma / arreglo.length;
    }
    public double calcularMediana() {
        // Primero, ordena el arreglo en orden ascendente
        Arrays.sort(arreglo);

        int n = arreglo.length;

        if (n % 2 == 0) {
            // Si la cantidad de elementos en el arreglo es par, toma el promedio de los dos valores centrales
            int mitad1 = n / 2 - 1;
            int mitad2 = n / 2;
            return (arreglo[mitad1] + arreglo[mitad2]) / 2.0;
        } else {
            // Si la cantidad de elementos en el arreglo es impar, la mediana es el valor central
            int mitad = n / 2;
            return arreglo[mitad];
        }
    }
    public String calcularModa() {
        // Usamos un mapa para realizar un conteo de la frecuencia de cada número en el arreglo
        Map<Integer, Integer> frecuencia = new HashMap<>();

        for (int numero : arreglo) {
            frecuencia.put(numero, frecuencia.getOrDefault(numero, 0) + 1);
        }

        // Encontramos la frecuencia máxima
        int maxFrecuencia = 0;
        for (int frec : frecuencia.values()) {
            if (frec > maxFrecuencia) {
                maxFrecuencia = frec;
            }
        }

        // Encontramos los números que tienen la frecuencia máxima (pueden ser varios)
        List<Integer> moda = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() == maxFrecuencia) {
                moda.add(entry.getKey());
            }
        }
        String cadena=""+moda;
        return cadena;
    }
    public double calcularDesviacionEstandar() {
        // Paso 1: Calcular el promedio (media) de los elementos en el arreglo.
        double suma = 0;
        for (int numero : arreglo) {
            suma += numero;
        }
        double promedio = suma / arreglo.length;

        // Paso 2: Calcular la suma de los cuadrados de las diferencias entre cada número y la media.
        double sumaCuadrados = 0;
        for (int numero : arreglo) {
            double diferencia = numero - promedio;
            sumaCuadrados += diferencia * diferencia;
        }

        // Paso 3: Calcular la varianza dividiendo la suma de cuadrados entre el número de elementos.
        double varianza = sumaCuadrados / arreglo.length;

        // Paso 4: La desviación estándar es la raíz cuadrada de la varianza.
        double desviacionEstandar = Math.sqrt(varianza);

        return desviacionEstandar;
    }
}
