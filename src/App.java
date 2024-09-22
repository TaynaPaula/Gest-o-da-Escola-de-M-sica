import model.Aluno;
import model.Pessoa;
import model.Funcionario;
import model.Professor;
import model.Identificavel;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        //Lista Alunos
        pessoas.add(new Aluno("Levy Fernandes de Paula", 17, "M007"));
        pessoas.add(new Aluno("Larissa Oliveira ", 15, "M008"));
        pessoas.add(new Aluno("José Antônio Chagas ", 16, "M013"));

        //Lista Profesores
        pessoas.add(new Professor("Clarêncio Alberto dos Santos", 45, "P015"));
        pessoas.add(new Professor("Lindonéia Pereira de Paiva", 33, "P015"));

        //Lista Funcionário
        pessoas.add(new Funcionario("Maria Firmina de Jesus", 30, "F043"));
        pessoas.add(new Funcionario("Lima Barreto da Silva", 41, "F010"));

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.nome);
            System.out.println("Idade: " + pessoa.idade);
            System.out.println("Identificador: " + ((Identificavel) pessoa).getId());
            System.out.println("Atividade: " + pessoa.atividade());
            System.out.println();
        }
    }
}
