public class Funcionario {
    public String nome;
    public double salario;
    public static double salarioMinimo;

    // Método para definir o salário mínimo da empresa
    public static void setSalarioMinimo(double salarioMin) {
        salarioMinimo = salarioMin;
    }

    
    public double calcularReajuste() {
        if (salario < 3 * salarioMinimo) {
            return salario * 0.5; 
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            return salario * 0.2; 
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            return salario * 0.15; 
        } else {
            return salario * 0.1; 
        }
    }
   
    public double calcularNovoSalario() {
        return salario + calcularReajuste();
    }

    
    public String getNome() {
        return nome;
    }

}
