package org.citasmedicas.java.entities;
import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cita {

    private int id;
    private LocalDate fecha;
    private LocalTime hora;
    private Medico medico;
    private Paciente paciente;
    private Consultorio consultorio;

    
    public Cita(int id, LocalDate fecha, LocalTime hora, Medico medico, Paciente paciente, Consultorio consultorio) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
        this.consultorio = consultorio;
    }

    
 




}
