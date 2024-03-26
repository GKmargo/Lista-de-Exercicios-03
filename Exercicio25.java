public class Exercicio25 {
    public static void executar(){
        MediaPonderada mediaPonderada = new MediaPonderada();

        String nome = Prompt.lerLinha("Digite o nome do estudante: ");
        int matricula = Prompt.lerInteiro("Digite o numero de matricula do estudante " + nome + ":");

        mediaPonderada.nota1 = Prompt.lerDecimal("Digite a nota do Laboratorio: ");
        mediaPonderada.nota2 = Prompt.lerDecimal("Digite a nota da avaliação semsteral:");
        mediaPonderada.nota3 = Prompt.lerDecimal("Digite a nota do Exame final:");

        Prompt.imprimir("\nNome: " + nome + ";");
        Prompt.imprimir("Matricula: " + matricula + ";");
        Prompt.imprimir("Nota final: " + mediaPonderada.media() + ";");
        Prompt.imprimir(mediaPonderada.classificacao());
    }
}
