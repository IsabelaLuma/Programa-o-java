import java.util.Scanner;
public class ContadorDeCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();
        int espacos = 0;
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

        for (char c : frase.toCharArray()) {
            switch (c) {
                case ' ':
                    espacos++;
                    break;
                case 'a':
                    countA++;
                    break;
                case 'e':
                    countE++;
                    break;
                case 'i':
                    countI++;
                    break;
                case 'o':
                    countO++;
                    break;
                case 'u':
                    countU++;
                    break;
            }
        }
        System.out.println("Quantidade de espaços em branco: " + espacos);
        System.out.println("Quantidade de 'a': " + countA);
        System.out.println("Quantidade de 'e': " + countE);
        System.out.println("Quantidade de 'i': " + countI);
        System.out.println("Quantidade de 'o': " + countO);
        System.out.println("Quantidade de 'u': " + countU);
    }
}
