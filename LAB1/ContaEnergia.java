import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class ContaEnergia {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        float erro = -1.00f;

        float kwh = scan.nextFloat();
        char tipo = scan.next().charAt(0);

        char r = 82, i = 73, c = 67;

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#0.00", symbols);

        if((tipo!=r && tipo!=i && tipo!=c) || kwh < 0) {
            String numeroFormatado = df.format(erro);
            System.out.println(numeroFormatado);
        }

        if(tipo == r){
            if(kwh <= 500 && kwh > 0){
                float kwhN = kwh * 0.40f;
                String numeroFormatado = df.format(kwhN);
                System.out.println(numeroFormatado);
            }
            if(kwh > 500){
                float kwhN = kwh * 0.65f;
                String numeroFormatado = df.format(kwhN);
                System.out.println(numeroFormatado);
            }
        }

        if(tipo == i){
            if(kwh <= 1000 && kwh > 0){
                float kwhN = kwh * 0.55f;
                String numeroFormatado = df.format(kwhN);
                System.out.println(numeroFormatado);
            }
            if(kwh > 1000){
                float kwhN = kwh * 0.60f;
                String numeroFormatado = df.format(kwhN);
                System.out.println(numeroFormatado);
            }
        }

        if(tipo == c){
            if(kwh <= 5000 && kwh > 0){
                float kwhN = kwh * 0.55f;
                String numeroFormatado = df.format(kwhN);
                System.out.println(numeroFormatado);
            }
            if(kwh > 5000){
                float kwhN = kwh * 0.60f;
                String numeroFormatado = df.format(kwhN);
                System.out.println(numeroFormatado);
            }
        }
        scan.close();
    }
}
