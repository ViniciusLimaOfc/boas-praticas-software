/**
 * Sistema responsável por calcular a média de um aluno
 * e determinar sua situação (Aprovado/Reprovado).
 */
public class SistemaAcademico {

    private static final double MEDIA_MINIMA_APROVACAO = 6.0;

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double notaPrimeiraAvaliacao = 8;
        double notaSegundaAvaliacao = 7;

        double media = calcularMedia(notaPrimeiraAvaliacao, notaSegundaAvaliacao);
        String situacao = verificarSituacao(media);

        exibirResultado(nomeAluno, media, situacao);
    }

    /**
     * Calcula a média aritmética entre duas notas.
     */
    private static double calcularMedia(double notaUm, double notaDois) {
        return (notaUm + notaDois) / 2;
    }

    /**
     * Verifica se o aluno foi aprovado com base na média mínima exigida.
     */
    private static String verificarSituacao(double media) {
        return media >= MEDIA_MINIMA_APROVACAO ? "Aprovado" : "Reprovado";
    }

    /**
     * Exibe os resultados finais do aluno no console.
     */
    private static void exibirResultado(String nomeAluno, double media, String situacao) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + media);
        System.out.println("Situacao: " + situacao);
    }
}
