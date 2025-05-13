import java.util.Scanner;
public class AnaliseVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] A = new double[100];

        double soma = 0;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o valor #" + (i + 1) + ": ");
            A[i] = scanner.nextDouble();

            soma += A[i];

            if (A[i] > maior) {
                maior = A[i];
            }
            if (A[i] < menor) {
                menor = A[i];
            }
        }

        double media = soma / 100;
        System.out.println("\nResultados:");
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
