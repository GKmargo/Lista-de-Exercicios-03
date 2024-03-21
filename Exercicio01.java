public class Exercicio01{
    public static void executar(){
        double[] nota = new double[3];

        String nome = Prompt.lerLinha("Digite o nome do aluno:");

        for(int i = 0; i < 3; i ++){
            nota[i] = Prompt.lerDecimal("Digite a nota " + (i+1) + " do Aluno " + nome + " :");
        }

        Prompt.imprimir("A media do Aluno " + nome + " é: " + Aluno.notaMedia(nota));

    }
}