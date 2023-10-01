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

 /*Realizar un programa que lea cuatro valores numéricos e 
    informar su suma y promedio.*/

public class calcularSumaPromedio {
    private Scanner teclado;
    int num1;
    int num2;
    int num3;
    int num4;
    int suma;
    float promedio;

    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor del primer numero:");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el valor del segundo numero:");
        num2 = teclado.nextInt();
        System.out.print("Ingrese el valor del tercer numero:");
        num3 = teclado.nextInt();
        System.out.print("Ingrese el valor del cuarto numero:");
        num4 = teclado.nextInt();
    }
    
    public void operaciones(){
        suma = num1 + num2 + num3 + num4;
        promedio = suma / 4;
        System.out.print("La suma de los 4 numeros es:");
        System.out.println(suma);
        System.out.print("el promedio de los 4 numeros es:");
        System.out.println(promedio);
    }
    public static void main(String[] ar) {
       calcularSumaPromedio calcular;
       calcular = new calcularSumaPromedio();
       calcular.inicializar();
       calcular.operaciones(); 
    }
}
