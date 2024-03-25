public class Exercicio11 {
    public static void executar(){
        MascFemin mf = new MascFemin();
    
        for ( int i = 0; i < 56; i++){
            String nome = Prompt.lerLinha("Digite o nome da pessoa " + (i+1) + " :");
    
            char sexo = Prompt.lerCaractere("Digite soxe da pessoa " + (i+1) + " (f para feminino/ m para masculino:)");
            mf.contadorSexo(sexo);
    }
    Prompt.imprimir("Total de homens: " + mf.qtdMasculino);
    Prompt.imprimir("Total de mulheres: " + mf.qtdFeminino);
}
}