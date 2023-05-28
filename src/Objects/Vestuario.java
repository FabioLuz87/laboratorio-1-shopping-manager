package Objects;

public class Vestuario extends Loja{
    boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int qtdeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdeProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public String toString() {
        return "Vestuaario{" +
                " nome=" + super.getNome() +
                " tamanho="+ super.tamanhoDaLoja() +
                " gastosComSalario=" + super.gastosComSalario() +
                " quantidadeFuncionarios =" + super.getQuantidadeFuncionarios() +
                " salarioBase=" + super.getSalarioBaseFuncionario() +
                " dataFundaão" + super.getDataFundacao() +
                " endereco" + super.getEndereco() +
                " produtosImportados(true/false)=" + produtosImportados +
                '}';
    }
}
