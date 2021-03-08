package cliente;


public class Cliente {
    public String nome;
    private int idade;
    private double renda;
    
    public String getNome() {
        return nome;
    }   
    public void setNome(String nome) {
        this.nome = nome;
    }   
    public double getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getRenda() {
        return renda;
    }
    public void setRenda(double renda) {
        this.renda = renda;
    }
    public String classificarIdade() {
        String  resposta;
        if(this.idade >= 18) {
            resposta = "Este cliente é maior de idade";
        }else{
            resposta = "Este cliente é menor de idade";
        }
    public String classificarRenda() {
        String renda;
        if(this.renda > 15000)
            salario = "Este cliente é rico";
    }else{  
}
            salario = "Este cliente não é rico";
}
    
   

