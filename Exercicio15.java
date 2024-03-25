public class Exercicio15 {
    public static void executar(){
        Veiculo veiculo = new Veiculo();
        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            veiculo.combustivel = Prompt.lerLinha("Informe o tipo de combustível (álcool, gasolina, diesel) ou digite '0' para encerrar: ");
            
            if (veiculo.combustivel.equals("0")) {
                break;
            }

            veiculo.valor = Prompt.lerDecimal("Informe o valor do veículo: ");
            if (veiculo.valor == 0.0) {
                break;
            }

            double desconto = veiculo.calcularDesconto();
            double valorAPagar = veiculo.valorComDesconto();

            Prompt.imprimir("Desconto: R$" + desconto);
            Prompt.imprimir("Valor a ser pago: R$" + valorAPagar);

            totalDesconto += desconto;
            totalPago += valorAPagar;
        }

        Prompt.imprimir("\nTotal de desconto dado pela concessionária: R$" + totalDesconto);
        Prompt.imprimir("Total pago pelos clientes: R$" + totalPago);
    }
}
