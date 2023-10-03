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
public class Conexion {
    private static final String USER = "root";
    private static final String PASS = "123456";
    private static final String URLJDBC = "jdbc:mysql://localhost:3306/crudsebastian";
    private Connection conector;
    public Conexion(){
      // TODO document why this constructor is empty
    }
    public void Conectar(){
        try{
            conector=DriverManager.getConnection(URLJDBC,USER,PASS);
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
