public class Aluno{
    
    public static double notaMedia (double[] nota){
        double media = 0;
        for (int i = 0; i < 3; i ++){
            media += nota[i] / 3;
        }
        return media;
    }
}