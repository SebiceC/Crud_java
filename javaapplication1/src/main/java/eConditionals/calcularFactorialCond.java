/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eConditionals;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */


public class calcularFactorialCond {
    private Scanner teclado;
    int numero;
    public void inicializar (){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        numero = teclado.nextInt();
    }
    
    public void calculoFactorial(){
       
        if (numero == 0 || numero == 1) {
            System.out.println("El factorial de " + numero + " es: " + 1);
        } else {
            long factorial = 1;
            for (int i = 2; i <= numero; i++) {
            factorial *= i;
            System.out.println("El factorial de " + numero + " es: " + factorial);
            }
        }
        
    }
    public static void main(String[] args){
        calcularFactorialCond factorial;
        factorial = new calcularFactorialCond();
        factorial.inicializar();
        factorial.calculoFactorial();
    }
}
