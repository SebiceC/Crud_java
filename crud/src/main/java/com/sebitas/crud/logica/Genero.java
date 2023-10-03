package com.sebitas.crud.logica;

public class Genero {
    private int idGenero;
    private String generoNombre;
    public Genero(int idGenero, String generoNombre) {
        this.idGenero = idGenero;
        this.generoNombre = generoNombre;
    }
    public Genero() {
    }
    public int getIdGenero() {
        return idGenero;
    }
    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }
    public String getGeneroNombre() {
        return generoNombre;
    }
    public void setGeneroNombre(String generoNombre) {
        this.generoNombre = generoNombre;
    }
    @Override
    public String toString() {
        return "Genero [idGenero=" + idGenero + ", generoNombre=" + generoNombre + "]";
    }
    
}
