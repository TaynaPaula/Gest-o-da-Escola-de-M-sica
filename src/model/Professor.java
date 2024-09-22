package model;

public class Professor extends Pessoa implements Identificavel{

    private String registroFuncionario;

     //construtor
     public Professor(String nome,int idade, String registroFuncionario) {
        super(nome, idade); 
              this.registroFuncionario = registroFuncionario;
    }
    @Override
    public String atividade() {
        return "Ministrar as aulas de música.";
    }
 
    @Override
    public String getId() {
        return registroFuncionario;
    }



}
