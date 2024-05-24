package org.citasmedicas.java.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Medico {
    // El modificador de acceso
    // se pone antes del tipo de dato
    // del atributo
    // default
    //Se recomienda implementar encapsulamiento que todos los atributos de una clase sea PRIVATE
    private int id;
    private String nombres;
    private String apellidos;
    private Tipodeidentificacion tipodeidentificacion;
    private int numeroIdentificaicon;
    private int registroMedico;
    private Especialidad especialidad;

    // Constructor
    public Medico(int id, String nombres, String apellidos, Tipodeidentificacion tipodeidentificacion,
            int numeroIdentificaicon, int registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipodeidentificacion = tipodeidentificacion;
        this.numeroIdentificaicon = numeroIdentificaicon;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;

    }

    @Override // ToString
    public String toString() {
        return "Medico [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", tipodeidentificacion="
                + tipodeidentificacion + ", numeroIdentificaicon=" + numeroIdentificaicon + ", registroMedico="
                + registroMedico + ", especialidad=" + especialidad + "]";
    }
}
