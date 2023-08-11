import java.util.Scanner;

public class DataExtenso {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String data = scanner.next();

        int dia = Integer.parseInt(data.substring(0,2));
        int mes = Integer.parseInt(data.substring(2,4));
        int ano = Integer.parseInt(data.substring(4,8));

        String[] meses = {
            "janeiro", "fevereiro", "março", "abril", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };
        
        System.out.println(dia + " de " + meses[mes - 1] + " de " + ano);

        scanner.close();
    }
}
