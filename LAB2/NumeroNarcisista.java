import java.util.Scanner;

public class NumeroNarcisista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        int numDigitos = String.valueOf(numero).length();

        int somaPotencias = 0;
        int temp = numero;

        while (temp > 0) {
            int digito = temp % 10;
            somaPotencias += Math.pow(digito, numDigitos);
            temp /= 10;
        }

        if(somaPotencias == numero){
            System.out.println("SIM");
        }else{
            System.out.println("NAO");
        }

        scanner.close();
    }
}