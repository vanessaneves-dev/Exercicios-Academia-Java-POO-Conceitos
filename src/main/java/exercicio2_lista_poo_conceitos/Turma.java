package exercicio2_lista_poo_conceitos;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private String codigo;
    private List<Aluno> turma;

    public Turma(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.turma = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        turma.add(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : turma) {
            System.out.println(aluno);
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

