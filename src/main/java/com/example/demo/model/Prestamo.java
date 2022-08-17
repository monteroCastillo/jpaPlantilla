package com.example.demo.model;

import javax.persistence.*;

import java.time.LocalDate;


@Entity
@Table()
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate fechaPrestamo;
    private LocalDate fechaMaximaDevolucion;
    private String identificacionUsuario;
    private String  isbn;
    private Integer tipoUsuario;

}