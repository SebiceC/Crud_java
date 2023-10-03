package com.sebitas.crud.logica;

public class Propietario {
    private int id;
    private String nombre;
    private Genero genero;
    private Ciudad ciudad;
    
    public Propietario() {
    }
    public Propietario(int id, String nombre, Genero genero, Ciudad ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.ciudad = ciudad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public Ciudad getCiudad() {
        return ciudad;
    }
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    @Override
    public String toString() {
        return "Propietario [id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", ciudad=" + ciudad + "]";
    }
    

}
