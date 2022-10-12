package com.eduardo.myapplication;

public class Pokemon {
    String nombre;
    String descripcion;
    int imagen;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public Pokemon(String nombre, String descripcion, int image) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
