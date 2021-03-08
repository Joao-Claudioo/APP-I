package cliente;

import java.util.Scanner;

public class ProgramaCliente {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Cliente c1 = new Cliente();
        
        System.out.println("Digite o nome do cliente: ");
        c1.setNome(ler.nextLine());
        
        System.out.println("Digite a idade: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println("Digite a renda: ");
        c1.setRenda(ler.nextDouble());
        
         System.out.println(c1.classificarRenda());
         System.out.println(c1.classificarIdade());
         System.out.println("---------------------------");
         System.out.println("Classificando od dados do cliente");
         System.out.println(c1.getNome());
         System.out.println(c1.getIdade());
         System.out.println(c1.getRenda());
                                  
        
    }
    
}
