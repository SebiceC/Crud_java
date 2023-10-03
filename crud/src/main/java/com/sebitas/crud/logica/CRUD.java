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
    public void crearCiudad(Ciudad ciudad){
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
        return ciudades;
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
    //fin CRUD ciudad
    //CRUD genero:
    public void crearGenero(Genero genero){
        String sql = "insert into genero (idgenero,generoNombre) VALUES (?,?)";
        try {
            Con.Conectar();
            pst = Con.getConector().prepareStatement(sql);
            pst.setInt(1, genero.getIdGenero());
            pst.setString(2, genero.getGeneroNombre());
            pst.execute();
            Con.desconectar();
        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getMessage());
        }
    }
    public List<Genero> leerGenero(){
        String sql = "select idgenero,generoNombre from genero";
        ResultSet resultSet;
        ArrayList<Genero> generos = new ArrayList<>();
        try {
            Con.Conectar();
            pst = Con.getConector().prepareStatement(sql);
            resultSet = pst.executeQuery();
            while (resultSet.next()) {
                generos.add(new Genero(resultSet.getInt(1),resultSet.getString(2)));
            }
            Con.desconectar();
            return generos;
        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getMessage());
        }
        return generos;
    }
    public void modificarGenero(int idViejo,Genero nuevoGenero){
        String sql = "UPDATE genero SET idgenero=?,generoNombre=? Where idgenero=?";
        try {
            Con.Conectar();
            pst = Con.getConector().prepareStatement(sql);
            pst.setInt(1, nuevoGenero.getIdGenero());
            pst.setString(2, nuevoGenero.getGeneroNombre());
            pst.setInt(3, idViejo);
            pst.executeUpdate();
            Con.desconectar();
        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getMessage());
        }
    }
    public boolean eliminarGenero(int idgenero){
        boolean retorno;
        String sql = "DELETE from genero where genero.idgenero=?";
        try {
            Con.Conectar();
            pst = Con.getConector().prepareStatement(sql);
            pst.setInt(1, idgenero);
            retorno = pst.execute();
            Con.desconectar();
            return retorno;
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
            return false;
        }
    }
    //fin crud genero
    //CRUD Propietario
    public void crearPropietario(Propietario propietario){
        String sql = "insert into propietario (numID,nombre,idGenero,idCiudad) VALUES (?,?,?,?)";
        try {
            Con.Conectar();
            pst = Con.getConector().prepareStatement(sql);
            pst.setInt(1, propietario.getId());
            pst.setString(1, propietario.getNombre());
            pst.setInt(3, propietario.getGenero().getIdGenero());
            pst.setInt(4, propietario.getCiudad().getIdCiudad());
            pst.execute();
            Con.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public List<Propietario> leerPropiertarios(){
        String sql = "select t.numID,t.nombre,t.idGenero,t.generoNombre,t.idCiudad,c.ciudadNombre from (select p.numID,p.nombre,p.idGenero,g.generoNombre,p.idCiudad from propietario p JOIN genero g ON p.idGenero=g.idgenero)as t JOIN ciudad c ON t.idCiudad=c.idciudad order by t.numID asc";
        ResultSet resultSet;
        ArrayList<Propietario> propietarios = new ArrayList<>();
        try {
            Con.Conectar();
            pst = Con.getConector().prepareStatement(sql);
            resultSet = pst.executeQuery();
            while (resultSet.next()) {
                propietarios.add(new Propietario(resultSet.getInt(1), 
                                resultSet.getString(2), 
                                new Genero(resultSet.getInt(3), resultSet.getString(4)), 
                                new Ciudad(resultSet.getInt(5),resultSet.getString(6))));
            }
            Con.desconectar();
            return propietarios;
        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getMessage());
        }
        return propietarios;
    }
    public void modificarPropiertario(){

    }

    public boolean eliminarPropietario(int idP){
        boolean retorno;
        String sql = "DELETE from propietario where propietario.numID=?";
        try {
            Con.Conectar();
            pst = Con.getConector().prepareStatement(sql);
            pst.setInt(1, idP);
            retorno = pst.execute();
            Con.desconectar();
            return retorno;
        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getMessage());
            return false;
        }
    }
    public CRUD() {
        this.Con = new Conexion();
    }


}
