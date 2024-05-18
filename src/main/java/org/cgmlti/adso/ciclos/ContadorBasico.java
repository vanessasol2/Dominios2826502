package org.cgmlti.adso.ciclos;

public class ContadorBasico {

    public static void main(String[] args) {

        // variable contador:
        // (romentable entera o doble)
        // comineza con el valor inicial
        int i = 0;

        // ciclo while
        while (i < 10) {
            System.out.println(i);
            // Instrucción de incremento
            // operación contadora
            i = i + 1;
            /* Otras forma de escribir la operación: (++i;) (i += 1;) (i++;) */
        }
    }
}
