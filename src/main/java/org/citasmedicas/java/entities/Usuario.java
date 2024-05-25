package org.citasmedicas.java.entities;

import lombok.Getter;

import lombok.Setter;

@Getter
@Setter

//de una clase abstracta no se puede crear objetos
//no se puede instanciar
// ej: Usuario u = new usuario: no se puede crear
public abstract class Usuario {
    protected int id;
    
    protected String nombres;

    protected String apellidos;

    protected Tipodeidentificacion tipodeidentificacion;

    protected int numeroIdentificaicon;

    public Usuario(int id, String nombres, String apellidos, Tipodeidentificacion tipodeidentificacion,
            int numeroIdentificaicon) {

        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipodeidentificacion = tipodeidentificacion;
        this.numeroIdentificaicon = numeroIdentificaicon;

    }

}
