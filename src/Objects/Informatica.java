package Objects;

public class Informatica extends Loja{
  private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int qtdeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdeProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public String toString() {
        return "Informatica{" +
                " nome=" + super.getNome() +
                " tamanho="+ super.tamanhoDaLoja() +
                " gastosComSalario=" + super.gastosComSalario() +
                " quantidadeFuncionarios =" + super.getQuantidadeFuncionarios() +
                " salarioBase=" + super.getSalarioBaseFuncionario() +
                " dataFundaão" + super.getDataFundacao() +
                " endereco" + super.getEndereco() +
                " seguroEletronicos=" + seguroEletronicos +
                '}';
    }
}
