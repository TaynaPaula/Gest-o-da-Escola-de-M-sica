package model;


public abstract class Pessoa {
   
    public String nome;
    public int idade;

    public  Pessoa(String nome, int idade){  
        this.nome = nome;
        this.idade = idade;
    }
    public abstract String atividade(); {
      
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }


}
