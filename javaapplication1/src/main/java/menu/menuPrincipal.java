/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;
import eCiclos.*;
import eConditionals.*;
import eRepetitivos.*;
import eSecuencial.*;
import java.util.Scanner;

public class menuPrincipal {
    public static void main (String[] ar) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("ingrese la opcion: ");
        int cat = teclado.nextInt();
        switch (cat){
            case 1 -> {
                cuadrado cuadrado1;/*declara el objeto*/
                cuadrado1=new cuadrado(); /*crea el objeto*/
                cuadrado1.inicializar();/*se llama al metodo*/
                cuadrado1.imprimirPerimetro();
                cuadrado1.imprimirSuperficie();
            }
            case 2 -> {
                numeroPrimoCiclos numPrimo;
                numPrimo = new numeroPrimoCiclos();
                numPrimo.inicializar();
                numPrimo.verificarSiEsPrimo();
            }
            case 3 -> {
                secuenciaFibonacciCiclos secFibonacci;
                secFibonacci = new secuenciaFibonacciCiclos();
                secFibonacci.inicializar();
                secFibonacci.generarSecuenciaFibonacci();
                secFibonacci.resultado();
            }
            case 4 -> {
                calcularFactorialCiclos numFactorial;
                numFactorial = new calcularFactorialCiclos();
                numFactorial.inicializar();
                numFactorial.calcularFactorial();
            }
            case 5 -> {
                contadorPalabrasCiclos numeroPalabras;
                numeroPalabras = new contadorPalabrasCiclos();
                numeroPalabras.inicializar();
                numeroPalabras.contadorPalabras();
            }
            case 6 -> {
                sumaSerieNumerosCiclos serieNum;
                serieNum = new sumaSerieNumerosCiclos();
                serieNum.incializar();
                serieNum.sumatoriaSerieNumeros();
            }
            case 7 -> {
                calculoPromedioCiclos promedioNotas;
                promedioNotas = new calculoPromedioCiclos();
                promedioNotas.inicializar();
                promedioNotas.calculoPromedio();
            }
            case 8 -> {
                numeroPrimoCondicionals numeroPrimo;
                numeroPrimo = new numeroPrimoCondicionals();
                numeroPrimo.inicializar();
                numeroPrimo.calcularPrimo();
            }
            case 9 -> {
                calcularFactorialCond factorial;
                factorial = new calcularFactorialCond();
                factorial.inicializar();
                factorial.calculoFactorial();
            }
            case 10 -> {
                secuenciaFibonacciCond fibonacci;
                fibonacci = new secuenciaFibonacciCond();
                fibonacci.inicializar();
                fibonacci.generarFibonacciSecuencia();
            }
            case 11 -> {
                contadorPalabrasCond numPalabras;
                numPalabras = new contadorPalabrasCond();
                numPalabras.inicializar();
                numPalabras.contadorPalabras();
            }
            case 12 -> {
                sumaSerieNumerosCond suma;
                suma = new sumaSerieNumerosCond();
                suma.inicializar();
                suma.calcularSerie();
            }
            case 13 -> {
                calculoPromedioCond promedio;
                promedio = new calculoPromedioCond();
                promedio.inicializar();
                promedio.calculoPromedio();
            }
            case 14 -> {
                calcularSueldoCond sueldo;
                sueldo = new calcularSueldoCond();
                sueldo.inicializar();
                sueldo.calcularSueldo();
            }
            case 15 -> {
                contadorNumerosRep contador;
                contador = new contadorNumerosRep();
                contador.inicializar();
                contador.contadorNumeros();
            }
            case 16 -> {
                calcularPerimetroCuadrado perimetro;
                perimetro = new calcularPerimetroCuadrado();
                perimetro.inicializar();
                perimetro.calcularPerimetro();
            }
            case 17 -> {
                calcularSumaMultiplicacion calculo;
                calculo = new calcularSumaMultiplicacion();
                calculo.inicializar();
                calculo.calcularOperacion();
            }
            case 18 -> {
                calcularSumaPromedio calcular;
                calcular = new calcularSumaPromedio();
                calcular.inicializar();
                calcular.operaciones(); 
            }
            case 19 -> {
                calculoAbonoComprador calculo;
                calculo = new calculoAbonoComprador();
                calculo.inicializar();
                calculo.calculoCliente();
            }
            case 20 -> {
                calculoSueldoMensual calculoSueldo;
                calculoSueldo = new calculoSueldoMensual();
                calculoSueldo.inicializar();
                calculoSueldo.calculosueldoCliente();
            }
        }
    }
}



