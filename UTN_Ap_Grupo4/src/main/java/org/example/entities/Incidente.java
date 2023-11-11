package org.example.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Incidente {
    private Integer id;
    private String tipo;
    private String descripcion;
    private Estado estado;
    private LocalDate fechaDeCreacion;
    private LocalDate fechaEstimada;
    private LocalDate fechaDeFinalizacion;
    private Operador operador;
    private List<Problema> problemas;


}
