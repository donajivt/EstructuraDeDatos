/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class PruebaHerencia {
    public static void main(String[] args) {
        
//        Alumno a1 = new Alumno();
//        a1.setNombre("Monico");
//        a1.setEdad(27);
//        a1.setSexo("Mujer");
//        a1.setDireccion("Calle del Infernio #666");
//        a1.setMatricula("22300");
//        String resultado="";
//        //JOptionPane.showMessageDialog(null, "");
//        JOptionPane.showMessageDialog(null, a1);
//        a1.saludar();
//        Persona objClone =new Alumno();
//        System.out.println(objClone);
    /*Persona p1= new Alumno();
    Persona p2= new Profesor();
    p1.insertar(new ClaseBuena());
    p2.insertar(new ClaseBuena());*/
    Alumno a1 = new Alumno();
    Profesor pr1 = new Profesor();
    Persona arr[] = new Persona [2];
    arr[0] = a1;
    arr[1] = pr1;
        for (Persona x: arr) {
            x.seleccionar();
        }
    }
}
