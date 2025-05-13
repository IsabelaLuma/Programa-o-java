 //Faça um programa que calcule o resultado dos 50 primeiros números da sequinte sequência:
//
//1000 ÷ 1 - 997 ÷ 2 + 994 ÷ 3 - 991 ÷ 4 + ...
public class Sequencia {
    public static void main(String[] args) {
        double resultado = 0.0;
        int numerador = 1000;
        for (int i = 1; i <= 50; i++) {
            double termo = (double) numerador / i;
            if (i % 2 == 0) {
                resultado -= termo;
            } else {
                resultado += termo;
            }
            numerador -= 3; // diminui o numerador em 3 a cada passo
        }
        System.out.printf("O resultado da sequência é: %.2f\n", resultado);
    }
}
//Numerador: Começa em 1000 e diminui 3 a cada termo.
//
//Denominador: Vai de 1 a 50.
//
//Sinal: Alternado com base na posição do termo (i).