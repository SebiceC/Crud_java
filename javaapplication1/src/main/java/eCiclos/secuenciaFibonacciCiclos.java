/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eCiclos;
import java.util.Scanner;
/**
 *
 * Desarrolla un programa que genere los primeros N números de la secuencia de Fibonacci, 
 * donde cada número es la suma de los dos anteriores (0, 1, 1, 2, 3, 5, ...)
 */
public class secuenciaFibonacciCiclos {
    private Scanner teclado;
    int numero;
    
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        numero = teclado.nextInt();
    }
    
    public void generarSecuenciaFibonacci(){
        
        int primero = 0;
        int segundo = 1; 
        
        for (int i = 0; i < numero; i++) {
           System.out.print(primero);
           if (i < numero - 1) {
               System.out.print(", ");
           }

           int siguiente = primero + segundo;
           primero = segundo;
           segundo = siguiente;
        }
    }
    public void resultado(){
        System.out.println("     Los primeros " + numero + " números de la secuencia de Fibonacci son:");
    }
    public static void main(String[] args) {
        secuenciaFibonacciCiclos secFibonacci;
        secFibonacci = new secuenciaFibonacciCiclos();
        secFibonacci.inicializar();
        secFibonacci.generarSecuenciaFibonacci();
        secFibonacci.resultado();
    }   
}

