/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author vania
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetectarClicBoton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Detectar Clic de Botón");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Crear un botón
        JButton boton = new JButton("Clic aquí");
        boton.setBounds(20, 20, 100, 30);

        // Agregar un ActionListener al botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes realizar alguna acción cuando el botón se hace clic
                JOptionPane.showMessageDialog(null, "¡Has hecho clic en el botón!");
            }
        });

        // Agregar el botón al marco
        frame.add(boton);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
