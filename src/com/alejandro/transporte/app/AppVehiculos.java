package com.alejandro.transporte.app;

import com.alejandro.transporte.dominio.BiciMTB;
import com.alejandro.transporte.dominio.BiciRuta;
import com.alejandro.transporte.dominio.Bicicleta;
import com.alejandro.transporte.dominio.Carro;
import com.alejandro.transporte.dominio.Taxi;
import com.alejandro.transporte.dominio.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class AppVehiculos {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Vehiculo carro = new Carro(444, "Tesla", "AAA111");

        vehiculos.add(new BiciMTB(999, "Trek"));
        vehiculos.add(new Bicicleta(234, "Trek"));
        vehiculos.add(new BiciRuta(666, "Pinarello"));
        vehiculos.add(carro);
        vehiculos.add(new Vehiculo(123, "Mazda"));
        vehiculos.add(new Taxi(456, "Renault", "ABC123"));

        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiActual = vehiculos.get(i);
            vehiActual.acelerar();

            if (vehiActual instanceof Bicicleta) {
                ((Bicicleta) vehiActual).imprimirCadencia();
            }

            if (vehiActual instanceof Taxi) {
                System.out.println(vehiActual);
            }
        }
    }
}
