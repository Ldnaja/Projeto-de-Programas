import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] respostas = lerVetor(scanner);

        int[] gabarito = lerVetor(scanner);

        int acertos = 0;
        for (int i = 0; i < respostas.length; i++) {
            if (respostas[i] == gabarito[i]) {
                acertos++;
            }
        }

        double porcentagemAcerto = (double) acertos / respostas.length * 100;

        System.out.printf( " %.2f", porcentagemAcerto);
    }

    public static int[] lerVetor(Scanner scanner) {
        int tamanho = 0;
        int[] vetor = new int[100];

        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            vetor[tamanho++] = num;
        }

        int[] resultado = new int[tamanho];
        System.arraycopy(vetor, 0, resultado, 0, tamanho);

        return resultado;
    }
}
