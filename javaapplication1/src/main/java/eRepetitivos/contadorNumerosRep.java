/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eRepetitivos;

import java.util.Scanner;

public class contadorNumerosRep {
    private Scanner teclado;
    int valor;

    // Constructor para inicializar el valor ingresado
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese un valor positivo: ");
        valor = teclado.nextInt();
    }

    // Método para mostrar los números desde 1 hasta el valor ingresado
    public void contadorNumeros() {
        if (valor <= 0) {
            System.out.println("Por favor, ingrese un valor positivo.");
        } else {
            for (int i = 1; i <= valor; i++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Imprimir un salto de línea al final
        }
    }

    public static void main(String[] args) {
        contadorNumerosRep contador;
        contador = new contadorNumerosRep();
        contador.inicializar();
        contador.contadorNumeros();
    }
}
