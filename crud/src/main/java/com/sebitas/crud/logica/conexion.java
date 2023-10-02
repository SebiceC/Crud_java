/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebitas.crud.logica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class conexion {
    private Connection conector;
    private String contrasena;
    private String user;
    public conexion(){
        this.contrasena="123456";
        this.user = "root";
    }
    public void Conectar(){
        try{
            conector=DriverManager.getConnection("jdbc:mysql://localhost:3306/cine",user,contrasena);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public Connection getConector() {
        return conector;
    }
    public void setConector(Connection conector) {
        this.conector = conector;
    }
    /**
     * 
     * @throws SQLException lanza una excepcion en caso de un error
     */
    public void desconectar() throws SQLException{
        try {
            conector.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
