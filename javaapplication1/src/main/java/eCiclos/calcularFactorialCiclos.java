/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eCiclos;
import java.util.Scanner;
/**
 *
 * Crea un programa que calcule el factorial de un número ingresado por el usuario. El factorial de un número N se calcula multiplicando todos los enteros
 */
public class calcularFactorialCiclos {
    private Scanner teclado;
    int numero;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        numero = teclado.nextInt();
    }
    
    public void calcularFactorial() {
        long factorial = 1; // Usamos 'long' para manejar números grandes

        // Calculamos el factorial usando un bucle 'for'
        for (int i = 1; i <= numero; i++) {
            factorial *= i; // Multiplicamos 'factorial' por 'i'
        }

        System.out.println("El factorial de " + numero + " es " + factorial);
    }
    
    public static void main(String[] args) {
    
        calcularFactorialCiclos numFactorial;
        numFactorial = new calcularFactorialCiclos();
        numFactorial.inicializar();
        numFactorial.calcularFactorial();
    }
}   
                

