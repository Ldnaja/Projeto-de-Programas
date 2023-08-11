import java.util.ArrayList;
import java.util.Scanner;

public class SomaColecao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> vetor = new ArrayList<>();

        int dado;
        while((dado = scanner.nextInt())!=-1){
            vetor.add(dado);
        }

        int soma=0;

        for(int i=0;i<vetor.size();i++){
            soma += vetor.get(i);
        }

        System.out.println(soma);

        scanner.close();
    }
}
