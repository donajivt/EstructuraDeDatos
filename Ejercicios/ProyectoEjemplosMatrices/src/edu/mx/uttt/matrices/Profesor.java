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
public class Profesor extends Persona {
    private String numeroNomina;
    private String gradoEstudio;
    public Profesor() {
    }

    public Profesor(String numeroNomina, String gradoEstudio, String nombre, int edad, String sexo, String direccion) {
        super(nombre, edad, sexo, direccion);
        this.numeroNomina = numeroNomina;
        this.gradoEstudio = gradoEstudio;
    }
    

    public String getNumeroNomina() {
        return numeroNomina;
    }

    public void setNumeroNomina(String numeroNomina) {
        this.numeroNomina = numeroNomina;
    }

    public String getGradoEstudio() {
        return gradoEstudio;
    }

    public void setGradoEstudio(String gradoEstudio) {
        this.gradoEstudio = gradoEstudio;
    }

    @Override
    public void insertar(Object obj) {
        ClaseBuena obj2 = (ClaseBuena)obj;
        obj2.setX(666);
        obj2.setY(27);
        String salida="X: "+obj2.getX()+"\nY: "+obj2.getY();
        JOptionPane.showMessageDialog(null, salida);
    }

    @Override
    public void seleccionar() {
        JOptionPane.showMessageDialog(null, "Hola me seleccionaste, soy un Profesor");
    }
    
    
}
