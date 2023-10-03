package com.sebitas.crud.logica;

public class Ciudad {
    private int idCiudad;
    private String ciudadNombre;
    

    public Ciudad(int idCiudad, String ciudadNombre) {
        this.idCiudad = idCiudad;
        this.ciudadNombre = ciudadNombre;
    }
    public Ciudad() {
    }
    public int getIdCiudad() {
        return idCiudad;
    }
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
    public String getCiudadNombre() {
        return ciudadNombre;
    }
    public void setCiudadNombre(String ciudadNombre) {
        this.ciudadNombre = ciudadNombre;
    }
    @Override
    public String toString() {
        return "Ciudad [idCiudad=" + idCiudad + ", ciudadNombre=" + ciudadNombre + "]";
    }
    
}
