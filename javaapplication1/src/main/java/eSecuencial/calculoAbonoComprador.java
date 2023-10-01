/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eSecuencial;

import java.util.Scanner;
/**
 *
 * @author ADMIN
 */

/* Se debe desarrollar un programa que pida el ingreso del 
    precio de un artículo y la cantidad que lleva el cliente. Mostrar 
    lo que debe abonar el comprador.*/

public class calculoAbonoComprador {
    private Scanner teclado;
    double precioArticulo;
    int cantidadComprada;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el precio del artículo: ");
        precioArticulo = teclado.nextDouble();
        System.out.print("Ingrese la cantidad comprada: ");
        cantidadComprada = teclado.nextInt();
    }
    
    public void calculoCliente(){
        double totalPagar = precioArticulo * cantidadComprada;
        System.out.println("El total a pagar es: " + totalPagar);
    }
    
    public static void main(String[] ar) {
        calculoAbonoComprador calculo;
        calculo = new calculoAbonoComprador();
        calculo.inicializar();
        calculo.calculoCliente();
    }
}


