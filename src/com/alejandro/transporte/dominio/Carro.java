package com.alejandro.transporte.dominio;

public class Carro extends Vehiculo {
    protected String placa;
    protected String tipoCaja;

    public Carro(long serial, String marca, String placa) {
        super(serial, marca);
        this.placa = placa;
    }

    @Override
    public void acelerar() {
        System.out.println("El carro va acelerando");
    }

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
