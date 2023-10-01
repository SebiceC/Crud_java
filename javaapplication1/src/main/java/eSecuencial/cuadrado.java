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
public class cuadrado {
    private Scanner teclado;
    int lado;
    
    public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese valor del lado :");
        lado=teclado.nextInt();
    }
    
    public void imprimirPerimetro() {
        int perimetro;
        perimetro=lado*4;
        System.out.println("El perímetro es:"+perimetro);
    }
    public void imprimirSuperficie() {
            int superficie;
            superficie=lado*lado;
            System.out.println("La superficie es:"+superficie);
    }
    
    public static void main(String[] ar) {
        cuadrado cuadrado1;/*declara el objeto*/
        cuadrado1=new cuadrado(); /*crea el objeto*/
        cuadrado1.inicializar();/*se llama al metodo*/
        cuadrado1.imprimirPerimetro();
        cuadrado1.imprimirSuperficie();
    }
}   