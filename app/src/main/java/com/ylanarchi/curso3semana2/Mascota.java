package com.ylanarchi.curso3semana2;

/**
 * Created by ylan on 01/02/17.
 */

public class Mascota {
    private String nombre;
    private int cantidadDeLikes;
    private int foto;

    public Mascota(String nombre, int cantidadDeLikes, int foto) {
        this.nombre = nombre;
        this.cantidadDeLikes = cantidadDeLikes;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeLikes() {
        return cantidadDeLikes;
    }

    public void setCantidadDeLikes(int cantidadDeLikes) {
        this.cantidadDeLikes = cantidadDeLikes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
