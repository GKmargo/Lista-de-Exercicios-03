public class Exercicio06{
    public static void executar(){
        Produto vlrProduto = new Produto();

        vlrProduto.valor = Prompt.lerDecimal("Digite o valor da venda:");
        vlrProduto.valorPorcentagem = Prompt.lerDecimal("Digite o acrecimo porcentual:");

        double valorFinal = vlrProduto.acrescimo(vlrProduto.valor, vlrProduto.valorPorcentagem);
        Prompt.imprimir("O valor final com o acrescimo do porcentual:" + valorFinal);
    }
}