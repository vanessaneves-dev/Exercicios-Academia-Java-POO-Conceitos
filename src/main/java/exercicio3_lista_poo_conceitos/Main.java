package exercicio3_lista_poo_conceitos;

public class Main {
    public static void main(String[] args) {
        //Criando instâncias de Produto
        Produto produto1 = new Produto("Pincel Modelador", 19.90, 2);
        Produto produto2 = new Produto("Massa azul", 22.90, 1);
        Produto produto3 = new Produto("Massa natural", 22.90, 2);

        //Criando instância de Carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        //adicionando produtos ao carrinho

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        //listando os produtos do carrinho

        System.out.println( "Detalhes da sua compra");
        carrinho.listarProdutos();

        //Calculando e exibindo o valor total da compra
        double total = carrinho.obterValorTotal();
        System.out.printf( "\nValor total do seu carrinho: R$ %.2f\n", total);

    }
}
