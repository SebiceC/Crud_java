/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eCiclos;
import java.util.Scanner;
/**
 *
 * Crea un programa que calcule la suma de una serie dada por el usuario. La serie es: 1 - 1/2 + 1/3 - 1/4 + 1/5 - ... (alternando entre sumar y restar fracciones)
 */
public class sumaSerieNumerosCiclos {
    private Scanner teclado;
    int serieNumeros;
    
    
    public void incializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese la serie de numeros: ");
        serieNumeros = teclado.nextInt();
    }
    
    public void sumatoriaSerieNumeros(){
        double suma = 0.0;
        boolean sumar = true;

        for (int i = 1; i <= serieNumeros; i++) {
            double termino = 1.0 / i;

            if (sumar) {
                suma += termino;
            } else {
                suma -= termino;
            }

            sumar = !sumar; // Alternar entre sumar y restar en cada iteración
        }

        System.out.println("La suma de la serie es: " + suma);
    }
    public static void main(String[] args) {
        sumaSerieNumerosCiclos serieNum;
        serieNum = new sumaSerieNumerosCiclos();
        serieNum.incializar();
        serieNum.sumatoriaSerieNumeros();
    }
}
