package org.cgmlti.adso.ciclos;

public class Asteriscos {
    public static void main(String[] args) {

        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 10 - i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        int altura = 10;
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - 1; j++) {
                System.out.println(" ");
            }
            for (int k = 1; k <= 1; k++) {
                System.out.println("*");
            }
            System.out.println();
        }

    }

}
