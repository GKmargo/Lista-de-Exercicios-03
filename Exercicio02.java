public class Exercicio02{
    public static void executar(){
        Carro carro = new Carro();

        carro.km = Prompt.lerDecimal("Digite a distancia percorrida pelo seu carro:");
        carro.litros = Prompt.lerDecimal("Digite a quantidade de litros de gasolina gastos com a viagem");

        Prompt.imprimir("O consumo médio do seu veículo: " + carro.consumoMedio(carro.km, carro.litros) + "km/l");
    }
}