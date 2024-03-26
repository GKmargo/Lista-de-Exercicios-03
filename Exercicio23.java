public class Exercicio23 {
    public static void executar(){
        PesoIdeal peso = new PesoIdeal();

        String nome = Prompt.lerLinha("Digite seu nome:");

        peso.sexo = Prompt.lerCaractere("Digite M para masculino ou F para feminino:");
        peso.altura = Prompt.lerDecimal("Digite sua altura em metros: ");
        peso.idade = Prompt.lerInteiro("Digite a sua idade:");

        Prompt.imprimir("O seu peso ideal: " + peso.calculoPeso());
    }
}
