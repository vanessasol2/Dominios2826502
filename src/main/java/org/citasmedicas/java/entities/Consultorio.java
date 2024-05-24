package org.citasmedicas.java.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Consultorio {

    private int id;
    private String direccion;
    private int numero;

}
