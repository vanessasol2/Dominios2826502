package org.cgmlti.adso.ciclos;

import java.util.Scanner;

public class CentinelaDoWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // Variable necesarias:
        Double nota, suma = 0.0;
        Integer contador = 0;

        do {
            System.out.println("Ingrese nota");
            nota = entrada.nextDouble();
            System.out.println("Nota ingresada:" + nota);
            // Instrucción de conteo contador:
            contador++;
            // Instrucción de acumulación;
            suma += nota;
        } while (nota != 0.0);

        // Impresion de resulatados:
        System.out.println("Número de notas ingresadas: " + contador);
        System.out.println("Promedio: " + suma / contador);

        // Cerrar conexión con la entrada
        entrada.close();

    }

}
