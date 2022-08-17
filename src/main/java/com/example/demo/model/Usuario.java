package com.example.demo.model;
import javax.persistence.*;


@Entity
@Table()
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String identificacionUsuario;
    private String nombre;
    private Integer tipoUsuario;
}