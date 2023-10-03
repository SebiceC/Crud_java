package com.sebitas.crud.logica;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class CRUD {
    private Conexion Con;
    private PreparedStatement pst;
    
    //CRUD CIUDAD:
    public boolean crearCiudad(Ciudad ciudad){
        String sql = "insert into ciudad (idciudad,ciudadNombre) VALUES (?,?)";
        try {
            Con.Conectar();
            pst = Con.getConector().prepareStatement(sql);
            pst.setInt(1, ciudad.getIdCiudad());
            pst.setString(2, ciudad.getCiudadNombre());
            pst.execute();
            Con.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public List<Ciudad> leerCiudad(){
        String sql = "select idciudad,ciudadnombre from ciudad";
        ResultSet result;
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        try {
            Con.Conectar();
            pst = Con.getConector().prepareStatement(sql);
            result = pst.executeQuery();
            while (result.next()) {
                ciudades.add(new Ciudad(result.getInt(1),result.getString(2)));
            }
            Con.desconectar();
            return ciudades;
        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getMessage());
        }
        return new ArrayList<>();
    }
    public void modificarCiudad(int idViejo,Ciudad nuevaCiudad){
        String sql = "UPDATE ciudad SET idciudad=?,ciudadnombre=? Where idciudad=?";
        try {
            Con.Conectar();
            pst = Con.getConector().prepareStatement(sql);
            pst.setInt(1, nuevaCiudad.getIdCiudad());
            pst.setString(2, nuevaCiudad.getCiudadNombre());
            pst.setInt(3, idViejo);
            pst.executeUpdate();
            Con.desconectar();
        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getMessage());
        }
    }
    public boolean eliminarCiudad(int idciudad){
        boolean retorno;
        String sql = "DELETE from ciudad where ciudad.idciudad=?";
        try {
            Con.Conectar();
            pst = Con.getConector().prepareStatement(sql);
            pst.setInt(1, idciudad);
            retorno = pst.execute();
            Con.desconectar();
            return retorno;
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
            return false;
        }
    }

    public CRUD() {
        this.Con = new Conexion();
    }


}
