package exercicio5_lista_poo_conceitos;

public class ImpostoDeRenda {
    private Pessoa pessoa;

    public ImpostoDeRenda(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double calculaImposto() {
        double salario = pessoa.getSalario();
        double imposto = 0;

        if (salario > 4664.68) {
            imposto += (salario - 4664.68) * 0.275;
            salario = 4664.68;
        }
        if (salario > 3751.06) {
            imposto += (salario - 3751.06) * 0.225;
            salario = 3751.06;
        }
        if (salario > 2826.66) {
            imposto += (salario - 2826.66) * 0.15;
            salario = 2826.66;
        }
        if (salario > 2112) {
            imposto += (salario - 2112) * 0.075;
        }

        return imposto;
    }

    public void imprimir() {
        double imposto = calculaImposto();
        int faixa = FaixaDoImposto.obterFaixa(pessoa.getSalario());
        System.out.printf("%s, seu salário é R$ %.2f, sua faixa de imposto é %d e o valor do imposto de renda a " +
                        "ser pago é: R$ %.2f\n", pessoa.getNome(), pessoa.getSalario(), faixa, imposto);
    }
}
