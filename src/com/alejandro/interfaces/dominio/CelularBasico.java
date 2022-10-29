package com.alejandro.interfaces.dominio;

public class CelularBasico extends Celular implements Desbloqueable {
    private int pinCorrecto;

    public CelularBasico(String marca, Persona propietario) {
        super(marca, propietario);
        this.pinCorrecto = propietario.getPin();
    }

    @Override
    public boolean desbloquear(Persona persona) {
        return this.pinCorrecto == persona.getPin();
    }
}
