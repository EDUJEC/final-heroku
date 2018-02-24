/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.finalheroku;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.data.annotation.Id;

/**
 *
 * @author JOSEEDUARDO
 */
public class Mensajito {
    
    @Id
    private String id;
    private LocalDate fecha;

    public Mensajito(LocalTime hora) {
        this.hora = hora;
    }

    public Mensajito(String id, LocalDate fecha, LocalTime hora, String Titulo, String Cuerpo) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.Titulo = Titulo;
        this.Cuerpo = Cuerpo;
    }
    private LocalTime hora;

    public Mensajito(String id, String Titulo, String Cuerpo) {
        this.id = id;
        this.Titulo = Titulo;
        this.Cuerpo = Cuerpo;
        fecha=LocalDate.now();
        hora=LocalTime.now();
    }

    public Mensajito(String id) {
        this.id = id;
    }
    private String Titulo;

    public Mensajito(String Titulo, String Cuerpo) {
        this.Titulo = Titulo;
        this.Cuerpo = Cuerpo;
        fecha=LocalDate.now();
        hora=LocalTime.now();
    }

    public Mensajito(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Mensajito(String id, LocalDate fecha, String Titulo, String Cuerpo) {
        this.id = id;
        this.fecha = fecha;
        this.Titulo = Titulo;
        this.Cuerpo = Cuerpo;
    }

    public Mensajito() {
    }
    private String Cuerpo;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getCuerpo() {
        return Cuerpo;
    }

    public void setCuerpo(String Cuerpo) {
        this.Cuerpo = Cuerpo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
