public class Exercicio14 {
    public static void executar(){
        Produto[] produtos = new Produto[40];
        double totalPrecoCusto = 0;
        double totalPrecoVenda = 0;

        for (int i = 0; i < produtos.length; i++) {
            double precoCusto = Prompt.lerDecimal("Digite o preço de custo do produto " + (i + 1) + ":");
            
            double precoVenda = Prompt.lerDecimal("Digite o preço de venda do produto " + (i + 1) + ":");
            
            // Cria um novo objeto 'Produto' e atribui o preço de custo e o preço de venda
             produtos[i] = new Produto();
             produtos[i].precoCusto = precoCusto;
             produtos[i].precoVenda = precoVenda;
             totalPrecoCusto += precoCusto;
             totalPrecoVenda += precoVenda;

            Prompt.imprimir("Produto " + (i + 1) + ": " + produtos[i].calculoLucro());
        }

        double mediaPrecoCusto = totalPrecoCusto / produtos.length;
        double mediaPrecoVenda = totalPrecoVenda / produtos.length;

        Prompt.imprimir("Média do preço de custo: " + mediaPrecoCusto);
        Prompt.imprimir("Média do preço de venda: " + mediaPrecoVenda);
    }
}
