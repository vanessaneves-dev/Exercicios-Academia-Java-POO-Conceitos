package exercicio1;

public class Main {
    public static void main(String[] args) {


        // Criando instâncias de Livro
        Livro livro4 = new Livro("Quatro vidas de um cachorro", "W. Bruce Cameron", 2016);
        Livro livro1 = new Livro("Juntos para sempre", "W. Bruce Cameron", 2018);
        Livro livro3 = new Livro("A caminho de casa", "W. Bruce Cameron", 2019);
        Livro livro2 = new Livro("A promessa de um amigo", "W. Bruce Cameron", 2020);

        // Criando instância de Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);

        System.out.println("************************************ \nBem-vindo  Biblioteca UFN-Atos \nNossos livros disponíveis são:\n");

        // Listagem de todos os livros na biblioteca
        biblioteca.listarLivros();
    }
}