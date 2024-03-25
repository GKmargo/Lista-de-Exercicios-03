public class Produto{
    public double valor;
    public double valorPorcentagem;
    
    public double acrescimo(double valor, double valorPorcentagem){
        double porcentagem = (valor * valorPorcentagem) /100;
        return valor + porcentagem;
    }
    
    public double precoCusto;
    public double precoVenda;
    
    public String calculoLucro(){
        if (precoVenda > precoCusto){
            return "Lucro";
        } else if (precoVenda < precoCusto){
            return "Prejuizo";
        } else {
            return "Empate";
        }
    }
}