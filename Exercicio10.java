public class Exercicio10 {
    public static void executar(){
        Idade idadePessoa = new Idade();
        int qtd = Prompt.lerInteiro("Digite a quantidade de pessoas:");

        for(int i = 0; i < qtd; i++){
            idadePessoa.idade = Prompt.lerInteiro("Digite a idade da pessoa " + (i+1) + " :");
            Prompt.imprimir(idadePessoa.verificacao(idadePessoa.idade));
        }

    }

}
