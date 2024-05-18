package org.cgmlti.adso.ciclos;

public class CiclosBasicos {

    public static void main(String[] args) {

        // conatador es de tipo enterero
        int contador = 10;

        // el valor de la condicional deberia ser el valor final del ciclo
        while (contador >= 1) {
            // instruccion del ciclo:
            System.out.println(contador);
            // instruccion de incremento
            // se asigna a la variable de control, el mismo valor de la avariable de control
            // mas el valor de incremento, por lo general la intruccion de incremento se
            // ubica al final del bloque de codigo
            contador = contador - 1;
            --contador;
            //
        }
    }
}