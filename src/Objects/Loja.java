package Objects;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private float salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int qtdeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[qtdeProdutos];
    }


    public Loja(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, int qtdeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.estoqueProdutos = new Produto[qtdeProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int qtdeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[qtdeProdutos];
    }


    public Loja(String nome, int quantidadeFuncionarios, int qtdeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.estoqueProdutos = new Produto[qtdeProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public float getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(float salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                ", endereco=" + endereco.toString() +
                ", dataFundacao=" + dataFundacao.toString() +
                ", quantidade de estoque=" + estoqueProdutos.length +
                " unidades}";
    }

    public float gastosComSalario() {
        if(salarioBaseFuncionario != -1) {
            return salarioBaseFuncionario * quantidadeFuncionarios;
        }
        else {
            return -1f;
        }
    }

    public char tamanhoDaLoja() {

        if (quantidadeFuncionarios <= 10)
            return 'P';

        if (quantidadeFuncionarios > 10 && quantidadeFuncionarios <= 30)
            return 'M';

        return 'G';

    }

    public void imprimeProdutos() {
        for(int i = 0; i < estoqueProdutos.length; i++)
            if(estoqueProdutos[i] != null)
                System.out.println(estoqueProdutos[i].toString());
    }

    public boolean insereProduto(Produto produto) {
        for(int i = 0; i < estoqueProdutos.length; i++)
            if(estoqueProdutos[i] == null){
                estoqueProdutos[i] = produto;
                return true;
            }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for(int i = 0; i < estoqueProdutos.length; i++)
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome() == nomeProduto  ){
                estoqueProdutos[i] = null;
                return true;
            }
        return false;
    }
}
