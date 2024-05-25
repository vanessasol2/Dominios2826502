package org.citasmedicas.java.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Getter;

import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class CitaMedico extends Cita {
    Estado estado;
    //@TODO: AGREGAR CONSTRUCTOR, GETTERS y SETTERS

    public CitaMedico(int id, 
    LocalDate fecha, 
    LocalTime hora,
    Medico medico,
    Paciente paciente,
    Consultorio consultorio,
    
    Estado estado) {
        super(id, fecha, hora, medico, paciente, consultorio);
        this.estado = estado;
    }

   
    

}
