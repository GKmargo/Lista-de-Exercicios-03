public class Exercicio22 {
    public static void executar(){
        ContaLuz conta = new ContaLuz();

        conta.tipoCliente = Prompt.lerInteiro("Digite  1 se a conta é Residencial, 2 se é Comercial ou  3 se é Industrial:");
        conta.consumo = Prompt.lerDecimal("Digite o total consumido de KW/h: "); 

        double valor = conta.calcularValor();

        Prompt.imprimir("Valor a se pagar: " + valor);
        
    }
}
