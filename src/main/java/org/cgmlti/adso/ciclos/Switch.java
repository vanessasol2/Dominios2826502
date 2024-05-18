package org.cgmlti.adso.ciclos;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // Crear objeto lector
        Scanner in = new Scanner(System.in);

        // Leer el número por teclado
        int numero = in.nextInt();

        // Seleccionar acciones en cado del
        // valor de numero
        switch (numero) {
            case 1:
                System.out.println("Este es el número uno");
                break;

            case 2:
                System.out.println("Este es el número dos");
                break;

            case 3:
                System.out.println("Este es el número tres");
                break;

            case 4:
                System.out.println("Este es el npumero cuatro");
                break;

            // No cumple con ninguna valor
            default:
                System.out.println("El valor no esta contemprado");
                break;
        }
        in.close();
    }
}