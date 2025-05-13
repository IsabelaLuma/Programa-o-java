import java.util.ArrayList;
import java.util.Scanner;
public class ParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();
        int[] vetor = new int[n];
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento #" + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();

            if (vetor[i] % 2 == 0) {
                pares.add(vetor[i]);
            } else {
                impares.add(vetor[i]);
            }
        }
        System.out.println("\nValores pares:");
        for (int num : pares) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nValores ímpares:");
        for (int num : impares) {
            System.out.print(num + " ");
        }
    }
}
