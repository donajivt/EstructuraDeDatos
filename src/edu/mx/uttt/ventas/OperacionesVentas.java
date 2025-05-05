/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.ventas;

/**
 *
 * @author vania
 */
public class OperacionesVentas {
    Empleado emp = new Empleado();
    Empleado emp1 = new Empleado();
    Empleado emp2 = new Empleado();
    Empleado emp3 = new Empleado();
    Empleado emp4 = new Empleado();
        
    public String imprimir(){
        emp.setNombre("Jorge");
        emp1.setNombre("Vania");
        emp2.setNombre("Julieta");
        emp3.setNombre("Cazzuchelli");
        emp4.setNombre("Osorio");
        Empleado [] empleados = new Empleado[5];
        empleados[0]=emp;
        empleados[1]=emp1;
        empleados[2]=emp2;
        empleados[3]=emp3;
        empleados[4]=emp4;
        
        String n = "";
        for (int i = 0; i < empleados.length; i++) {
            n += empleados[i] + " \n ";
            
        }
        
        return n;
    }
}
