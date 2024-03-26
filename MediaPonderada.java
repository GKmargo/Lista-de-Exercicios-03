public class MediaPonderada {
    public double nota1;
    public double nota2;
    public double nota3;

    public double media(){
        return (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10; 
    }

    public String classificacao(){
        if (media() > 8 && media() <= 10){
            return "Classificação: A";
        } else if (media() > 7 && media() <= 8){
            return "Classificação: B";
        } else if (media() > 6 && media() <= 7){
            return "Classificação: C";
        } else if (media() > 5 && media() <= 6){
            return "Classificação: D";
        } else {
            return "Classificação: R";
        }
    }
}
