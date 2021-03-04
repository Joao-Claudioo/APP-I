package NumeroMaior;

import java.util.Scanner;

public class IgualDiferente {
     public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
              
  System.out.println("Escreva o valor de A: ");
  double a = ler.nextDouble();
  
  System.out.println("Escreva o valor de B: ");
  double b = ler.nextDouble();
 
  if (a == b) {
      System.out.println("Némeros Iguais");
  }else{
      System.out.println("Números Diferentes");
  }
      
     }
}
  
  
    

