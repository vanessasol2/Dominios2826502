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
    System.out.println(m);

    // instanciar(crear objeto) Pasiente
    Paciente p1 = new Paciente(1, "julian" , "Rodriguez", Tipodeidentificacion.CEDULA_CIUDADANIA, 123456, "julian@gmail.com", 300000, LocalDate.of(2024, Month.MAY, 5), 1.90, 112.2, TipoSangre.o_positivo, '-');
    System.out.println(p1);
    
    // instanciar(crear objeto) Consultorio
    Consultorio con1 = new Consultorio(22, "calle125", 1222222);
    System.out.println(con1);

    // instanciar(crear objeto) Cita

    Cita cit1 = new Cita(1,
            LocalDate.of(2024, Month.MAY, 5), 
            LocalTime.of(5, 30, 00), 
            m ,
            p1,
            con1);

    System.out.println(cit1);

    System.out.println("la fecha es: " + cit1.getFecha() + " y hora: " + cit1.getHora() + " sera en el consultorio: " + cit1.getConsultorio() + " con el doctor: " + cit1.getMedico() + " y el paciente: " + cit1.getPaciente());


        
    }

}
