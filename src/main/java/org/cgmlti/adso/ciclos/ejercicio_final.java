package org.cgmlti.adso.ciclos;

import java.util.ArrayList;

public class ejercicio_final {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(05);
        notas.add(24);
        notas.add(42);
        notas.add(35);
        notas.add(32);
        notas.add(50);
        notas.add(40);
        notas.add(42);
        notas.add(48);
        notas.add(50);

        Integer suma = 0;
        for (Integer nota : notas) {
            suma += nota;
        }
        Integer promedio = suma / notas.size();
        System.out.println("el promedio de las " + notas.size() + "notas es: " + promedio);
    }
}
