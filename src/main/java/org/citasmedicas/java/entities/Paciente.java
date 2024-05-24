package org.citasmedicas.java.entities;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter

public class Paciente {

    private int id;
    private String nombres;
    private String apellidos;
    private Tipodeidentificacion tipodeidentificacion;
    private int numeroIdentificaicon;
    private String correo ;
    private int celular;
    private LocalDate fechadenacimiento;
    private double altura;
    private double peso ;
    private TipoSangre tiposangre;
    private Character factorRH;

}
