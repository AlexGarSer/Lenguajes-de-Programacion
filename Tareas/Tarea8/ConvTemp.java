package Tarea8;

import javax.swing.JOptionPane;

public class ConvTemp{

    public static void main(String[] arg) {
    // Opciones del menu
        String[] option = { "Cerrar", "Cº --> Fº", "Fº --> Cº" };
    // Ventana del menu
        int Dato2 = JOptionPane.showOptionDialog(null, "Eliga un tipo de operacion a realizar: ", "Menu",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
    // Mensaje para comprobar que el menu salio bien
    // JOptionPane.showMessageDialog(null,"Boton seleccionado: "+ Dato1);
    //Entrada de datos
        String ent = JOptionPane.showInputDialog("Ingresa la temperatura");
        float Dato1 = Float.parseFloat(ent);
        
        if (Dato2==1){float res1 = (float) (Dato1 * (1.8) + 32);
                        JOptionPane.showMessageDialog(null, "La temperatura seria de: "+ res1 + "ºF");}
            else {float res2 = (float) ((Dato1 - 32) * (0.55));
                    JOptionPane.showMessageDialog(null, "La temperatura seria de: "+ res2 + "ºC");}
    }
}