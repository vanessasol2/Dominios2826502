package org.citasmedicas.java.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Enfermero extends Usuario {

    protected TipoProcedimiento tipoProcedimiento;
    protected boolean disponibilidad;
    protected Turno turno;

    public Enfermero(int id, 
        String nombres, 
        String apellidos, 
        Tipodeidentificacion tipodeidentificacion,
        int numeroIdentificaicon, TipoProcedimiento tipoProcedimiento, 
        boolean disponibilidad, 
        Turno turno) {
        super(id, nombres, apellidos, tipodeidentificacion, numeroIdentificaicon);
        this.tipoProcedimiento = tipoProcedimiento;
        this.disponibilidad = disponibilidad;
        this.turno = turno;
    }
}
