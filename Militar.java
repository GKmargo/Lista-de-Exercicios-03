public class Militar {
    public char sexo;
    public int idade; 
    public String saude;
    public int aptos = 0;
    public int naoAptos = 0;

    public String qtdAptos(char sexo, int idade, String saude){
        if(sexo == 'M' || sexo == 'm' && idade == 18 && saude.equals("saudavel")){
            aptos ++;
            return "Está apto para cumprir serviço militar obrigatorio";
        } else {
            naoAptos ++;
            return "Não está apto para cumprir serviço militar obrigatorio";
        }
    }
}
