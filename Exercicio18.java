public class Exercicio18 {
    public static void executar(){
        Funcionario03 funcionario = new Funcionario03();
        funcionario.nome = Prompt.lerLinha("Nome do funcionário: ");

        funcionario.idade = Prompt.lerInteiro("Idade do funcionário: ");

        funcionario.sexo = Prompt.lerCaractere("Sexo do funcionário (M/F): ");

        funcionario.salarioFixo = Prompt.lerDecimal("Salário fixo do funcionário: ");

        Prompt.imprimir("\nNome do funcionário: " + funcionario.getNome());
        Prompt.imprimir("Salário líquido com acrescimo do abono: " + funcionario.calcularSalarioLiquido());

    }
}
