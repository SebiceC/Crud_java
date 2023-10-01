/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eCiclos;
import java.util.Scanner;
/**
 *
 * Confeccionar un programa que pida por teclado tres notas de un alumno, calcule
 * el promedio e imprima alguno de estos mensajes:
Si el promedio es >3.9 mostrar "Promocionado".
Si el promedio es >=3.0 y <=3.9 mostrar "Regular".
Si el promedio es <3.0 mostrar "Reprobado"
 */
public class calculoPromedioCiclos {
    private Scanner teclado;
    double nota;
    double promedio;
    double sumaNotas = 0.0;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        

        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            nota = teclado.nextDouble();
            sumaNotas += nota;
        }
    }
    
    public void calculoPromedio(){
        promedio = sumaNotas / 3.0;

        System.out.println("El promedio del alumno es: " + promedio);

        if (promedio > 3.9) {
            System.out.println("Promocionado");
        } else if (promedio >= 3.0 && promedio <= 3.9) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
        }
    }
    public static void main(String[] args) {
       calculoPromedioCiclos promedioNotas;
       promedioNotas = new calculoPromedioCiclos();
       promedioNotas.inicializar();
       promedioNotas.calculoPromedio();
    }
}
