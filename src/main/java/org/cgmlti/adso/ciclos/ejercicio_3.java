package org.cgmlti.adso.ciclos;

public class ejercicio_3 {
    public static void main(String[] args) {

        int contador = 0;
        int total = 0;
        while (contador <= 10) {
            contador++;
            total = 0;
            total += contador;
            System.out.println(total);
        }
    }
}