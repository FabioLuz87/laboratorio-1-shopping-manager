package Objects;

public class Cosmetico extends Loja{
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int qtdeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdeProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }


    public String toString() {
        return "Cosmetico{" +
                " nome=" + super.getNome() +
                " tamanho="+ super.tamanhoDaLoja() +
                " gastosComSalario=" + super.gastosComSalario() +
                " quantidadeFuncionarios =" + super.getQuantidadeFuncionarios() +
                " salarioBase=" + super.getSalarioBaseFuncionario() +
                " dataFundaão" + super.getDataFundacao() +
                " endereco" + super.getEndereco() +
                " taxaComercializacao=" + taxaComercializacao +
                '}';
    }
}
