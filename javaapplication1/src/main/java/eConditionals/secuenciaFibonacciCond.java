/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eConditionals;

import java.util.Scanner;

public class secuenciaFibonacciCond {
    private Scanner teclado;
    int n;
    
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números de la secuencia de Fibonacci a generar: ");
        n = teclado.nextInt();
    }
    
    public void generarFibonacciSecuencia(){
        int primero = 0;
        int segundo = 1;
        
        if (n >= 1) {
            System.out.print(primero);
        }
        if (n >= 2) {
            System.out.print(", " + segundo);
        }
        for (int i = 3; i <= n; i++) {
            int siguiente = primero + segundo;
            System.out.print(", " + siguiente);
            primero = segundo;
            segundo = siguiente;
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        secuenciaFibonacciCond fibonacci;
        fibonacci = new secuenciaFibonacciCond();
        fibonacci.inicializar();
        fibonacci.generarFibonacciSecuencia();
    }
}
