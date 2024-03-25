public class Professor {
    public int nivel;
    public double valorHoraAula;
    public double horasAula;

    public double calcularSalario() {
        switch (nivel) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                Prompt.imprimir("Nível inválido.");
                break;
        }
        return valorHoraAula * horasAula;
    }

}
