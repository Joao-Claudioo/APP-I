
package Ativi1;

import java.util.Scanner;

public class Notas {
    
    double n1, n2, n3;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main (String[] args) {
        
        String nome;
        
        System.out.println("Digite o nome da pessoa: ");
        nome = ler.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        double n1 = ler.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double n2 = ler.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double n3 = ler.nextDouble();
        
        System.out.println("O resultado da soma é? " + (n1 + n2 + n3)/3);
        
    }
}
