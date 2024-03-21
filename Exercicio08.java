public class Exercicio08 {
    public static void executar(){
        Aluno aluno = new Aluno();

        aluno.nome = Prompt.lerLinha("Digite o nome do aluno:");

        for (int i = 0; i < 3; i++) {
            aluno.nota[i] = Prompt.lerDecimal("Digite a nota " + (i + 1) + " do Aluno " + aluno.nome + " :");
        }

        double notaMedia = aluno.notaMedia(aluno.nota);

        if(notaMedia >= 7){
            Prompt.imprimir("o aluno " + aluno.nome + " aprovado com a média: " + notaMedia);
        } else if (notaMedia <=5 ){
            Prompt.imprimir("o aluno " + aluno.nome + " reprovado com a média: " + notaMedia);
        } else if (notaMedia >= 5.1 && notaMedia <=6.9){
            Prompt.imprimir("o aluno " + aluno.nome + " está de recuperação com a média: " + notaMedia);
        }
    }

}
