public class PesoIdeal {
    public char sexo;
    public double altura;
    public int idade;

    public double calculoPeso (){
        if (sexo == 'M' || sexo == 'm' && altura > 1.70 && idade <= 20){
            return (72.7 * altura) - 58;
        } else if(sexo == 'M' || sexo == 'm' && altura > 1.70 && idade >= 21 && idade <= 39 ){
            return (72.7 * altura) - 53;
        } else if (sexo == 'M' ||sexo == 'm' && altura > 1.70 && idade >= 40){
            return (72.7 * altura) - 45;
        } else if (sexo == 'M' ||sexo == 'm' && altura <= 1.70 && idade <= 40){
            return (72.7 * altura) - 50;
        } else if (sexo == 'M' ||sexo == 'm' && altura <= 1.70 && idade > 40){
            return (72.7 * altura) - 58;
        } else if (sexo == 'F' ||sexo == 'f' && altura > 1.50 && idade < 35){
            return (62.1 * altura) - 44.7;
        } else if (sexo == 'F' ||sexo == 'f' && altura <=  1.50 && idade >= 35){
            return (62.1 * altura) - 45;
        } else if (sexo == 'F' ||sexo == 'f' && altura <=  1.50 && idade < 35){
            return (62.1 * altura) - 49;
        } else {
            return 0;
        }
    }
}
