public class ImpostoCarro {
    public double valorFabrica;
    public double distribuidor = 0.28;
    public double imposto = 0.45;

    public double carroNovo(double valorFabrica){
        double valorImposto = valorFabrica * imposto;
        double valorCarro = valorImposto + valorFabrica;
        double valorDistribuidor = valorCarro * distribuidor;
        double valorFinal = valorCarro + valorDistribuidor;

        return valorFinal;
}
}
