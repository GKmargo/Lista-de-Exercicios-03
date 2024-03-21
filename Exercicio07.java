public class Exercicio07 {
    public static void executar(){
        ImpostoCarro carroFabrica = new ImpostoCarro();

        carroFabrica.valorFabrica = Prompt.lerDecimal("Digite o valor de fábrica do carro:");

        double precoCarro = carroFabrica.carroNovo(carroFabrica.valorFabrica);

        Prompt.imprimir("Valor do carro com todos os impostos aplicados: " + precoCarro);
    }
}
