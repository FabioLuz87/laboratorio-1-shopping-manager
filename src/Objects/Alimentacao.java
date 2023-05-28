package Objects;

public class Alimentacao extends Loja{
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int qtdeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdeProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public String toString() {
        return "Alimentacao{" +
                " nome=" + super.getNome() +
                " tamanho=" + super.tamanhoDaLoja() +
                " gastosComSalario=" + super.gastosComSalario() +
                " quantidadeFuncionarios =" + super.getQuantidadeFuncionarios() +
                " salarioBase=" + super.getSalarioBaseFuncionario() +
                " dataFundaão" + super.getDataFundacao() +
                " endereco" + super.getEndereco() +
                " dataAlvara=" + dataAlvara +
                '}';
    }
}
