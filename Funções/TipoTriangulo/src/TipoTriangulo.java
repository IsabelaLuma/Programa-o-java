public class TipoTriangulo {
    public static String tipoTriangulo(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Não é um triângulo";
        } else if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || a == c || b == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    public static void main(String[] args) {
        double ladoA = 5, ladoB = 5, ladoC = 5; // exemplo
        System.out.println("Tipo: " + tipoTriangulo(ladoA, ladoB, ladoC));
    }
}
