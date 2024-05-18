package org.cgmlti.adso.ciclos;

public class Impares {
    public static void main(String[] args) {

        // Acumulador
        int suma = 0;

        for (int contador = 1; contador <= 99; contador++) {
            if (contador % 2 != 0) {
                suma += contador;
            }
            System.out.println("Suma de números" + suma);
        }
    }

}