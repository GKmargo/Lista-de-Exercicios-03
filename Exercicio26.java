public class Exercicio26 {
    public static void executar(){
        Seguradora seguro = new Seguradora();

        String nome = Prompt.lerLinha("Digite seu nome: ");
        seguro.idade = Prompt.lerInteiro("Digite a sua idade:");
        seguro.grupo = Prompt.lerInteiro("Digite 1 se seu grupo de risico é Baixo, 2 se seu grupo de risico é Médio, 3 se seu grupo de risico é Alto:");

        Prompt.imprimir("Nome: " + nome + ";");
        Prompt.imprimir("Idade: " + seguro.idade + ";");
        Prompt.imprimir("Grupo de Risco: " + seguro.seguro() + ".");
    }
}
