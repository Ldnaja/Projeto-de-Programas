import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float numero = scan.nextFloat();

        if (numero > 200) {
            float desconto = numero * 0.05f;
            numero -= desconto;
        }

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#0.00", symbols);
        String numeroFormatado = df.format(numero);

        System.out.println(numeroFormatado);
        
        scan.close();
    }
}
