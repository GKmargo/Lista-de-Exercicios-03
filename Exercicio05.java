public class Exercicio05{
    public static void executar(){
        MamaoAcucar produtos = new MamaoAcucar();

        produtos.vlrCompra = Prompt.lerDecimal("Digite o valor da sua compra:");

        double valorPrestacao = produtos.prestacoes(produtos.vlrCompra);

        Prompt.imprimir("O valor das Prestações em 5 vezes sem juros: " + valorPrestacao);
    }
}