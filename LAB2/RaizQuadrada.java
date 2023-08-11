import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextDouble();

        double raiz = Math.sqrt(num);

        System.out.print(raiz);

        scanner.close();
    }
}
