package org.cgmlti.adso.ciclos;

import java.util.Scanner;

public class Centinela {

    public static void main(String[] args) {
        // Advertencia:Para la repetición
        // controlada por centinela es adecuado, recomendado
        // trabajar con WHILE y DO WHILE
        // si se va a trabajar con contador
        // es recomedado trabajar con el ciclo for

        Scanner entradaTeclado = new Scanner(System.in);
        // Variable Acumulativa
        double suma = 0.0;
        Integer contador = 0;

        // Ingresar la primera nota con un mensaje
        System.out.println("Ingrese Nota: ");
        double nota = entradaTeclado.nextDouble();

        // La variable de control (centinela)
        // va a ser la misma nota
        while (nota != 0.0) {
            // instrucción de acumulación
            suma += nota;
            // instrucción de ingremento
            contador++;
            System.out.println("Ingrese nota: ");
            nota = entradaTeclado.nextDouble();
        }
        // Error cuando no ingresan notas
        if (contador == 0) {
            System.out.println("Notas no ingresadas");
        } else {
            System.out.println("Número de notas ingresadas:" + contador);
            System.out.println("Promedio" + suma / contador);
        }
        entradaTeclado.close();
    }

}
