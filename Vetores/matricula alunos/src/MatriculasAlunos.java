//Ler 100 números de matriculas de alunos e armazenar em um vetor. Esses números são distintos,
// ou seja, não existem números de matriculas iguais.
// Caso o utilizador informa um número de matrículo que já existe, o programa deverá emitir um alerta.
import java.util.HashSet;
import java.util.Scanner;
public class MatriculasAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matriculas = new int[100];
        HashSet<Integer> jaInseridas = new HashSet<>();

        int count = 0;
        while (count < 100) {
            System.out.print("Digite o número de matrícula #" + (count + 1) + ": ");
            int matricula = scanner.nextInt();

            if (jaInseridas.contains(matricula)) {
                System.out.println("⚠️ Matrícula já informada! Digite um número diferente.");
            } else {
                matriculas[count] = matricula;
                jaInseridas.add(matricula);
                count++;
            }
        }
        System.out.println("\nMatrículas cadastradas:");
        for (int i = 0; i < 100; i++) {
            System.out.println((i + 1) + ": " + matriculas[i]);
        }
    }
}
