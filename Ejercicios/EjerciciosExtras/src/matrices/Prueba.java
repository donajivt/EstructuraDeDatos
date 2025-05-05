/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Prueba {
    public static void main(String[] args) {
        int [][] m1 = new int [3][3];
        m1[0][0]=12;
        m1[0][1]=5;
        m1[0][2]=6;
        m1[1][0]=8;
        m1[1][1]=23;
        m1[1][2]=22;
        m1[2][0]=7;
        m1[2][1]=13;
        m1[2][2]=0;
        Persona [][] mp1= new Persona[2][2];
        
        Sudadera s1= new Sudadera();
        Sudadera s2= new Sudadera();
        
        s1.setColor("Negro");
        s1.setTalla("Grande");
        s2.setColor("Morado");
        s2.setTalla("Extra Grande");
        
        
        Persona p1= new Persona();
        Persona p2= new Persona();
        
        p1.setNombre("Jaime Duende");
        p1.setEdad(18);
        p1.setSexo("Hombre");
        p1.setS(s1);
        
        p2.setNombre("Concha Duende");
        p2.setEdad(23);
        p2.setSexo("Mujer");
        p2.setS(s2);
        
        System.out.println(" Nombre: "+p1.getNombre()+"\n Edad: "+p1.getEdad()+"\n Sexo: "+p1.getSexo()+"\n Color de sudadera: "
        +s1.getColor()+"\n Talla de la sudadera: "+s1.getTalla());
        System.out.println(" Nombre: "+p2.getNombre()+"\n Edad: "+p2.getEdad()+"\n Sexo: "+p2.getSexo()+"\n Color de sudadera: "
        +s2.getColor()+"\n Talla de la sudadera: "+s2.getTalla());
        
        mp1[0][0]=p1;
        mp1[0][1]=p2;
//        mp1[1][0]=new Persona();
//        mp1[1][1]=new Persona();
        try{
            System.out.println("el tamaño de las filas es: "+m1.length);
            System.out.println("el tamaño de las columnas es: "+m1[m1.length-1].length);
            imprimir(mp1);
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, e.getMessage() + "\n Menso así no va:)");
        }
        
    }
    public static void imprimir(int [][]m){
        int filas = 0;
        int columnas= 0;
        String resultado="";
        do{
            columnas=0;
            while(columnas<m[filas].length){
                resultado += m[filas][columnas] + " ";
                columnas++;
            }
            resultado +="\n";
            filas++;
        }while(filas < m.length);
        System.out.print(resultado);
        JOptionPane.showMessageDialog(null, resultado);
    }
    public static void imprimir(Persona [][]m){
        int filas = 0;
        int columnas= 0;
        String resultado="";
        do{
            columnas=0;
            
            while(columnas<m[filas].length){
                if(m[filas][columnas] != null){
                    resultado +="\nNombre: "+ m[filas][columnas].getNombre()+"\nColor de la sudadera: "+ m[filas][columnas].getS().getColor();
                }
                columnas++;
            }
            resultado +="\n";
            filas++;
        }while(filas < m.length);
        System.out.print(resultado);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
