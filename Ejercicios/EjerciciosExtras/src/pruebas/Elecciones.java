/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author vania
 */
import java.util.Scanner;

public class Elecciones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el número de candidatos: ");
        int numCandidatos = input.nextInt();

        System.out.print("Ingrese el número de distritos: ");
        int numDistritos = input.nextInt();

        // Arreglos dinámicos para almacenar los nombres de candidatos y distritos
        String[] candidatos = new String[numCandidatos];
        String[] distritos = new String[numDistritos];

        // Matriz para almacenar los votos
        int[][] votos = new int[numDistritos][numCandidatos];

        // Ingresar nombres de candidatos
        for (int i = 0; i < numCandidatos; i++) {
            System.out.print("Nombre del candidato " + (i + 1) + ": ");
            candidatos[i] = input.next();
        }

        // Ingresar nombres de distritos
        for (int i = 0; i < numDistritos; i++) {
            System.out.print("Nombre del distrito " + (i + 1) + ": ");
            distritos[i] = input.next();
        }

        // Ingresar los resultados de las elecciones
        for (int i = 0; i < numDistritos; i++) {
            System.out.println("Resultados para el distrito " + distritos[i] + ":");
            for (int j = 0; j < numCandidatos; j++) {
                System.out.print("Votos para " + candidatos[j] + ": ");
                votos[i][j] = input.nextInt();
            }
        }

        // Calcular el total de votantes
        int totalVotantes = 0;
        for (int i = 0; i < numDistritos; i++) {
            for (int j = 0; j < numCandidatos; j++) {
                totalVotantes += votos[i][j];
            }
        }

        // Encontrar el candidato ganador (si lo hay)
        boolean candidatoGanador = false;
        String ganador = "";
        for (int j = 0; j < numCandidatos; j++) {
            int totalVotosCandidato = 0;
            for (int i = 0; i < numDistritos; i++) {
                totalVotosCandidato += votos[i][j];
            }
            if (totalVotosCandidato > totalVotantes / 2) {
                candidatoGanador = true;
                ganador = candidatos[j];
                break;
            }
        }

        if (candidatoGanador) {
            System.out.println("El ganador de las elecciones es: " + ganador);
        } else {
            System.out.println("Ningún candidato recibe más del 50% de los votos.");

            // Encontrar los dos candidatos más votados
            int primerMasVotado = -1;
            int segundoMasVotado = -1;
            String primerNombre = "";
            String segundoNombre = "";

            for (int j = 0; j < numCandidatos; j++) {
                int totalVotosCandidato = 0;
                for (int i = 0; i < numDistritos; i++) {
                    totalVotosCandidato += votos[i][j];
                }

                if (totalVotosCandidato > primerMasVotado) {
                    segundoMasVotado = primerMasVotado;
                    segundoNombre = primerNombre;
                    primerMasVotado = totalVotosCandidato;
                    primerNombre = candidatos[j];
                } else if (totalVotosCandidato > segundoMasVotado) {
                    segundoMasVotado = totalVotosCandidato;
                    segundoNombre = candidatos[j];
                }
            }

            System.out.println("Los dos candidatos más votados son: " + primerNombre + " y " + segundoNombre);
        }

        // Mostrar el candidato ganador en cada distrito
        for (int i = 0; i < numDistritos; i++) {
            int maxVotos = -1;
            String ganadorDistrito = "";
            for (int j = 0; j < numCandidatos; j++) {
                if (votos[i][j] > maxVotos) {
                    maxVotos = votos[i][j];
                    ganadorDistrito = candidatos[j];
                }
            }
            System.out.println("El ganador en el distrito " + distritos[i] + " es: " + ganadorDistrito);
        }

        // Mostrar en qué distrito obtuvo mayoría de votos cada candidato
        for (int j = 0; j < numCandidatos; j++) {
            int maxVotosCandidato = -1;
            String distritoGanador = "";
            for (int i = 0; i < numDistritos; i++) {
                if (votos[i][j] > maxVotosCandidato) {
                    maxVotosCandidato = votos[i][j];
                    distritoGanador = distritos[i];
                }
            }
            System.out.println("El candidato " + candidatos[j] + " obtuvo mayoría de votos en el distrito " + distritoGanador);
        }

        // Encontrar el distrito con un menor número de votantes
        int minVotantes = totalVotantes;
        String distritoMenorVotantes = "";
        for (int i = 0; i < numDistritos; i++) {
            int totalVotosDistrito = 0;
            for (int j = 0; j < numCandidatos; j++) {
                totalVotosDistrito += votos[i][j];
            }
            if (totalVotosDistrito < minVotantes) {
                minVotantes = totalVotosDistrito;
                distritoMenorVotantes = distritos[i];
            }
        }

        System.out.println("El distrito con un menor número de votantes es: " + distritoMenorVotantes);
    }
}

