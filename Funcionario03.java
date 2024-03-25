public class Funcionario03 {
    public String nome;
    public int idade;
    public char sexo;
    public double salarioFixo;

    public double calcularAbono() {
        if (sexo == 'M' || sexo =='m') {
            if (idade >= 30) {
                return 100.00;
            } else {
                return 50.00;
            }
        } else if (sexo == 'F' || sexo == 'f'){
            if (idade >= 30) {
                return 200.00;
            } else {
                return 80.00;
            }
        } else {
            //é uma exceção que indica que um método foi chamado com um argumento inválido
            throw new IllegalArgumentException("Sexo inválido");
        }
    }

    public double calcularSalarioLiquido() {
        return salarioFixo + calcularAbono();
    }

    // Método para obter o nome do funcionário
    public String getNome() {
        return nome;
    }

    // Método para obter o salário fixo do funcionário
    public double getSalarioFixo() {
        return salarioFixo;
    }
}
