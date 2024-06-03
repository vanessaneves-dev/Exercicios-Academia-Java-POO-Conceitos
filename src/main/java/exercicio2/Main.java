package exercicio2;
import exercicio2.Turma;


public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Aluno
        Aluno aluno1 = new Aluno("Lucas", 22, 1234);
        Aluno aluno2 = new Aluno("Maria", 20, 1235);
        Aluno aluno3 = new Aluno("João", 21, 1236);
        Aluno aluno4 = new Aluno("Ana", 23, 1237);
        Aluno aluno5 = new Aluno("Pedro", 22, 1238);

        // Criando instâncias de Turma
        Turma turma1 = new Turma("Turma A", "1A");
        Turma turma2 = new Turma("Turma B", "1B");

        // Adicionando alunos às turmas
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);
        turma1.adicionarAluno(aluno4);
        turma1.adicionarAluno(aluno5);

        turma2.adicionarAluno(aluno1);
        turma2.adicionarAluno(aluno2);
        turma2.adicionarAluno(aluno3);

        // Listagem de todos os alunos nas turmas
        System.out.println("******************************************* \nAlunos na " + turma1.getNome() + ":");
        turma1.listarAlunos();

        System.out.println("****************************************** \nAlunos na " + turma2.getNome() + ":");
        turma2.listarAlunos();
    }
}
