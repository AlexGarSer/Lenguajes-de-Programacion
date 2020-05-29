package Tarea13;

public class BuVe {
    //un arreglo de 10 números enteros desordenados

    public static void main(String[] args){
        String arreglo = "14792140252";
        String bu=("4");
        int cont=0;
        for (int i = 0; i < arreglo.length(); i++) {
            if(arreglo.charAt(i) == bu.charAt(0) ){ cont ++;
            }
        }
        if (cont != 0){
            System.out.println("El caracter "+bu.charAt(0)+ " se repite " + cont + " veces");
        }

        else{
            System.out.println("El caracter no se encuentra en este texto");
        }

    }
}