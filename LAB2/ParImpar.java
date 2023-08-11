import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            int dado = scanner.nextInt();
            if(dado == -1){
                break;
            }
            else if(dado % 2 == 0){
                System.out.println("PAR");
            }else{
                System.out.println("IMPAR");
            }
        }
        scanner.close();
    }
}
