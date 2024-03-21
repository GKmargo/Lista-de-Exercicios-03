public class Idade {
    public int idade;

    public String verificacao(int idade){
        if (idade>=18){
            return "Maior de Idade";
        } else{
            return "Menor de idade";
        }
    }


}
