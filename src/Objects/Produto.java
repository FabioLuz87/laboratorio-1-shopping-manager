package Objects;

public class Produto {
    private String nome;
    private float preco;
    private Data dataValidade;

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, float preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }


    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", dataValidade=" + dataValidade.toString() +
                '}';
    }

    public boolean estaVencido(Data data) {
        if (data.getAno() <= this.dataValidade.getAno()) {
            if(data.getMes() <= this.dataValidade.getMes()) {
                if (data.getDia() <= this.dataValidade.getDia())
                    return false;
                else
                    return true;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
