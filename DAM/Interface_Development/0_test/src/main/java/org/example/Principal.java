package org.example;

import javax.swing.*;

public class Principal {

    private JFrame ventana;

    Principal() {

        //CREACIÓN DE LA VENTANA
        ventana = new JFrame();
        ventana.setBounds(0,0,400,400);
        ventana.setTitle("Primera ventana en Java");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //CREAMOS LOS 3 BOTONES
        JButton b1, b2, b3;
        b1 = new JButton("Rojo");
        b2 = new JButton("Verde");
        b3 = new JButton("Azul");

        //CREAMOS CONTENEDOR INTERMEDIO
        JPanel panel = new JPanel();

        //AGREGAMOS LOS BOTONES AL CONTENEDOR INTERMEDIO
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);

        //AGREGAR EL CONTENEDOR INTERMEDIO EN EL ContentPane
        ventana.getContentPane().add(panel);
    }

    public void mostrarVentana(){
        ventana.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(()->new Principal().mostrarVentana());
    }

}
