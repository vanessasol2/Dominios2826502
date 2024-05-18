package org.cgmlti.adso.ciclos;

public class Vendedor {
    int codigo;
    int unidadesVendidas;

    Vendedor(int codigo, int unidadesVendidas) {
        this.codigo = codigo;
        this.unidadesVendidas = unidadesVendidas;
    }

    int getCodigo() {
        return codigo;
    }

    int getUnidadesVendidas() {
        return unidadesVendidas;
    }

}
