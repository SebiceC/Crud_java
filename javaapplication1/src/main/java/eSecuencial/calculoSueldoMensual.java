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

/*Calcular el sueldo mensual de un operario conociendo la 
    cantidad de horas trabajadas y el pago por hora.*/

public class calculoSueldoMensual {
    private Scanner teclado;
    int horasTrabajadas;
    double pagoPorHora;
    double sueldoMensual;
    
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        horasTrabajadas = teclado.nextInt();
        System.out.print("Ingrese el pago por hora: ");
        pagoPorHora = teclado.nextDouble();
    }
    
    public void calculosueldoCliente(){
        sueldoMensual = horasTrabajadas * pagoPorHora;
        System.out.println("El sueldo mensual del operario es: " + sueldoMensual);
    }
   
    public static void main(String[] args) {
        calculoSueldoMensual calculoSueldo;
        calculoSueldo = new calculoSueldoMensual();
        calculoSueldo.inicializar();
        calculoSueldo.calculosueldoCliente();
    }
}


