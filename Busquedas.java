
import javax.swing.JOptionPane;

/* Búsqueda Secuencial */

public class Busquedas {

    public static void main(String[] args) {
        int arreglo[] = {4, 1, 5, 2, 3};
        int dato;
        boolean band= false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un número a buscar: "));
        // Búsqueda secuencial
        int i=0;
        while(i<5 && band == false) {
            if(arreglo[i] == dato) {
                band = true;
            }
            i++;
        }
        if(band == false) {
            JOptionPane.showMessageDialog(null, "El número no se encuentra en el arreglo");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número se encuentra en la posición: "+(i-1));
        }
    }
}