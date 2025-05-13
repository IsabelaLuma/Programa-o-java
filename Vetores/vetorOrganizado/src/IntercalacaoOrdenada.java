import java.util.Scanner;

public class IntercalacaoOrdenada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor A (ordenado): ");
        int n = scanner.nextInt();
        int[] A = new int[n];
        System.out.println("Digite os elementos do vetor A (em ordem):");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.print("Digite o tamanho do vetor B (ordenado): ");
        int m = scanner.nextInt();
        int[] B = new int[m];
        System.out.println("Digite os elementos do vetor B (em ordem):");
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt();
        }
        int[] C = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        while (i < n) {
            C[k++] = A[i++];
        }
        while (j < m) {
            C[k++] = B[j++];
        }
        System.out.println("\nVetor C (intercalado e ordenado):");
        for (int val : C) {
            System.out.print(val + " ");
        }
    }
}
