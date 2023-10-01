/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eConditionals;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class numeroPrimoCondicionals {
    private Scanner teclado;
    int numero;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        numero = teclado.nextInt();
    }
    
    public void calcularPrimo(){
        boolean esPrimo = true;
        
        if (numero <= 1) {
            esPrimo = false;
        }
        if (numero <= 3) {
            esPrimo = true;
        }

        if (numero % 2 == 0 || numero % 3 == 0) {
            esPrimo = false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                esPrimo = false;
            }
        }
        esPrimo = true;
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }
    public static void main(String[] args) {
        
        numeroPrimoCondicionals numeroPrimo;
        numeroPrimo = new numeroPrimoCondicionals();
        numeroPrimo.inicializar();
        numeroPrimo.calcularPrimo();
    }
}
