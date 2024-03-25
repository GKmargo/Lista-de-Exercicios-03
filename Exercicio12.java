public class Exercicio12 {
    public static void executar(){
        Concessionaria carro = new Concessionaria();
        int carroAte2000 = 0;
        int totalCarro = 0;
        char resposta;

        while(true){
            carro.ano = Prompt.lerInteiro("Digite o ano do carro:");
            carro.preco = Prompt.lerDecimal("Digite o preço do carro:");

            Prompt.imprimir("O valor do desconto: " + carro.valorDesconto());
            Prompt.imprimir("O valor final do carro: " + carro.valorCarro());

            if (carro.ano <= 2000){
                carroAte2000 ++;
            }
            totalCarro ++;

            resposta = Prompt.lerCaractere("Deseja continuar calculando desconto? (S) Sim / (N) Não ");
            if (resposta == 'N' || resposta == 'n'){
                break;
            }
        }
        Prompt.imprimir("Total decarro carros até o ano 2000: " + carroAte2000);
        Prompt.imprimir("Total de carros: " + totalCarro);
    }
}
