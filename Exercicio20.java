public class Exercicio20 {
    public static void executar(){
        Professor professor = new Professor();
        
        professor.nivel = Prompt.lerInteiro("Informe o nível do professor (1, 2 ou 3): ");

        professor.horasAula = Prompt.lerDecimal("Informe o número de horas/aula: ");

        double salario = professor.calcularSalario();
        System.out.println("O salário do professor é: " + salario);

}
}