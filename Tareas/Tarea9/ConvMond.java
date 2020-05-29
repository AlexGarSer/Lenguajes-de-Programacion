package Tarea9;

import javax.swing.JOptionPane;

public class ConvMond{

    public static void main(String[] arg) {
    // Opciones del menu
        String[] option = {"Cerrar","D\u00f3lar","Euro","Yen(Japon\u00e9s) ","DolarHK"};
    // Ventana del menu
        int Dato1 = JOptionPane.showOptionDialog(null, "Eliga la moneda a la cual convertiras: ", "Menu",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
    // Mensaje para comprobar que el menu salio bien
    // JOptionPane.showMessageDialog(null,"Boton seleccionado: "+ Dato1);
    //Entrada de datos
        String ent = JOptionPane.showInputDialog("Ingresa la cantidad de pesos mexianos que va convertir: $");
        float Mond = Float.parseFloat(ent);
    // Deciciones
        switch(Dato1){
            case 1:{String val = JOptionPane.showInputDialog("Ingresa el valor actual de 1 dolar en pesos mexicanos: $");
                    double conv = Mond / Double.parseDouble(val); 
                    JOptionPane.showMessageDialog(null,"La cantidad de: $"+ Mond +" pesos mexicanos en dolares serian: "+ conv +".");
                    }             
                break;
            case 2:{String val = JOptionPane.showInputDialog("Ingresa el valor actual de 1 euro en pesos mexicanos: $");
                    double conv = Mond / Double.parseDouble(val); 
                    JOptionPane.showMessageDialog(null,"La cantidad de: $"+ Mond +" pesos mexicanos en euros serian: "+ conv +".");
                    }             
                break;
            case 3:{String val = JOptionPane.showInputDialog("Ingresa el valor actual de 1 yen(japones) en pesos mexicanos: $");
                    double conv = Mond / Double.parseDouble(val); 
                    JOptionPane.showMessageDialog(null,"La cantidad de: $"+ Mond +" pesos mexicanos en yens serian: "+ conv +".");
                    }             
                break;
            case 4:{String val = JOptionPane.showInputDialog("Ingresa el valor actual de 1 dolar de hong Kong en pesos mexicanos: $");
                    double conv = Mond / Double.parseDouble(val); 
                    JOptionPane.showMessageDialog(null,"La cantidad de: $"+ Mond +" pesos mexicanos en dolaresHK serian: "+ conv +".");
                    }             
                break;        
            default:
                break;
        }                    
    }
}