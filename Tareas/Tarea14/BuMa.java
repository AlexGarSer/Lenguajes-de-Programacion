package Tarea14;
import javax.swing.JOptionPane;
public class BuMa {    
    public static void main(String[] args) {
        int matriz[][]= {{1,3,5,4,3},{3,7,4,7,2},{5,7,9,1,0},{2,5,9,3,5},{3,6,3,7,9}};
        int contador=0;
        int busq = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero a buscar en la matriz:"));
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(matriz[i][j]);
                if(busq==matriz[i][j]){
                    contador++;
                }
                else{
                }
            }
            System.out.println("");
        }   
        System.out.println("veces encontradas:"+contador);
    }
}