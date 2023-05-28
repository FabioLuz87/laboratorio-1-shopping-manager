package Objects;

public class Bijuteria extends Loja{
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int qtdeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdeProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }


    public String toString() {
        return "Bijuteria{" +
                " nome=" + super.getNome() +
                " tamanho="+ super.tamanhoDaLoja() +
                " gastosComSalario=" + super.gastosComSalario() +
                " quantidadeFuncionarios =" + super.getQuantidadeFuncionarios() +
                " salarioBase=" + super.getSalarioBaseFuncionario() +
                " dataFundaão" + super.getDataFundacao() +
                " endereco" + super.getEndereco() +
                " metaVendas=" + metaVendas +
                '}';
    }
}
