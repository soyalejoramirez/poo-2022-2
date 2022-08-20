package com.alejandro.banco.app;

import com.alejandro.banco.dominio.CuentaBancaria;
import com.alejandro.banco.dominio.Persona;

public class AppBanco {
    public static void main(String[] args) {
        Persona alfredo = new Persona("Alfredo", 678);
        Persona viviana = new Persona("Viviana", 123);

        CuentaBancaria cuentaAlfredo = new CuentaBancaria(alfredo, "Ahorros", 47853);
        CuentaBancaria cuentaViviana = new CuentaBancaria(viviana, "Ahorros", 78790);

        cuentaAlfredo.consignar(100000);
        cuentaAlfredo.retirar(50000);
        cuentaAlfredo.transferir(cuentaViviana, 45000);

        System.out.println(cuentaAlfredo.getTipo());

        System.out.println(cuentaAlfredo.consultarSaldoActual());
        System.out.println(cuentaViviana.consultarSaldoActual());
    }
}