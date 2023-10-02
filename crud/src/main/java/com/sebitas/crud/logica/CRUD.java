package com.sebitas.crud.logica;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUD {
    private conexion Con;
    private PreparedStatement pst;
    
    public boolean crearCiudad(int idCiudad,String nombreCiudad){
        String sql = "insert into ciudad (idciudad,ciudadNombre) VALUES (?,?)";
        try {
            Con.Conectar();
            pst = Con.getConector().prepareStatement(sql);
            pst.setInt(1, idCiudad);
            pst.setString(2, nombreCiudad);
            pst.execute();
            Con.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public CRUD() {
        this.Con = new conexion();
    }


}
