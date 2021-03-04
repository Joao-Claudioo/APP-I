package NumeroMaior;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PositivoNegativo {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
         int numero;
        System.out.println("Informe um número");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
 
        if (numero >= 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
 
    }
 
}