package com.alejandro.factory.dominio;

import javax.swing.*;

public class AlertaWindows implements IAlerta {
    @Override
    public void mostrar(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
