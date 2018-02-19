/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.finalheroku;

/**
 *
 * @author JOSEEDUARDO
 */
public class Mensajito {
    
    private String Titulo;

    public Mensajito(String Titulo, String Cuerpo) {
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
}
