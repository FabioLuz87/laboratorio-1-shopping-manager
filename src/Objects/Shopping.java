package Objects;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int qtdeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[qtdeLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public boolean insereLoja(Loja loja) {
        for(int i = 0; i < this.lojas.length; i++)
            if(this.lojas[i] == null){
                this.lojas[i] = loja;
                return true;
            }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] != null && this.lojas[i].getNome() == nomeLoja) {
                this.lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int qtde = 0;

        String nomeParaComparar = textoNormalizado(tipoLoja.toLowerCase());

        switch (nomeParaComparar){
            case "cosmetico":
                for (int i = 0; i < this.lojas.length; i++)
                    if (this.lojas[i] instanceof  Cosmetico) {
                        qtde++;
                    }
                return qtde;
            case "bijuteria":
                for (int i = 0; i < this.lojas.length; i++)
                    if (this.lojas[i] instanceof  Bijuteria) {
                        qtde++;
                    }
                return qtde;
            case "informatica":
                for (int i = 0; i < this.lojas.length; i++)
                    if (this.lojas[i] instanceof  Informatica) {
                        qtde++;
                    }
                return qtde;
            case "alimentacao":
                for (int i = 0; i < this.lojas.length; i++)
                    if (this.lojas[i] instanceof  Alimentacao) {
                        qtde++;
                    }
                return qtde;
            default:
                return -1;
        }
    }

    public Informatica lojaSeguroMaisCaro() {
        for (int i = 0; i < this.lojas.length; i++)
            if (this.lojas[i] instanceof  Informatica) {
                return (Informatica) this.lojas[i];
            }

        return null;
    }

    public static String textoNormalizado(String str) {
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }
}
