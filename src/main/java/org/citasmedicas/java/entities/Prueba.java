package org.citasmedicas.java.entities;

import java.time.LocalDate;
import java.time.Month;

public class Prueba {
    public static void main(String[] args) {
        // instanciar medico con constructor
        // por defecto
        Medico m = new Medico();
        //Asignar 
        m.setId(0);
        //imprimir el id del medico utilizo getId
        System.out.println(m.getId());

        Paciente p1 = new Paciente(1, 
                "Santiago Bandido", 
                "Duarte", 
                Tipodeidentificacion.CEDULA_CIUDADANIA,
                123434, 
                "samtidm58@gmail.com",
                30000, 
                LocalDate.of(2024, Month.MAY, 23), 
                1.75, 
                80.0, 
                TipoSangre.o_negativo,
                '-');

        //los getter y setter de lombok
        System.out.println("Nombre: " + p1.getNombres() + ", Apellidos: " + p1.getApellidos() + ", Celular: " + p1.getCelular() + ", correo " + p1.getCorreo() );
    }

}
