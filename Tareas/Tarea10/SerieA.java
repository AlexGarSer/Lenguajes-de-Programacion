package Tarea10;

import java.util.Scanner;

public class SerieA{

    private static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        double n, resultado = 0;
        System.out.println("Ingrese la cantidad de terminos a imprimir de la serie: ");
        n = lector.nextInt();
        for (int i=0;i<=n;i++) {
            resultado = Math.pow(i,(2*i)-1);
            System.out.println(resultado+", ");
        }     
    }    
}