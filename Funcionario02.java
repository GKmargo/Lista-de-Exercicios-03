public class Funcionario02 {
    public String nome;
    public double salario;
    public double salarioMinimo;

    // Método para calcular o novo salário reajustado seguindo a base do exercicio anterior 
    public double calcularNovoSalario(double salarioMinimo) {
        double reajuste;
        if (salario < 3 * salarioMinimo) {
            reajuste = salario * 0.5; 
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            reajuste = salario * 0.2; 
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            reajuste = salario * 0.15; 
        } else {
            reajuste = salario * 0.1; 
        }
        return salario + reajuste;
    }

    public String getNome() {
        return nome;
    }
}
