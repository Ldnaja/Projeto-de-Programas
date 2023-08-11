import java.util.Scanner;

public class Mediana {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            double vetor[] = new double[50];
            int i;

            for(i=0;i<vetor.length;i++){
                int valor = scanner.nextInt();
                if(valor == -1){
                    break;
                }
                vetor[i]=valor;
            }

            scanner.close();
            
            if(i%2==0){
                System.out.printf("%.1f",(vetor[(i/2)]+vetor[(i/2)-1])/2);
            }else if(i%2==1){
                System.out.println(vetor[(i/2)]);
            }
        }

    }   
}
