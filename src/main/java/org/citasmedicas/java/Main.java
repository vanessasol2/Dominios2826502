package org.citasmedicas.java;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

import org.citasmedicas.java.entities.*;

public class Main {
    public static void main(String[] args) {
        // instanciar(crear objeto) medico
       Medico m = new Medico(1,
                "carlos",
                "martinez",
                Tipodeidentificacion.CEDULA_CIUDADANIA,
                2565489,
                32156,
                Especialidad.CARDIOLOGIA);

    // instanciar(crear objeto) Pasiente
    Paciente p1 = new Paciente(1, "julian" , "Rodriguez", Tipodeidentificacion.CEDULA_CIUDADANIA, 123456, "julian@gmail.com", 300000, LocalDate.of(2024, Month.MAY, 5), 1.90, 112.2, TipoSangre.o_positivo, '-');
    
    
    // instanciar(crear objeto) Consultorio
    Consultorio con1 = new Consultorio(22, "calle125", 1222222);

    // instanciar(crear objeto) Cita

   CitaMedico ctm1 = new CitaMedico(1,LocalDate.of(2024, Month.MAY, 5), 
   LocalTime.of(5, 30, 00), m, p1, con1, m, Estado.ACEPTADA);

    System.out.println("el esado de la cita: " + ctm1.getEstado());
    System.out.println("la fecha es: " + ctm1.getFecha() + " y hora: " + ctm1.getHora() + " sera en el consultorio: " + ctm1.getConsultorio() + " con el doctor: " + ctm1.getMedico() + " y el paciente: " + ctm1.getPaciente());


        
    }

}
