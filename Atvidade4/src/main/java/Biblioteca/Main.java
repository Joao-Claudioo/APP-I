package Biblioteca;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Livro l1 = new Livro();
        Cliente c1 = new Cliente();
        
        System.out.println("Bora fazer o cadastro, zé! ");
        System.out.println("Digita seu nome então: ");
        c1.setNome(ler.nextLine());
        System.out.println("Digite sua idade: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println(c1);
        
        System.out.println("Agora está na hora de ver que livro tu quer manin ! ");
        System.out.println("Digite o nome do livro: ");
        l1.setNome(ler.nextLine());
        System.out.println("Digite o genero do livro que você deseja: ");
        l1.setGenero(ler.nextLine());
        System.out.println("Digite o valor do livro: ");
        l1.setValor(ler.nextDouble());
        
        System.out.println(l1);
        System.out.println(l1.vereficarDesconto());
       
                
    }
    
}
