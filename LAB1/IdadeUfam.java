import java.util.Scanner;

public class IdadeUfam {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = 1909;

        int idade = scan.nextInt();

        int anos = idade - a;

        System.out.println("A UFAM tem " + anos + " anos de fundacao");
        
        scan.close();
    }
}