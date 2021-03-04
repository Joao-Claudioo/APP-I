package NumeroMaior;

import java.util.Scanner;

public class Maior {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println( "Digite n1: ");
        int n1 = ler.nextInt();
        
        System.out.println("Digite n2: ");
        int n2 = ler.nextInt();
        
        int maior;
        
        if(n1>n2) {
            maior = n1;
            System.out.println("Maior" + maior);
        }else if (n1<n2){
            maior = n2;
            System.out.println("Maior: " + maior);
        }
    }
    
}
