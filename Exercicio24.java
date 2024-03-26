public class Exercicio24 {
    public static void executar(){
        MediaPonderada mediaPonderada = new MediaPonderada();

        mediaPonderada.nota1 = Prompt.lerDecimal("Digite a nota do Laboratorio: ");
        mediaPonderada.nota2 = Prompt.lerDecimal("Digite a nota da avaliação semsteral:");
        mediaPonderada.nota3 = Prompt.lerDecimal("Digite a nota do Exame final:");

        Prompt.imprimir("\nA nota final: " + mediaPonderada.media());
    }
}
