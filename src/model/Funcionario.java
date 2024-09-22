package model;


public class Funcionario extends Pessoa implements Identificavel{
    private String numeroCracha;

     //construtor
     public Funcionario(String nome,int idade, String numeroCracha) {
        super(nome, idade); 
           this.numeroCracha = numeroCracha;
    }
    @Override
    public String atividade() {
        return "Realizar as tarefas administrativas da escola.";
    }
 
    @Override
    public String getId() {
        return numeroCracha;
    }


}
