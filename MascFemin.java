public class MascFemin {
    public char sexo;
    public int qtdFeminino = 0;
    public int qtdMasculino = 0;

    public void contadorSexo (char sexo){
        if (sexo == 'f' || sexo == 'F'){
            qtdFeminino ++;
        } else if(sexo == 'm' || sexo == 'M'){
            qtdMasculino ++;
        }
    }
}
