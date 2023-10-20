/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sebitas.crud;

import java.util.ArrayList;

import com.sebitas.crud.logica.CRUD;
import com.sebitas.crud.logica.Ciudad;
import com.sebitas.crud.logica.Propietario;
import com.sebitas.crud.interfaz.Principal;

/**
 *
 * @author USUARIO
 */
public class Crud {

    public static void main(String[] args) {
        CRUD cr = new CRUD();
        //cr.crearCiudad(new Ciudad(5, "Girardot"));
        
        ArrayList<Propietario> prop =(ArrayList) cr.leerPropiertarios();
        System.out.println(prop.size());
        for(int i=0;i<prop.size();i++){
            System.out.println(prop.get(i));
        }
        //cr.modificarCiudad(5, new Ciudad(5, "Melgar"));
        //cr.eliminarCiudad(2);
        Principal prin = new Principal();
        prin.setVisible(true);
    }
 
}
