public class Aluno{
    public String nome;
    public double[] nota = new double[3];

    public double notaMedia(double[] nota) {
        double media = 0;
        for (int i = 0; i < 3; i++) {
            media += nota[i] / 3;
        }
        return media;
    }
}