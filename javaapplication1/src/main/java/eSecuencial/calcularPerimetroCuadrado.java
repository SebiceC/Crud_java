/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eSecuencial;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
 /*Realizar la carga del lado de un cuadrado, mostrar por pantalla 
    el perímetro del mismo (El perímetro de un cuadrado se calcula 
    multiplicando el valor del lado por cuatro)*/

public class calcularPerimetroCuadrado {
    private Scanner teclado;
    int lado;
    int perimetro;
   
    public void inicializar(){
        teclado=new Scanner(System.in);
        System.out.print("Ingrese el valor del lado del cuadrado:");
        lado = teclado.nextInt();
    }
    public void calcularPerimetro(){
        perimetro = lado * 4;
        System.out.print("el perimetro del cuadrado es:" + perimetro);
    }
    public static void main(String[] ar) {
        calcularPerimetroCuadrado perimetro;
        perimetro = new calcularPerimetroCuadrado();
        perimetro.inicializar();
        perimetro.calcularPerimetro();
    }
}

    
   