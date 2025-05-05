/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uttt.edu.mx.operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class ControlBoletos {

    private int[][] tabla = {{12, 56, 11}, {4, 5, 8}, {6, 7, 12}, {7, 8, 9}, {11, 23, 12}};
    private String[] destinos = {"Cancun", "CDMX", "Los Cabos", "Mazatlán", "Pto Vallarta"};
    private String[] horarios = {"Mañana", "Medio día", "Noche"};

    public void imprimir() {
        int filas = 0;
        int columnas = 0;
        int i =0;
        String resultado ="                "+ imprimirHorario()+"\n";
        
        do {
            columnas = 0;
            resultado += destinos[filas] ;
            while (columnas < tabla[filas].length) {
                
                resultado +="          "+ tabla[filas][columnas];
                columnas++;
            }
            resultado +=  "\n";
            filas++;
        } while (filas < tabla.length);
        JOptionPane.showMessageDialog(null, resultado);
        operaciones();
    }
    public String imprimirHorario() {
        String n = "    ";
        for (int i = 0; i < horarios.length; i++) {
            n +="   "+ horarios[i];
        }
        return n;
    }
//    public int imprimirDestino() {
//        int n = 0;
//        for (int i = 0; i < horarios.length; i++) 
//            n = horarios[i];
//        return n;
//    }

    public int menuDestinos() {
        String menu = "Destinos:\n" + "1)" + destinos[0] + "\n" + "2)" + destinos[1] + "\n" + "3)" + destinos[2] + "\n" + "4)" + destinos[3] + "\n" + "5)" + destinos[4] + "\n";
        String opc = "";
        boolean sentinel = true;
        boolean sentinela = true;
        do {
            opc = JOptionPane.showInputDialog(menu);
            switch (opc) {
                case "1":
                    do {
                        try {
                            JOptionPane.showMessageDialog(null, "Seleccionaste: "+destinos[0]);
                            sentinela = false;
                            sentinel=false;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Datos no validos ");
                            System.out.println(e);
                        }
                    } while (sentinela);
                    break;
                case "2":
                    do {
                        try {
                            JOptionPane.showMessageDialog(null, "Seleccionaste: "+destinos[1]);
                            sentinela = false;
                            sentinel=false;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Datos no validos ");
                            System.out.println(e);
                        }
                    } while (sentinela);
                    break;
                case "3":
                    do {
                        try {
                            JOptionPane.showMessageDialog(null, "Seleccionaste: "+destinos[2]);
                            sentinela = false;
                            sentinel=false;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Datos no validos ");
                            System.out.println(e);
                        }
                    } while (sentinela);
                    break;
                case "4":
                    do {
                        try {
                            JOptionPane.showMessageDialog(null, "Seleccionaste: "+destinos[3]);
                            sentinela = false;
                            sentinel=false;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Datos no validos ");
                            System.out.println(e);
                        }
                    } while (sentinela);
                    break;
                case "5":
                    do {
                        try {
                            JOptionPane.showMessageDialog(null, "Seleccionaste: "+destinos[4]);
                            sentinela = false;
                            sentinel=false;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Datos no validos ");
                            System.out.println(e);
                        }
                    } while (sentinela);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (sentinel);
        int y = Integer.parseInt(opc);
        return y-1;
    }

    public int menuHorarios() {
        String menu = "Horarios:\n" + "1)" + horarios[0] + "\n" + "2)" + horarios[1] + "\n" + "3)" + horarios[2];
        String opc = "";
        boolean sentinel = true;
        boolean sentinela = true;

        do {
            opc = JOptionPane.showInputDialog(menu);
            switch (opc) {
                case "1":
                    do {
                        try {
                            JOptionPane.showMessageDialog(null, "Seleccionaste: "+horarios[0]);
                            sentinela = false;
                            sentinel=false;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Datos no validos ");
                            System.out.println(e);
                        }
                    } while (sentinela);
                    
                    break;
                case "2":
                    do {
                        try {
                            JOptionPane.showMessageDialog(null, "Seleccionaste: "+horarios[1]);
                            sentinela = false;
                            sentinel=false;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Error");
                            System.out.println(e);
                        }
                    } while (sentinela);
                    break;
                case "3":
                    do {
                        try {
                            JOptionPane.showMessageDialog(null, "Seleccionaste: "+horarios[2]);
                            sentinela = false;
                            sentinel=false;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Datos no validos ");
                            System.out.println(e);
                        }
                    } while (sentinela);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (sentinel);
        int j = Integer.parseInt(opc);
        return j-1;
    }
    public void operaciones(){
        int x = menuDestinos();
        int y = menuHorarios();
        System.out.println(x);
        System.out.println(y);
        int v = Integer.parseInt(JOptionPane.showInputDialog("Introduce los boletos que necesites"));
        System.out.println("v "+v);
        System.out.println("contenido tabla: "+tabla[x][y]);
        if(tabla[x][y] <= v){
            int by = tabla[x][y];
             tabla[x][y] = by - v;
            JOptionPane.showMessageDialog(null, "Exito");
            menu();
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay suficientes boletos");
            menu();
        }
    }
    public void menu(){
        String menu = "1)Salir" +  "\n" + "2)Comprar más Boletos";
        String opc = "";
        boolean sentinel = true;
        boolean sentinela = true;
        do {
            opc = JOptionPane.showInputDialog(menu);
            switch (opc) {
                case "2":
                    do {
                        try {
                            imprimir();
                            sentinela = false;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Datos no validos ");
                            System.out.println(e);
                        }
                    } while (sentinela);
                    
                    break;
                case "1":
                    sentinel=false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (sentinel);
    }
}
