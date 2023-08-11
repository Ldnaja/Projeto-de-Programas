import java.util.Scanner;

public class SomaColecoes {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        
        while (true) {
            int soma = 0;
            int valor;

            while (true) {
                valor = scanner.nextInt();
                if (valor == -1) {
                    break;
                }
                soma += valor;
            }
            if (soma == 0) {
                break;
            }
            System.out.println(soma);
        }
        
        scanner.close();
    }
}
