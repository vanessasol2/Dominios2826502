package org.cgmlti.adso.ciclos;

public class Acumuladores {
    public static void main(String[] args) {
        // total de los números de 1 a 10
        int contador = 0;
        int total = 0;

        while (contador <= 10) {
            // Operador de acumulación
            total += contador;
            contador++;
        }
        System.out.println("Total es:" + total);

    }
}
