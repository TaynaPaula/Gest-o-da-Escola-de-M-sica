package model;


public class Aluno extends Pessoa implements Identificavel {

    private String matricula;
     //construtor
     public Aluno(String nome,int idade,String matricula) {
        super(nome, idade); 
        this.matricula = matricula;
        
    }
    
    @Override
    public String atividade() {
        return "Frequentar as aulas e praticar os instrumentos ministrados.";
    }

    @Override
    public String getId() {
        return matricula;
    }


}
