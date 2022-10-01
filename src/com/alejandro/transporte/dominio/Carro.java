package com.alejandro.transporte.dominio;

public class Carro extends Vehiculo {
    private String placa;
    private String tipoCaja;

    public String getPlaca() {
        return placa;
    }

    public String getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(String tipoCaja) {
        this.tipoCaja = tipoCaja;
    }
}
