package Biblioteca;


public class Livro {
    private String nome, genero;
    private double valor;
    
    public String getNome(){
    return nome;
    }
    public void setNome(String nome){
    this.nome = nome;
    }
    public String getGenero(){
    return genero;
    }
    public void setGenero(String genero){
    this.genero = genero;
    }
     public double getValor(){
    return valor;
    }
    public void setValor(double valor){
    this.valor = valor;
    }
       String vereficarDesconto() {
        double precoFinal = 0;
        String resposta;
        if (this.valor> 80) {
            precoFinal = this.valor * 0.30;
            resposta = "Seu desconto é: " + precoFinal;           
        }else{
            resposta = "Este livro não tem desconto. ";
        }
        return resposta;
        }
           @Override
        public String toString(){
        return "Nome do Livro: " + this.nome+
                "\nFale o Gênero: " + this.genero+
                "\nValor de Desconto: " + this.valor;
    
    }
    
}