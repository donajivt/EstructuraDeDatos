/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.listas.dobles;

/**
 *
 * @author vania
 */
import java.util.Comparator;

public class MixedTypeComparator implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        // Manejar el caso en que ambos objetos son nulos
        if (o1 == null && o2 == null) {
            return 0;
        }

        // Manejar el caso en que solo uno de los objetos es nulo
        if (o1 == null) {
            return -1;
        }

        if (o2 == null) {
            return 1;
        }

        // Manejar la comparación de diferentes tipos de objetos
        if (o1.getClass() != o2.getClass()) {
            return o1.getClass().getName().compareTo(o2.getClass().getName());
        }

        // Comparación específica según el tipo de objeto
        if (o1 instanceof String) {
            return ((String) o1).compareTo((String) o2);
        } else if (o1 instanceof Integer) {
            return Integer.compare((Integer) o1, (Integer) o2);
        } else if (o1 instanceof Double) {
            return Double.compare((Double) o1, (Double) o2);
        } else if (o1 instanceof Boolean) {
            return Boolean.compare((Boolean) o1, (Boolean) o2);
        } else {
            // Agrega más casos según sea necesario para otros tipos de objetos
            throw new IllegalArgumentException("Tipo de objeto no compatible: " + o1.getClass().getName());
        }
    }
}

