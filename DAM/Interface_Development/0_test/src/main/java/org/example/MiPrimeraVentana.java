package org.example;

import javax.swing.*;
import java.awt.*;

public class MiPrimeraVentana {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                crearYmostrarGUI();
            }
        });
    }

    private static void crearYmostrarGUI(){
        //Crear ventana
        JFrame ventana = new JFrame("Primera ventana de 2º DAM");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400,200);
        //crear una etiqueta de texto
        JLabel etiqueta = new JLabel("Hola Mundo con Java Swing", SwingConstants.CENTER);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 14));
        //Poner la etiqueta en la ventana
        ventana.getContentPane().add(etiqueta, BorderLayout.CENTER);
        //Poner ventana en la pantalla en la posicion que digamos nosotros
        ventana.setLocationRelativeTo(null);
        //hacer visible la ventana
        ventana.setVisible(true);
        System.out.println("La ventana tiene que estar visible");

    }




}
