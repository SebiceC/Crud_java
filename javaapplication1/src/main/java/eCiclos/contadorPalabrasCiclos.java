/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eCiclos;
import java.util.Scanner;
/**
 *
 * Escribe un programa que cuente la cantidad de palabras en una frase ingresada por el usuario. Considera que las palabras están separadas por espacios.

 */
public class contadorPalabrasCiclos {
    private Scanner teclado;
    String frase;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese la frase a calcular: ");
        frase = teclado.nextLine();
    }
    
    public void contadorPalabras(){
        int cantidadPalabras = 0;
        boolean palabraComenzada = false;

        // Recorremos la frase caracter por caracter
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            // Si el caracter actual no es un espacio y no hemos comenzado una palabra,
            // incrementamos el contador de palabras y marcamos que hemos comenzado una palabra.
            if (caracter != ' ' && !palabraComenzada) {
                cantidadPalabras++;
                palabraComenzada = true;
            }

            // Si el caracter actual es un espacio, marcamos que no estamos en una palabra.
            if (caracter == ' ') {
                palabraComenzada = false;
            }
        }

        System.out.println("La frase ingresada contiene " + cantidadPalabras + " palabra(s).");
    }
    
    
    public static void main(String[] args) {
        contadorPalabrasCiclos numeroPalabras;
        numeroPalabras = new contadorPalabrasCiclos();
        numeroPalabras.inicializar();
        numeroPalabras.contadorPalabras();
    }
}
    