/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eCiclos;
import java.util.Scanner;
/**
 *Escribe un programa que solicite al usuario un número y determine si es un número primo o no.
 * 
 */
public class numeroPrimoCiclos {
    private Scanner teclado;
    int numero;
    
    public void inicializar(){
        teclado=new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        numero = teclado.nextInt();
    }
    
    public void verificarSiEsPrimo() {
        boolean esPrimo = true;
        
        if (numero <= 1) {
            esPrimo = false;
        } else {
            // Comprobar si el número es primo
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }
    
    public static void main (String[] args) {
        numeroPrimoCiclos numPrimo;/*declara el objeto*/
        numPrimo = new numeroPrimoCiclos(); /*crea el objeto*/
        numPrimo.inicializar();/*se llama al metodo*/
        numPrimo.verificarSiEsPrimo();
        
    }
}
    
 