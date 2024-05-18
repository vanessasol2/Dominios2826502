package org.cgmlti.adso.ciclos;

public class Ejercicio {
    public static void main(String[] args) {
        int X = 19;
        int Y = 16;
        int Z = 0;
        int cuenta = 0;
        int total = 0;

        Z = X++ + Y;
        System.out.println((cuenta > 10) ? "cuenta mayor a 10" : "cuenta menor o igual a 10");
        total--;
        System.out.println(total);
        System.out.println(Z);
        System.out.println(X);

    }
}