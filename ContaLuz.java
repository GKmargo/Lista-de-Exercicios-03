public class ContaLuz {
    public int tipoCliente;
    public double consumo;
    public  double valorKWh;

    public double calcularValor() {
        switch (tipoCliente) {
            case 1:
                valorKWh = 0.60;
                break;
            case 2:
                valorKWh = 0.48;
                break;
            case 3:
                valorKWh = 1.29;
                break;
            default:
                return 0;
        }
        return valorKWh * consumo;
    }
    
}
