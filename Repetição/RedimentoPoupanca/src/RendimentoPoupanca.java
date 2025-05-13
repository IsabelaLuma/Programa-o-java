//Faça um programa que receba um valor que foi depositado na poupança e exiba o valor com rendimento mês a mês durante
// o período de um ano.
// Considere fixo o juros da poupança em 0,5% a. m.
import java.util.Scanner;
public class RendimentoPoupanca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor depositado na poupança: R$ ");
        double valor = scanner.nextDouble();
        double taxaJuros = 0.005;

        System.out.println("\nRendimentos mês a mês:");
        for (int mes = 1; mes <= 12; mes++) {
            valor += valor * taxaJuros;
            System.out.printf("Mês %2d: R$ %.2f%n", mes, valor);
        }

        scanner.close();
    }
}
