package org.cgmlti.adso.ciclos;

public class Lineas {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 20) {
            System.out.println(i);
            System.out.println("\t");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

}
