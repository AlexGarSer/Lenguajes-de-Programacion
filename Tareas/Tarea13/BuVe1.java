package Tarea13;
import java.util.Random;
import javax.swing.JOptionPane;
public class BuVe1{
    public static void main(String[] args) {
        int tabla[]=new int[10];
        double numero;
        Random rnd=new Random();
        int i,x=0,contador=0;
        numero= Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero a buscar en el vector aleatorio"));
            for(i=0;i<10;i++){
                    x=(int)(rnd.nextDouble()*10);
                    tabla[i]=x;
                    System.out.println(tabla[i]);
                    if(numero==x){
                            contador++;}
                    else{}
            }
                    if(contador!=0){
                        System.out.println("Veces encontradas: "+contador);
                    }
                    else{
                        System.out.println("No se encontró el numero, intentar de nuevo");
                    }
    }
}