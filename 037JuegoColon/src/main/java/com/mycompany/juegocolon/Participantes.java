/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegocolon;

/**
 *
 * @author CDMFP
 */
public class Participantes {
    private String nombre;
    private int puntos;

    public Participantes(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", puntos=" + puntos + '}';
    }
}
