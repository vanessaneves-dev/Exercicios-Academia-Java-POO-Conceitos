package exercicio5_lista_poo_conceitos;

public class Pessoa {
    private String nome;
    private double salario;

    public Pessoa(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
