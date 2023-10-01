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
/*Escribir un programa en el cual se ingresen cuatro numeros, 
    calcular e informar la suma de los dos primeros y el producto 
    del tercero y el cuarto*/

public class calcularSumaMultiplicacion {
    private Scanner teclado;
    int num1;
    int num2;
    int num3;
    int num4;
    int suma;
    int multiplicacion;
 
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor del primer numero:");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el valor del segundo numero:");
        num2 = teclado.nextInt();
        System.out.print("Ingrese el valor del tercer numero:");
        num3 = teclado.nextInt();
        System.out.print("Ingrese el valor del cuarto numero: ");
        num4 = teclado.nextInt();
    }
    
    public void calcularOperacion(){
        suma = num1 + num2;
        multiplicacion = num3 * num4;
        System.out.print("La suma de los dos primeros numeros es: " + suma);
        System.out.print("La multiplicacion de los dos ultimos numeros es: " + multiplicacion);
    }
    
    public static void main(String[] ar) {
        calcularSumaMultiplicacion calculo;
        calculo = new calcularSumaMultiplicacion();
        calculo.inicializar();
        calculo.calcularOperacion();
    }
}
