import java.io.Console;
import java.util.*;
import java.util.Base64;

public class JogoPalavraEmbaralhada {
    private static final String SENHA_CIFRADA = "UG93ZGVyQXJjYW5l"; // Base64 da senha de dev

    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Não foi possível obter o Console. Certifique-se de executar o programa no terminal.");
            return;
        }

        exibirIntroducao();

        System.out.print("Você é desenvolvedor? (s/n): ");
        String resposta = console.readLine().trim();

        if (resposta.equalsIgnoreCase("s")) {
            System.out.println("\n🔐 Acesso restrito. Digite a senha de desenvolvedor:");
            String senhaDigitada = lerSenhaOculta(console);

            if (verificaSenha(senhaDigitada)) {
                System.out.println("\n🔓 Acesso concedido! Lista de palavras reais:\n");
                exibirPalavrasReais();
                return;
            } else {
                System.out.println("❌ Senha incorreta. Acesso negado.");
                return;
            }
        }

        jogarComoUsuario(console);
    }

    public static void exibirIntroducao() {
        System.out.println("====================================");
        System.out.println("🔠 JOGO DE PALAVRA EMBARALHADA");
        System.out.println("====================================\n");
        System.out.println("Descubra a palavra correta a partir de uma versão embaralhada.");
        System.out.println("Você terá 6 tentativas para acertar.\n");
    }

    public static boolean verificaSenha(String senhaDigitada) {
        String senhaOriginal = new String(Base64.getDecoder().decode(SENHA_CIFRADA));
        return senhaDigitada.equals(senhaOriginal);
    }

    public static String embaralharPalavra(String palavra) {
        List<String> letras = Arrays.asList(palavra.split(""));
        Collections.shuffle(letras);
        return String.join("", letras);
    }

    public static List<String> getPalavrasCodificadas() {
        return Arrays.asList(
                "computador", "java", "programa", "teclado", "internet", "algoritmo",
                "estrutura", "modo", "viagem", "auto", "cliente", "servidor",
                "desta", "desafio", "morte", "premonição", "metáfora", "escada",
                "senha", "paramodo", "protocolo", "mundo", "questao", "iniciativas",
                "distravo", "cascada", "cerno", "pervaco", "cata", "sistemade",
                "desenvolvedor", "rede", "computacao", "hardware", "software",
                "javascript", "python", "linguagem", "tecnologia", "inovacao"
        );
    }

    public static List<String> getPalavrasDecodificadas() {
        List<String> codificadas = getPalavrasCodificadas();
        List<String> decodificadas = new ArrayList<>();
        for (String cod : codificadas) {
            decodificadas.add(new StringBuilder(cod).reverse().toString());
        }
        return decodificadas;
    }

    public static String lerSenhaOculta(Console console) {
        // Lê a senha de forma oculta usando o Console
        char[] senhaChars = console.readPassword("→ ");
        return new String(senhaChars);
    }

    public static void exibirPalavrasReais() {
        List<String> lista = getPalavrasDecodificadas();
        for (String palavra : lista) {
            System.out.println("→ " + palavra);
        }
        System.out.println("\n[Encerrando. Modo desenvolvedor apenas visualiza palavras.]");
    }

    public static void jogarComoUsuario(Console console) {
        Random random = new Random();
        List<String> palavras = getPalavrasDecodificadas();
        String palavraEscolhida = palavras.get(random.nextInt(palavras.size()));
        String palavraEmbaralhada = embaralharPalavra(palavraEscolhida);

        System.out.println("\n🌀 Adivinhe a palavra embaralhada: " + palavraEmbaralhada);

        boolean acertou = false;
        int tentativas = 6;

        while (tentativas > 0) {
            System.out.print("Tentativa (" + tentativas + "): ");
            String tentativa = console.readLine().trim();

            if (tentativa.equalsIgnoreCase(palavraEscolhida)) {
                acertou = true;
                break;
            } else if (tentativa.isEmpty()) {
                System.out.println("⚠️ Entrada vazia. Tente novamente.");
                continue;
            }
            tentativas--;
        }

        if (acertou) {
            System.out.println("🎉 Parabéns! Você acertou!");
        } else {
            System.out.println("💀 Fim de jogo! A palavra correta era: " + palavraEscolhida);
        }

        System.out.println("\nObrigado por jogar!");
    }
}
