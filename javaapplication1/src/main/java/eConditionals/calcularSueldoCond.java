/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eConditionals;

import java.util.Scanner;

public class calcularSueldoCond {
    private Scanner teclado;
    double sueldo;
    int antiguedad;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el sueldo del operario: ");
        sueldo = teclado.nextDouble();
        System.out.print("Ingrese los años de antigüedad del operario: ");
        antiguedad = teclado.nextInt();
    }

    public void calcularSueldo() {
        if (sueldo < 1000000 && antiguedad >= 10) {
            sueldo *= 1.10; // Aumento del 10%
        } else if (sueldo >= 1000000 && sueldo < 2000000 && antiguedad >= 10) {
            sueldo *= 1.03; // Aumento del 3%
        } else if (sueldo >= 1000000 && sueldo < 2000000 && antiguedad < 10) {
            sueldo *= 1.05; // Aumento del 5%
        }

        System.out.println("Sueldo a pagar: " + sueldo);
    }

    public static void main(String[] args) {
        calcularSueldoCond sueldo;
        sueldo = new calcularSueldoCond();
        sueldo.inicializar();
        sueldo.calcularSueldo();
    }
}
