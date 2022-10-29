package com.alejandro.interfaces.dominio;

public class CelularSemiavanzado extends CelularIntermedio implements Desbloqueable {
    private String huellaCorrecta;

    public CelularSemiavanzado(String marca, Persona propietario) {
        super(marca, propietario);
        this.huellaCorrecta = propietario.getHuella();
    }

    @Override
    public boolean desbloquear(Persona persona) {
        if (huellaCorrecta.equals(persona.getHuella())) {
            return true;
        }

        return super.desbloquear(persona);
    }
}
