public class Triangulo {
    public int lado1;
    public int lado2;
    public int lado3;

    // Método para verificar se os lados formam um triângulo
    public boolean verificaTriangulo() {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    // Método para determinar o tipo de triângulo
    public String tipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
}
}
