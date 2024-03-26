public class Seguradora {
    public int idade;
    public int grupo;

    public String seguro(){
        if (idade >= 17 && idade <= 20 && grupo == 1){
            return "Risco Baixo";
        } else if (idade >= 17 && idade <= 20 && grupo == 2){
            return "Risco Médio";
        } else if (idade >= 17 && idade <= 20 && grupo == 3){
            return "Risco Alto";
        } else if (idade >= 21 && idade <= 24 && grupo == 1){
            return "Risco Baixo";
        } else if (idade >= 21 && idade <= 24 && grupo == 2){
            return "Risco Médio";
        } else if (idade >= 21 && idade <= 24 && grupo == 3){
            return "Risco Alto";
        } else if (idade >= 25 && idade <= 34 && grupo == 1){
            return "Risco Baixo";
        } else if (idade >= 25 && idade <= 34 && grupo == 2){
            return "Risco Médio";
        } else if (idade >= 25 && idade <= 34 && grupo == 3){
            return "Risco Alto";
        } else if (idade >= 35 && idade <= 64 && grupo == 1){
            return "Risco Baixo";
        } else if (idade >= 35 && idade <= 64 && grupo == 2){
            return "Risco Médio";
        } else if (idade >= 35 && idade <= 64 && grupo == 3){
            return "Risco Alto";
        } else if (idade >= 65 && idade <= 70 && grupo == 1){
            return "Risco Baixo";
        } else if (idade >= 65 && idade <= 70 && grupo == 2){
            return "Risco Médio";
        } else if (idade >= 65 && idade <= 70 && grupo == 3){
            return "Risco Alto";
        } else {
            return "não se enquadra em nenhuma das categorias ofertadas";
        }
    }
}