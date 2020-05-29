package Tarea15;

import java.util.*;

public class SuMa{
     public static void main (String[]Args){
         
        Scanner dato = new Scanner (System.in);

                    System.out.print("Escribe la cantidad de filas de la 1º Matriz:[?]");
                    int a1= dato.nextInt();
        
                    System.out.print("Escribe la cantidad de columnas de la 1º Matriz:["+a1+"]");
                    int a2= dato.nextInt();        

                    System.out.print("Escribe la cantidad de filas de la 2º Matriz:[?]");
                    int b1= dato.nextInt();
        
                    System.out.print("Escribe la cantidad de columnas de la 2º Matriz:["+b1+"]");
                    int b2= dato.nextInt();

                    if (a1 != b1 | a2 != b2) {  System.out.println("La suma de matrices no se puede realizar ya que las matrices son de orden distinto");
                    }
                    else{

                    int matriza[][] = new int [a1][a2];
                    int matrizb[][] = new int [b1][b2];
                    int matrizc[][] = new int [a1][b2];
                    int i, j;
        
                    System.out.println("Datos de la Matriz A :");
         
                    for (i=0; i<=(a1-1); i++){
                        for (j=0; j<=(a2-1); j++){
                            System.out.print("Escribir valor " + i + " , " + j + " : ");
                            matriza [i][j]= dato.nextInt();
                        }
                    }
            
                    System.out.println("Datos de la Matriz B :");
            
                    for (i=0; i<=(b1-1); i++){
                        for (j=0; j<=(b2-1); j++){
                            System.out.print("Escribir valor " + i + " , " + j + " : ");
                            matrizb [i][j]= dato.nextInt();
                        }
                    }

                    for (i=0; i<=(a1-1); i++){
                        for (j=0; j<=(b2-1); j++){
                            matrizc [i][j]= matriza[i][j]+matrizb[i][j];
                        }
                    }                     

                    System.out.println("Matriz resultante de la suma :");
                    for (i=0;i<=(a1-1);i++){
                            for (j=0;j<=(b1-1);j++) {
                                System.out.print(matrizc[i][j] + " ");
                            }
                            System.out.println("");
                            
                    }                    
        }
    }
} 