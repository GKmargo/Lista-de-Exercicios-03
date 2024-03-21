public class ImpostoCarro {
    public double valorFabrica;
    public double distribuidor = 28.0 / 100;
    public double imposto = 45.0 / 100;

    public double carroNovo(double valorFabrica){
        double valorImposto = valorFabrica * imposto;
        double valorCarro = valorImposto + valorFabrica;
        double valorDistribuidor = valorCarro * distribuidor;
        double valorFinal = valorCarro + valorDistribuidor;

        return valorFinal;
}
}
