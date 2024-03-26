public class Exercicio21 {
    public static void executar(){
        Nadador nadador = new Nadador();

        nadador.idade = Prompt.lerInteiro("Digite a idade do nadador:");

        String categoria = nadador.idadeNadador(nadador.idade);

        Prompt.imprimir("Categoria: " + categoria);
    }
}
