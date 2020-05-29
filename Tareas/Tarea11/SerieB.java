package Tarea11;

import java.util.Scanner;

public class SerieB {

    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args){
       int n;
       System.out.println("Ingrese la cantidad de terminos a imprimir de la serie: ");
       n = lector.nextInt();
    int x = 1;
       for(int i = 0; i < n; i++){
        if((i + 1) % 2 == 0){
            for(int j = 0; j < x; j++){
                System.out.print("" + (i + 1) + ", ");
            }
        }
        else{
            System.out.print("" + ((i + 1) * -1) + ", ");
            x++;
            }
        }
    }


}