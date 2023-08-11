import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float valorHora = scanner.nextFloat();
        int horaTrabalhada = scanner.nextInt();

        float sB = valorHora*horaTrabalhada;
        float IR = (float) ((valorHora*horaTrabalhada)*(11.0/100.0));
        float Inss=(float) ((valorHora*horaTrabalhada)*(8.0/100.0));
        float Tdesconto = IR + Inss;
        float salario = sB - Tdesconto;

        System.out.printf("Salario bruto: R$%.2f", sB);
        System.out.printf("\n");
        System.out.printf("IR: R$%.2f",IR);
        System.out.printf("\n");
        System.out.printf("INSS: R$%.2f",Inss);
        System.out.printf("\n");
        System.out.printf("Total de descontos: R$%.2f",Tdesconto);
        System.out.printf("\n");
        System.out.printf("Salario liquido: R$%.2f",salario);

        scanner.close();
    }
}
