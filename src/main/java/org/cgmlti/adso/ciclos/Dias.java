package org.cgmlti.adso.ciclos;

import java.util.Scanner;

public class Dias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 7: ");
        int diaNumero = sc.nextInt();

        switch (diaNumero) {
            case 1:
                System.out.println("Lunes" + "Inicio de semana");
                break;

            case 2:
                System.out.println("Martes");
            case 3:
                System.out.println("Miércoles");
                System.out.println("Mediado de semana");
                break;

            case 4:
                System.out.println("Jueves");
            case 5:
                System.out.println("Viernes");
                System.out.println("inicio de fin de semana");
                break;

            case 6:
                System.out.println("Sábado");
            case 7:
                System.out.println("Domingo");
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Dia no reconocido");
                break;
        }
        sc.close();
    }
}
