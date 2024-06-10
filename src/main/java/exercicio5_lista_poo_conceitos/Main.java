package exercicio5_lista_poo_conceitos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebendo dados
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o salário da pessoa: ");
        double salario = scanner.nextDouble();

        // Criando instâncias de Pessoa e ImpostoDeRenda
        Pessoa pessoa = new Pessoa(nome, salario);
        ImpostoDeRenda impostoDeRenda = new ImpostoDeRenda(pessoa);
        impostoDeRenda.imprimir();

        // Deixando exemplos
        Pessoa pessoa2 = new Pessoa("Larissa", 5400.00);
        ImpostoDeRenda impostoDeRenda2 = new ImpostoDeRenda(pessoa2);
        impostoDeRenda2.imprimir();

        Pessoa pessoa3 = new Pessoa("Rodrigo", 19000.00);
        ImpostoDeRenda impostoDeRenda3 = new ImpostoDeRenda(pessoa3);
        impostoDeRenda3.imprimir();

        scanner.close();
    }
}