package com.alejandro.factory.dominio.excepcion;

public class AlertaNoImplementadaException extends RuntimeException {
    public AlertaNoImplementadaException(String error) {
        super(error);
    }
}
