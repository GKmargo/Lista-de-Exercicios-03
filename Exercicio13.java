public class Exercicio13 {
    public static void executar(){
    Militar dados = new Militar();

    int qtd = Prompt.lerInteiro("Digite a quantidade de pessoas que voce deseja inserir dados:");

    for (int i = 0; i < qtd; i ++){
        String nome = Prompt.lerLinha("Digite o nome da pessoa " + (i+1) + " :");
        dados.sexo = Prompt.lerCaractere("Digite o sexo da pessoa " + (i+1) + " (m para masculino/ f para feminino): ");
        dados.idade = Prompt.lerInteiro("Digite a idade da pessoa " + (i+1) + " :");
        dados.saude = Prompt.lerLinha("Digite o estado de saude da pessoa " + (i+1) + " saudavel ou não saudavel");

        Prompt.imprimir(dados.qtdAptos(dados.sexo, dados.idade, dados.saude));
    }
    Prompt.imprimir("\nQuantidade aptos: " + dados.aptos);
    Prompt.imprimir("Quantidade não aptos: " + dados.naoAptos);
}
}