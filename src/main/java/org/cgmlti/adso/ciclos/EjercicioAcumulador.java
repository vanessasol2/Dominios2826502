package org.cgmlti.adso.ciclos;

public class EjercicioAcumulador {
    public static void main(String[] args) {
        // A.Declara un variable suma y x como tipo int
        // B.Asignar 1 a la variable x
        // C.Asignar 0 a la variable suma
        // D.Suma la variable x a suma y asignar
        // el rsultado a la variable suma
        // E.Imprimir la cadena "La suma es:",
        // seguda del valor de la variable suma

        int suma = 0;
        int X = 1;

        while (suma <= 10) {
            // Operador de acumulación
            suma += X;
            suma++;
            suma += X;
            suma++;
        }

        System.out.println("La suma es:" + suma);
    }
}
