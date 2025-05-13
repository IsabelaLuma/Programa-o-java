//Faça um programa que peça para o usuário ir informando números até que ele informe 0 (zero).
// Após isto apresente os seguintes dados sobre os números digitados:
//
//O maior número;
//O menor número;
//A soma dos números;
//A média deles;
//A quantidade de números pares;
//A quantidade de números ímpares.

import java.util.Scanner;
public class AnalisaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        int quantidade = 0;
        int pares = 0;
        int impares = 0;
        System.out.println("Digite números (digite 0 para encerrar):");
        while (true) {
            numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            soma += numero;
            quantidade++;
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) menor = numero;
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        if (quantidade == 0) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            double media = (double) soma / quantidade;

            System.out.println("\nResultados:");
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
            System.out.println("Soma dos números: " + soma);
            System.out.printf("Média: %.2f\n", media);
            System.out.println("Quantidade de pares: " + pares);
            System.out.println("Quantidade de ímpares: " + impares);
        }

        scanner.close();
    }
}
