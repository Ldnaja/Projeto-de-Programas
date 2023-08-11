import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int temperatura = scanner.nextInt();

        double fah = ((9.0*temperatura)/5)+32.0;

        System.out.printf("%.1f",fah);

        scanner.close();
    }
}
