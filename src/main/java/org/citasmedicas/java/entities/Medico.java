package org.citasmedicas.java.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter


public class Medico extends Usuario{

    private int registroMedico;
    private Especialidad especialidad;         


    public Medico(int id, 
    String nombres, 
    String apellidos, 
    Tipodeidentificacion tipodeidentificacion,
    int numeroIdentificaicon, 
    int registroMedico, 
    Especialidad especialidad) {

        //super(): llamada al constuctor de la clase padre(superclase)
        //super(): obligatorio en na clase hija
        //super():debe e la primera instruccion en el constructor 
        //super permite acceder todo lo que tenga la clase papa  
        super(id, nombres, apellidos, tipodeidentificacion, numeroIdentificaicon);
        //inicializacion de los atributos propios 
        //de la clase hijo
        //se hace con this
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
        }

}