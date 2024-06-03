package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
    public double obterValorTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getSubtotal();
        }
        return total;
    }
}
