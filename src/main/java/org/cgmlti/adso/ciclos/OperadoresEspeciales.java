package org.cgmlti.adso.ciclos;

public class OperadoresEspeciales {
    public static void main(String[] args) {
        // 1. Modificar la variable contador de 1 a 100
        // en incremento de 1
        int contador = 1;

        while (contador <= 100) {
            System.out.println(contador);
            contador++;
        }
        for (int i = 0; i <= 100; i += 1) {
            System.out.println(i);

        }
        System.out.println("___________");

        // 2. Modificar la variable contador de 1 a 100
        // en decremento de 1
        int contador2 = 100;

        while (contador2 >= 0) {
            System.out.println(contador2);
            contador2--;
        }
        for (int i = 100; i >= 0; i -= 1) {
            System.out.println(i);
        }
        System.out.println("___________");

        // 3.Modificar la variable contador de 7 a 77
        // en incremento de 7
        int contador3 = 0;

        while (contador3 <= 7) {
            System.out.println(contador3);
            contador3++;
        }
        for (int i = 7; i <= 77; i += 7) {
            System.out.println(i);
        }
        System.out.println("___________");

        // 4.Modificar la variable contador de 20 a 2
        // en decremento de 2
        int contador4 = 20;

        while (contador4 >= 2) {
            System.out.println(contador4);
            contador4 -= 2;
        }
        for (int i = 20; i >= 2; i -= 2) {
            System.out.println(i);
        }
        System.out.println("___________");

        // 5. Modificar la variable de control con la
        // siguiente secuencia de valores: 2,5,8,11,14,17,20

        int contador5 = 2;

        while (contador5 <= 20) {
            System.out.println(contador5);
            contador5 += 3;
        }
        for (int i = 2; i <= 20; i += 3) {
            System.out.println(i);
        }
        System.out.println("___________");
    }
}
