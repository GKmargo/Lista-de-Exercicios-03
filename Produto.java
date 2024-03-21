public class Produto{
    public double valor;
    public double valorPorcentagem;

    public double acrescimo(double valor, double valorPorcentagem){
        double porcentagem = (valor * valorPorcentagem) /100;
        return valor + porcentagem;
    }
}