public class ProcessadorRisco {
    public static void main(String[] args) {

        int[] notasRisco = {10, 25, 40, 75, 90, 15, 65, 88, 92, 30, 55, 78, 95, 10, 45};

        int somaPonderada = 0;
        int somaPesos = 0;

        for (int i = 0; i < notasRisco.length; i++) {
            if (i <= 4) {
                somaPonderada += notasRisco[i] * 3;
                somaPesos += 3;
            } else {
                somaPonderada += notasRisco[i] * 1;
                somaPesos += 1;
            }
        }

        double mediaPonderada = (double) somaPonderada / somaPesos;

        int otimistas = 0;
        int alarmantes = 0;

        for (int nota : notasRisco) {
            if (nota <= 20) {
                otimistas++;
            } else if (nota >= 90) {
                alarmantes++;
            }
        }

        System.out.println("Processamento da Análise de Risco:");
        System.out.println("------------------------------------------");
        System.out.printf("Média Ponderada do Risco: %.2f%n", mediaPonderada);
        System.out.println("Analistas Otimistas (Nota <= 20): " + otimistas);
        System.out.println("Analistas Alarmantes (Nota >= 90): " + alarmantes);
        System.out.println("------------------------------------------");

        if (mediaPonderada > 70) {
            System.out.println("Parecer Final: Alto Risco: Venda ou reajuste de portfólio recomendado.");
        } else if (mediaPonderada >= 40 && mediaPonderada <= 70) {
            System.out.println("Parecer Final: Risco Moderado: Acompanhar de perto, mas manter os ativos.");
        } else {
            System.out.println("Parecer Final: Baixo Risco: Excelente momento para capitalização.");
        }
    }
}
