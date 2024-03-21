public class Exercicio04{
    public static void executar(){
        Conversao dolarReal = new Conversao();

        dolarReal.conotacaoDolar = Prompt.lerDecimal("Digite a conotação atual do dolar:");
        dolarReal.dolar = Prompt.lerDecimal("Digite a quantidade de dinheiro que voce possui em dolares:");

        double valorReal = dolarReal.realDolar(dolarReal.dolar, dolarReal.conotacaoDolar);

        Prompt.imprimir("Seu dinheiro em reais: "  + valorReal);
    }
}