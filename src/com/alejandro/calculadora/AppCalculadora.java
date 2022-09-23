package com.alejandro.calculadora;

import javax.swing.*;
import java.util.Arrays;

public class AppCalculadora {
    private static final String POO = "POO 2022-2";
    private static final ImageIcon ICONO = new ImageIcon(AppCalculadora.class.getResource("uco.png"));

    public static void main(String[] args) {
        //String nombre = JOptionPane.showInputDialog("¿Quién llegó tarde?");
//        String nombre = (String) JOptionPane.showInputDialog(null, "¿Quién llegó tarde?",
//                POO, JOptionPane.INFORMATION_MESSAGE, ICONO, Arrays.asList("Juan", "Ricardo", "Riky", "Sergio").toArray(),
//                "Ricardo");

        while (true) {
            int opcionElegida = JOptionPane.showConfirmDialog(null, "Quieres seguir?", POO, JOptionPane.YES_NO_OPTION);

            switch (opcionElegida) {
                case JOptionPane.NO_OPTION:
                    mostrarMensaje("Seleccionó NO");
                    break;
                case JOptionPane.OK_OPTION:
                    mostrarMensaje("Seleccionó SI");
                    break;
                case JOptionPane.CLOSED_OPTION:
                    mostrarMensaje("Seleccionó CERRAR");
                    System.exit(0);
                    break;
                default:
                    mostrarMensaje("OPCIÓN INVALIDA");
            }
        }
    }

    private static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, POO, JOptionPane.INFORMATION_MESSAGE, ICONO);
    }
}
