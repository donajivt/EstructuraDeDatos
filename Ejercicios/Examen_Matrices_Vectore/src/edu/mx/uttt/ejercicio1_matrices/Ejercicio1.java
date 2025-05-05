/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.ejercicio1_matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class Ejercicio1 {

    int[][] matriz;
    String[] candidatos;
    String[] distritos;

    public Ejercicio1(int can, int dis) {
        matriz = new int[can][dis];
        candidatos = new String[can];
        distritos = new String[dis];
    }

    public void llenarCandidatos() {
        for (int i = 0; i < this.candidatos.length; i++) {

            this.candidatos[i] = JOptionPane.showInputDialog("Introduce al candidato " + (i + 1));

        }
    }

    public void llenarDistritos() {
        for (int i = 0; i < this.distritos.length; i++) {

            this.distritos[i] = "Distrito " + (i + 1);

        }
    }

    public void llenarMatriz() {
        boolean flag = false;
        int i = 0;
        int j = 0;
        do {
            i = 0;
            while (i < this.matriz[this.matriz.length - 1].length) {
                do {
                    try {
                        this.matriz[j][i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de votos"));
                        flag = false;
                    } catch (NumberFormatException e) {
                        flag = true;
                        JOptionPane.showMessageDialog(null, "Introduce un valor válido");
                    }
                } while (flag);
                i++;
            }
            j++;
        } while (j < matriz.length);
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public String[] getCandidatos() {
        return candidatos;
    }

    public String[] getDistritos() {
        return distritos;
    }

    public int totalVotos() {
        int totalVotos = 0;
        for (int i = 0; i < candidatos.length; i++) {
            for (int j = 0; j < distritos.length; j++) {
                totalVotos += matriz[i][j];
            }
        }
        return totalVotos;
    }

    public String ganador() {
        String ganador = "";
        int votosCandidato = 0;
        for (int j = 0; j < candidatos.length; j++) {
            for (int i = 0; i < distritos.length; i++) {
                votosCandidato += matriz[i][j];
            }
            if (votosCandidato > totalVotos() / 2) {
                ganador ="El Ganador es: "+ candidatos[j];
                break;
            }
        }
        return ganador;
    }

    public String ganadorDis() {
        String salida = "";
        for (int i = 0; i < candidatos.length; i++) {
            int maxVotos = -1;
            String ganadorDistrito = "";
            for (int j = 0; j < distritos.length; j++) {
                if (matriz[i][j] > maxVotos) {
                    maxVotos = matriz[i][j];
                    ganadorDistrito = candidatos[j];
                }
                
            }
            salida += "El ganador en el  " + distritos[i] + " es: " + ganadorDistrito +"\n";
        }
        return salida;
    }

    public String votosDis() {
        String salida = "";
        for (int j = 0; j < candidatos.length; j++) {
            int maxVotosCandidato = -1;
            String distritoGanador = "";
            for (int i = 0; i < distritos.length; i++) {
                if (matriz[i][j] > maxVotosCandidato) {
                    maxVotosCandidato = matriz[i][j];
                    distritoGanador = distritos[i];
                }
            }
            salida += "El candidato " + candidatos[j] + " obtuvo mayoría de votos en el " + distritoGanador+"\n";
        }
        return salida;
    }

    public String votosMinDis() {
        String salida = "";
        int minVotantes = totalVotos();
        String distritoMenorVotantes = "";
        for (int i = 0; i < candidatos.length; i++) {
            int totalVotosDistrito = 0;
            for (int j = 0; j < distritos.length; j++) {
                totalVotosDistrito += matriz[i][j];
            }
            if (totalVotosDistrito < minVotantes) {
                minVotantes = totalVotosDistrito;
                distritoMenorVotantes = distritos[i];
            }
        }
        salida = ("El distrito con un menor número de votantes es: " + distritoMenorVotantes);
        return salida ;
    }
}

