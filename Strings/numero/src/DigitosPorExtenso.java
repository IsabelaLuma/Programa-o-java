import java.util.Scanner;
public class DigitosPorExtenso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] extenso = {
                "zero", "um", "dois", "três", "quatro",
                "cinco", "seis", "sete", "oito", "nove"
        };
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        String numeroStr = String.valueOf(numero);
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < numeroStr.length(); i++) {
            char c = numeroStr.charAt(i);
            if (Character.isDigit(c)) {
                int digito = Character.getNumericValue(c);
                resultado.append(extenso[digito]);
                if (i < numeroStr.length() - 1) {
                    resultado.append(", ");
                }
            } else {
                System.out.println("Erro: número contém caracteres inválidos.");
                return;
            }
        }

        // Exibe o resultado
        System.out.println("Resultado: " + resultado.toString());
    }
}
