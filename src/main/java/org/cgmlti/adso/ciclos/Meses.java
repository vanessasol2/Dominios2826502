package org.cgmlti.adso.ciclos;

import java.util.Scanner;

public class Meses {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Lectura por teclado por meses
        String mes = input.next();

        switch (mes) {
            case "enero", "marzo", "mayo", "julio", "agosto", "octubre", "noviembre":
                System.out.println("Este mes tiene " + 31 + " días");
                break;

            case "febrero":
                System.out.println("Febrero tiene " + 28 + " días");
                break;

            case "abril", "junio", "septimbre", "diciembres":
                System.out.println("Este mes tiene " + 30 + " días");
                break;

            default:
                break;
        }
        input.close();
    }
}