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
public abstract class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private String direccion;
    
    public Persona(){
        
    }

    public Persona(String nombre, int edad, String sexo, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
    }
    
    public abstract void insertar(Object obj);
    public abstract void seleccionar();

    @Override
    public String toString() {
        return "Persona{" + "nombre= " + nombre + ", edad= " + edad + ", sexo= " + sexo + ", direccion= " + direccion + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void saludar(){
        JOptionPane.showMessageDialog(null,"Holiiii soy la Superclase Persona");
    }
}
