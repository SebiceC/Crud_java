/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sebitas.crud;

import java.util.ArrayList;

import com.sebitas.crud.logica.CRUD;
import com.sebitas.crud.logica.Ciudad;

/**
 *
 * @author USUARIO
 */
public class Crud {

    public static void main(String[] args) {
        CRUD cr = new CRUD();
        //cr.crearCiudad(new Ciudad(5, "Girardot"));
        
        for (Ciudad ciudad : cr.leerCiudad()) {
            System.out.println(ciudad);
        }
        //cr.modificarCiudad(5, new Ciudad(5, "Melgar"));
        //cr.eliminarCiudad(2);
    }
}
