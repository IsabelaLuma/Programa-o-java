import java.util.Scanner;
public class QuitandaFrutas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de morangos (em kg): ");
        double kgMorango = scanner.nextDouble();
        System.out.print("Digite a quantidade de maçãs (em kg): ");
        double kgMaca = scanner.nextDouble();
        double precoMorango = (kgMorango > 5) ? 2.20 : 2.50;
        double precoMaca = (kgMaca > 5) ? 1.50 : 1.80;
        double totalMorango = kgMorango * precoMorango;
        double totalMaca = kgMaca * precoMaca;
        double totalCompra = totalMorango + totalMaca;
        double totalKg = kgMorango + kgMaca;
        if (totalKg > 8 || totalCompra > 25.00) {
            totalCompra *= 0.90; // aplica 10% de desconto
        }
        System.out.printf("Valor total a pagar: R$ %.2f\n", totalCompra);

        scanner.close();
    }
}