/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eConditionals;

import java.util.Scanner;

public class contadorPalabrasCond {
    private Scanner teclado;
    String frase;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        frase = teclado.nextLine();
    }
    
    public void contadorPalabras(){
        String[] palabras = frase.split(" ");
            int contador = 0;

            for (String palabra : palabras) {
                if (!palabra.isEmpty()) {
                    contador++;
                }
            }
        System.out.println("La cantidad de palabras que tiene la frase son: "+contador);
        }
    
    public static void main(String[] args) {
        contadorPalabrasCond numPalabras;
        numPalabras = new contadorPalabrasCond();
        numPalabras.inicializar();
        numPalabras.contadorPalabras();
    }
}
    