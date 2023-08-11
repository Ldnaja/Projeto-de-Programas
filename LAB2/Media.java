import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int total = 3;

        float soma=0;

        float vetor[] = new float[total];

        for(int i=0;i<total;i++ ){
            vetor[i] = scanner.nextFloat();
        }

        for(int i=0;i<vetor.length;i++){
            soma +=vetor[i];
        }

        float media = soma/total;

        System.out.printf("%.2f",media);
        scanner.close();
    }
}
