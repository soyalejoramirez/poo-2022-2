package com.alejandro.interfaces.dominio;

public class CelularIntermedio extends CelularBasico implements Desbloqueable {
    private String passwordCorrecto;

    public CelularIntermedio(String marca, Persona propietario) {
        super(marca, propietario);
        this.passwordCorrecto = propietario.getPassword();
    }

    @Override
    public boolean desbloquear(Persona persona) {
        return passwordCorrecto.equals(persona.getPassword());
    }
}
