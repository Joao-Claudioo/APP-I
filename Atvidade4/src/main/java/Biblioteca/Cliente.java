package Biblioteca;


public class Cliente {
    private String nome;
    private int idade;
   
    
    public String getNome(){
    return nome;
    }
    public void setNome(String nome){
    this.nome = nome;
    }
    public int getIdade(){
    return idade;
    }
    public void setIdade(int idade){
    this.idade = idade;
    }
    public String verificarIdade(){
        String respostaIdade;
        if(this.idade < 18){
        respostaIdade = "Menor de Idade:";
        }else{
            respostaIdade = "Maior de Idade:";
        
        }
        return respostaIdade;
    
    }
    public String toString(){
        return "nome: " + this.nome+
                "\nIdade: " + this.idade;
    
    }
    
}