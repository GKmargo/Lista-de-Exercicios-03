public class Concessionaria {
    public int ano;
    public double preco;

    public double valorDesconto(){
        if (ano <= 2000){
            return preco * 0.12;
        } else {
            return preco * 0.07;
        }
    }

    public double valorCarro(){
        return preco - valorDesconto();
    }
}
