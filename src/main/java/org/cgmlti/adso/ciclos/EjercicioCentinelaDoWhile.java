package org.cgmlti.adso.ciclos;

import java.util.Scanner;

public class EjercicioCentinelaDoWhile {
    public static void main(String[] args) {

        /*
         * -Programa que lea notas
         * cualitativas (A,B,C,D,E)
         * -Cada vez que se lea una nota,
         * el programa debe mostrar el mensaje
         * "Desea Seguir"
         * -si el ususario ingresa N o "no"
         * para el programa
         * -Debe mostrar el número de
         * correspondientesa cada letra
         */

        Scanner entrada = new Scanner(System.in);
        // Variable String para la nota
        String notaCualitativas;

        // Contadores para cada tipo de nota:
        Integer conta = 0, contb = 0, contc = 0, contd = 0, conte = 0;

        // ciclo por centinela
        do {
            System.out.println("Ingrese la nota:(n para salir) ");
            notaCualitativas = entrada.nextLine();
            if (notaCualitativas.equals("a")) {
                // Incrementar el contador de A
                conta++;
            } else if (notaCualitativas.equals("b")) {
                contb++;
            } else if (notaCualitativas.equals("c")) {
                contc++;
            } else if (notaCualitativas.equals("d")) {
                contd++;
            } else if (notaCualitativas.equals("e")) {
                conte++;
            }
        } while (!notaCualitativas.equals("n"));

        // impresion de resultados:
        System.out.println("Cuantas a:" + conta);
        System.out.println("Cuantas b:" + contb);
        System.out.println("Cuantas c:" + contc);
        System.out.println("Cuantas d:" + contd);
        System.out.println("Cuantas e:" + conte);
        entrada.close();
    }

}
