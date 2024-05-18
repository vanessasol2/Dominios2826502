package org.cgmlti.adso.ciclos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vendedor> listaVendedores = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el código del vendedor " + i + ":");
            int codigo = scanner.nextInt();
            System.out.println("Ingrese el número de unidades vendidas por el vendedor " + i + ":");
            int unidadesVendidas = scanner.nextInt();

            Vendedor vendedor = new Vendedor(codigo, unidadesVendidas);
            listaVendedores.add(vendedor);
        }

        int maxUnidades = 0;
        int codigoMaxUnidades = 0;

        for (Vendedor vendedor : listaVendedores) {
            if (vendedor.getUnidadesVendidas() > maxUnidades) {
                maxUnidades = vendedor.getUnidadesVendidas();
                codigoMaxUnidades = vendedor.getCodigo();
            }
        }
        System.out.println(
                "El vendedor con el mayor número de unidades vendidas es el vendedor con código " + codigoMaxUnidades +
                        " con un total de " + maxUnidades + " unidades vendidas en el mes."
                        + "Y tambien es el ganador del concurso");
        scanner.close();
    }
}
