package NumeroMaior;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ParOuImpar {
   
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um númeuro inteiro para saber se é Par ou Ímpar"));
        
        int resultado = num%2;
        
        if(resultado==0) {
            JOptionPane.showMessageDialog(null, "O número digitado é Par");
        }else{
            JOptionPane.showMessageDialog(null, "O número digitado é Ímpar");
        }
    }
            
    
}
