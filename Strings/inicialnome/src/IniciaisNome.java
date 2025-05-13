//Escreva um programa que, a partir de um nome informado pelo usuário,
// exiba suas iniciais. As iniciais são formadas pela primeira letra de cada nome,
// sendo que todas deverão aparecer em maiúsculas na saída do programa.
// Note que os conectores e, do, da, dos, das, de, di, du não são considerados nomes e,
// portanto, não devem ser considerados para a obtenção das iniciais.
// As iniciais devem ser impressas em maiúsculas,
// ainda que o nome seja entrado todo em minúsculas.
import java.util.Scanner;
public class IniciaisNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine().toLowerCase();
        String[] conectores = {"e", "do", "da", "dos", "das", "de", "di", "du"};
        String[] palavras = nomeCompleto.split(" ");
        StringBuilder iniciais = new StringBuilder();
        for (String palavra : palavras) {
            boolean ehConector = false;
            for (String c : conectores) {
                if (palavra.equals(c)) {
                    ehConector = true;
                    break;
                }
            }
            if (!ehConector && !palavra.isEmpty()) {
                iniciais.append(Character.toUpperCase(palavra.charAt(0)));
            }
        }

        // Exibe as iniciais
        System.out.println("Iniciais: " + iniciais.toString());
    }
}
