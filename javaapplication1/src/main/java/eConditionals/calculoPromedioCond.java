/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eConditionals;

import java.util.Scanner;

public class calculoPromedioCond {
    private Scanner teclado;
    float nota1;
    float nota2;
    float nota3;
    float promedio;
    
    
    public void inicializar(){
        teclado = new Scanner(System.in);

        System.out.print("Ingresa la primera nota: ");
        nota1 = teclado.nextFloat();

        System.out.print("Ingresa la segunda nota: ");
        nota2 = teclado.nextFloat();

        System.out.print("Ingresa la tercera nota: ");
        nota3 = teclado.nextFloat();
    }
    
    public void calculoPromedio(){
        promedio = (nota1 + nota2 + nota3) / 3;
        if (promedio >3.9) {
            System.out.print("Promocionado");
        }
        else {
            if (promedio>=3.0 && promedio <=3.9) {
                System.out.println("Regular");
            } else {
                System.out.println("Reprobado");
            }
        }
    }
    public static void main(String[] args) {
    calculoPromedioCond promedio;
    promedio = new calculoPromedioCond();
    promedio.inicializar();
    promedio.calculoPromedio();
    }
}


