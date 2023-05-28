import Objects.*;

public class Principal {
    public static void main(String[] args) {
        Endereco e1 = new Endereco(
                "Rua Nova",
                "Nova Cidade",
                "RS",
                "BR",
                "000-0000",
                "01",
                "S/ Complemento");

        Shopping shopping = new Shopping("Novo Shopping", e1, 20);
        boolean fechaMenu = false;

        while (!fechaMenu) {

            System.out.println("MENU DE OPÇÕES");
            System.out.println();
            System.out.println("(1) Criar uma loja");
            System.out.println();
            System.out.println("(2) Criar um produto");
            System.out.println();
            System.out.println("(3) Sair");
            System.out.println();

            int entrada = Teclado.leInt("DIGITE A OPÇÕES DESEJADA: ");

            switch (entrada) {
                case 1:
                    String nomeLoja = Teclado.leString("Digite o nome da Loja");
                    int qtdeFuncionarios = Teclado.leInt("Digite a quantidade de funcionários");
                    int qtdeProdutos = Teclado.leInt("Qual a quantidade de produtos que podem ser estocados");

                    Loja loja = new Loja(nomeLoja, qtdeFuncionarios, qtdeProdutos);
                    shopping.insereLoja(loja);
                    System.out.println("Foi Criada a loja " + loja.getNome());
                    break;
                case 2:
                    String nomeDoProduto = Teclado.leString("Digite o nome do Produto");
                    float valorDOProduto = Float.parseFloat(Teclado.leString("Digite o valor do produto:").replace(",","."));
                    int dia = Teclado.leInt("Digitem o dia do vencimento do produto");
                    int mes = Teclado.leInt("Digitem o mes do vencimento do produto");
                    int ano = Teclado.leInt("Digitem o ano do vencimento do produto");

                    Data dataVerficacao = new Data(20, 10, 2023);

                    Produto produto = new Produto("Fones", 50f, new Data(dia,mes,ano));
                    boolean estaVencido = produto.estaVencido(dataVerficacao);
                    if (estaVencido)
                        System.out.println("PRODUTO VENCIDO para "+ dataVerficacao.toString());
                    else
                        System.out.println("PRODUTO NÃO VENCIDO para "+ dataVerficacao.toString());
                    break;
                case 3:
                    System.out.println("VOCÊ SAIU");
                    fechaMenu = true;
                    break;
                default:
                    System.out.println("Opção invalida. Tente Novamente");
                    break;
            }
        }
    }
}