public class Exercicio19 {
    public static void executar(){
       Triangulo triangulo = new Triangulo();

       Prompt.imprimir("Digite os valores dos três lados do triângulo:");
       triangulo.lado1 = Prompt.lerInteiro("Lado 1: ");

       triangulo.lado2 = Prompt.lerInteiro("Lado 2: ");

       triangulo.lado3 = Prompt.lerInteiro("Lado 3: ");

       if (triangulo.verificaTriangulo()) {
           String tipo = triangulo.tipoTriangulo();
           System.out.println("\nOs lados formam um triângulo do tipo: " + tipo);
       } else {
           System.out.println("\nOs lados não formam um triângulo.");
       }

    }
}
