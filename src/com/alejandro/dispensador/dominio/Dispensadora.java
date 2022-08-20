package com.alejandro.dispensador.dominio;

public class Dispensadora {
    private String marca;
    private double capacidad;
    private double cantidadActual;
    private double temperatura;
    private Cerveza cervezaActual;

    public Dispensadora(String marca, double capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.temperatura = -1;
    }

    public boolean servir(double cantidadAServir) {
        if (temperaturaEsValida() && cantidadAServirEsValida(cantidadAServir)) { // tempeturaValida() == true
            this.cantidadActual -= cantidadAServir;
            return true;
        }

        return false;
    }

    private boolean cantidadAServirEsValida(double cantidadAServir) {
        return cantidadAServir > 0 && cantidadAServir <= this.cantidadActual;
    }

    private boolean temperaturaEsValida() {
        return this.temperatura >= -10 && this.temperatura <= 10;
    }

    public boolean cambiarTemperatura(double nuevaTemperatura) {
        if (nuevaTemperatura >= -10 && nuevaTemperatura <= 10) {
            this.temperatura = nuevaTemperatura;
            return true;
        }

        return false;
    }

    public void cambiarCerveza(Cerveza nuevaCerveza) {
        this.vaciar();
        this.cervezaActual = nuevaCerveza;
        this.temperatura = nuevaCerveza.getTempRecomendada();
        this.llenar();
    }

    public void llenar() {
        this.cantidadActual = this.capacidad;
    }

    public void vaciar() {
        this.cantidadActual = 0;
    }

    public String getMarca() {
        return marca;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public Cerveza getCervezaActual() {
        return cervezaActual;
    }
}
