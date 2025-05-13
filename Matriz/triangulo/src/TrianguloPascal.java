import java.util.Scanner;

public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a ordem do triângulo de Pascal: ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            // Primeira coluna e diagonal principal recebem 1
            matriz[i][0] = 1;
            matriz[i][i] = 1;
            for (int j = 1; j < i; j++) {
                matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", matriz[i][j]); // Espaçamento para alinhamento
            }
            System.out.println();
        }

        scanner.close();
    }
}
