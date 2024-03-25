public class Exercicio17 {
    public static void executar(){
        Funcionario02 funcionario = new Funcionario02();
        funcionario.nome = Prompt.lerLinha("Informe o nome do funcionário: ");

        funcionario.salario = Prompt.lerDecimal("Informe o salário do funcionário: ");
        
        funcionario.salarioMinimo = Prompt.lerDecimal("Informe o valor do salário mínimo: ");

        double novoSalario = funcionario.calcularNovoSalario(funcionario.salarioMinimo);

        double aumentoFolha = novoSalario - funcionario.salario;
        
        System.out.println("\nNome do funcionário: " + funcionario.getNome());
        System.out.println("Reajuste: R$" + (novoSalario - funcionario.salario));
        System.out.println("Novo salário: R$" + novoSalario);
        System.out.println("Aumento na folha de pagamento: R$" + aumentoFolha);

    }
}
