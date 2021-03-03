package Ativi1;

import java.util.Scanner;

public class A {
      String valor;
      String A;
      double triplo;
      double dobro;
      double metade;
      double quintaparte;
     
              
    static Scanner ler = new Scanner(System.in);
    
    public static void main (String[] args) {
        String valor;
        
        System.out.println("Digite o valor para A: ");
        valor = ler.nextLine();
        
        System.out.println("O dobro de A é: ");
           double dobro = ler.nextDouble();
           
           
        System.out.println("A metade do triplo do dobro é: ");
           double metade = ler.nextDouble();
           
        System.out.println("A metade do triplo do dobro é: ");
           double triplodobro = ler.nextDouble();
           
           
         System.out.println("A quinta parte do dobro de A é: ");
           double quintaparte = ler.nextDouble();
    }
    
}
