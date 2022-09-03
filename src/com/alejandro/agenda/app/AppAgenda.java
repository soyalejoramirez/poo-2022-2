package com.alejandro.agenda.app;

public class AppAgenda {
    public static void main(String[] args) throws InterruptedException {
        recursivo();
    }

    public static void recursivo() throws InterruptedException {
        long iteraciones = 20;
        for (long i = 1; i < 20; i++) {
            System.out.println("Ciclo #" + i + ". Memoria libre: " + Runtime.getRuntime().freeMemory());

            int ciclo = 2;
            long[] arrayPesado = new long[(int) iteraciones];

            do {
                arrayPesado[ciclo] = 0;
                ciclo--;
            } while (ciclo > 0);

            iteraciones = iteraciones * 50;
            System.out.println("\nMemoria requerida para el siguiente ciclo: " + iteraciones);
            Thread.sleep(2500);
        }

    }
}
