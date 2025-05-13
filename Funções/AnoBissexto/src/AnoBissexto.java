public class AnoBissexto {
    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    public static void main(String[] args) {
        int ano = 2024;
        if (ehBissexto(ano)) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }
    }
}
