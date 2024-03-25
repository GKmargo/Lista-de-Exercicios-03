public class Veiculo {
    public double valor;
    public String combustivel;

    public double calcularDesconto(){
        //converter para letra minuscula
        switch (combustivel.toLowerCase()) {
            case "alcool":
                return valor * 0.25;
                case "gasolina":
                return valor * 0.21;
                case "diesel":
                return valor * 0.14;
                default:
                return 0.0;
            }
    }
    public double valorComDesconto() {
        return valor - calcularDesconto();
    }
}
