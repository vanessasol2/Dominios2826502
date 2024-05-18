package org.cgmlti.adso.ciclos;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        // Ingresar 5 números
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número (1-10): ");
            int numero = n.nextInt();

            // Validar que el número esté entre 1 y 10
            while (numero < 1 || numero > 10) {
                System.out.println("Error: El número debe estar entre 1 y 10.");
                System.out.print("Ingrese un número (1-10): ");
                numero = n.nextInt();
            }

            // Imprimir asteriscos
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        n.close();
    }
}
