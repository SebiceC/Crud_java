/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eConditionals;

import java.util.Scanner;

public class sumaSerieNumerosCond {
    private Scanner teclado;
    int n;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el número de términos de la serie: ");
        n = teclado.nextInt();
    }
    
    public void calcularSerie(){
        double suma = 0.0;
        int denominador = 1;
        boolean sumar = true;

        for (int i = 0; i < n; i++) {
            if (sumar) {
                suma += 1.0 / denominador;
            } else {
                suma -= 1.0 / denominador;
            }

            denominador++;
            sumar = !sumar; // Alternar entre sumar y restar en cada iteración
        }
        
        System.out.println("El resultado de la serie es: " + sumar);
    }
    
    public static void main(String[] args) {
        sumaSerieNumerosCond suma;
        suma = new sumaSerieNumerosCond();
        suma.inicializar();
        suma.calcularSerie();
    }
}

