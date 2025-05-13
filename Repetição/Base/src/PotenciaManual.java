//Faça um programa que peça dois números,
// base e expoente, calcule e mostre o primeiro número elevado ao segundo número.
// Não utilize a função de potência da linguagem.
import java.util.Scanner;
public class PotenciaManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = scanner.nextInt();
        System.out.print("Digite o expoente (inteiro positivo): ");
        int expoente = scanner.nextInt();
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        System.out.println(base + " elevado a " + expoente + " é: " + resultado);

        scanner.close();
    }
}
