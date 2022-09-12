
package arreglos;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 5 valores"));
        String [] cadena= new String [n];
        double [] cadena1= new double [n];
        int [] cadena2= new int [n];
        
        for (int i=0; i<n; i++){
            JOptionPane.showInputDialog("Teclea elemento" + (i+1));
            cadena[i]=teclado.nextLine();
            cadena2[i]= Integer.parseInt(JOptionPane.showInputDialog("Teclea entero para" +cadena[i]));
            cadena1[i]=Double.parseDouble(JOptionPane.showInputDialog("Teclea numero real para" + cadena[i]));
            
        }
        String tabla="Lista\n";
        for (int i=0; i<cadena.length; i++){
            tabla+= cadena[i]+"\n";
            
        }
        tabla+="Lista invertida\n";
        for (int i=cadena.length-1; i>=0; i--){
            tabla+=cadena[i]+"\n";
        
        }
        
        JOptionPane.showMessageDialog(null,tabla);
        
          
    }
    
}
