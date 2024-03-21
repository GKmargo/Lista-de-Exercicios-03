public class Exercicio01{
    public static void executar() {
        Aluno aluno = new Aluno();

        aluno.nome = Prompt.lerLinha("Digite o nome do aluno:");

        for (int i = 0; i < 3; i++) {
            aluno.nota[i] = Prompt.lerDecimal("Digite a nota " + (i + 1) + " do Aluno " + aluno.nome + " :");
        }

        double notaMedia = Aluno.notaMedia(aluno.nota);

        Prompt.imprimir("A média do Aluno " + aluno.nome + " é: " + notaMedia);
    }
}