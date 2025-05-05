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
public class Alumno extends Persona{
    private String matricula;
    
    public Alumno(){
        //super("Vania",27,"Mujer","Huehueyork");
        //matricula="vdvt";
        super();
    }

    @Override
    public String toString() {
        return super.toString()+"\nAlumno { matricula: "+this.matricula+"}";
    }
    public Alumno(String nombre, int edad, String sexo, String direccion, String matricula){
        super(nombre, edad, sexo, direccion);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public void saludar(){
        JOptionPane.showMessageDialog(null, "Holiii soy la Subclase Alumno");
    }

    @Override
    public void insertar(Object obj) {
        ClaseBuena obj2 = (ClaseBuena)obj;
        String salida="X: "+obj2.getX()+"\nY: "+obj2.getY();
        JOptionPane.showMessageDialog(null, salida);
    }

    @Override
    public void seleccionar() {
        JOptionPane.showMessageDialog(null, "Hola me seleccionaste, soy un Alumno");
    }
}
