package org.example.ooo;

import javax.swing.*;

public class Principal2 {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(()->{

            Pantalla pantallita = new Pantalla();


            EscuchadorDeVentana ev = new EscuchadorDeVentana();

            pantallita.addWindowListener(ev);
            pantallita.mostrar();


        });
    }
}
