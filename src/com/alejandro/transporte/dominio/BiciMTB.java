package com.alejandro.transporte.dominio;

public class BiciMTB extends Bicicleta {
    private String tipoSuspension;

    public BiciMTB(long serial, String marca) {
        super(serial, marca);
    }

    public String getTipoSuspension() {
        return tipoSuspension;
    }

    public void setTipoSuspension(String tipoSuspension) {
        this.tipoSuspension = tipoSuspension;
    }
}
