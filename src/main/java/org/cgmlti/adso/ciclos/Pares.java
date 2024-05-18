package org.cgmlti.adso.ciclos;

public class Pares {
    public static void main(String[] args) {
        int contador = 0;
        int total = 0;

        while (contador <= 11) {
            System.out.println(contador);
            total += contador;
            contador += 2;
        }
        // System.out.println("Total de la suma:" + total);

        while (contador <= 11) {
            // si contador es par
            if (contador % 2 == 0) {
                System.out.println(contador);
                total += contador;
            }
            contador++;
        }
        System.out.println("Total de la suma:" + total);

        for (int i = 0; i <= 11; i += 2) {
            System.out.println(i);
        }
    }
}
