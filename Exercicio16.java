import java.util.ArrayList;
import java.util.List;

public class Exercicio16 {
    public static void executar(){
        Funcionario funcionario = new Funcionario();
        
        double salarioMinimo = Prompt.lerDecimal("Informe o valor do salário mínimo: ");
        
        // Define o salário mínimo para todos os funcionários
        Funcionario.setSalarioMinimo(salarioMinimo);

        //Cria uma lista para armazenar os funcionarios
        List<Funcionario> funcionarios = new ArrayList<>();
        for (int i = 1; i <= 584; i++) {
            funcionario = new Funcionario();
            Prompt.imprimir("\nFuncionário " + i);
            funcionario.nome = Prompt.lerLinha("Nome: ");
            funcionario.salario = Prompt.lerDecimal("Salário: ");
            funcionarios.add(funcionario);
        }

        System.out.println("\nNovos salários após o reajuste:");
        for (Funcionario f : funcionarios) {
            double novoSalario = f.calcularNovoSalario();
            Prompt.imprimir(f.getNome() + ": " + novoSalario);
        }
    }
}
