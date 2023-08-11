import java.util.Scanner;

public class MediaColecoes {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        
        while (true) {
            double mediana = 0.0;
            double soma = 0.0;
            double valor;
            double cont=0.0;

            while (true) {
                valor = scanner.nextInt();
                cont+=1;
                if (valor == -1) {
                    break;
                }
                soma += valor;
                mediana = soma/cont;
            }
            if (soma == 0) {
                break;
            }
            System.out.printf("%.2f",mediana);
        }
        
        scanner.close();
    }
}