package exercicio3_lista_poo_conceitos;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubtotal() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Valor Unit: R$ %.2f, Qtd: %d, Sub-total: R$ %.2f",
                nome, preco, quantidade, getSubtotal());
    }
}
