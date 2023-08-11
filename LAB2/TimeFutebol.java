import java.util.Scanner;

public class TimeFutebol {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int vetorTime1[] = new int[50];
            int vetorTime2[] = new int[50];
            
            int i1=0;

            int vitoria = 0;
            int empate = 0;
            int derrota = 0;

            for(i1=0;i1<vetorTime1.length;i1++){
                int valor = scanner.nextInt();
                if(valor == -1){
                    break;
                }
                vetorTime1[i1]=valor;
            }
            
            int i = 0;
            for(i=0;i<vetorTime2.length;i++){
                int valor = scanner.nextInt();
                if(valor == -1){
                    break;
                }
                vetorTime2[i]=valor;
            }

            for(int j = 0; j < i; j++){
                if(vetorTime1[j] > vetorTime2[j]){
                    vitoria++;
                }else if(vetorTime1[j] < vetorTime2[j]){
                    derrota++;
                }else{
                    empate++;
                }
            }

            System.out.printf("%d %d %d", vitoria, empate, derrota);
            scanner.close();
        }
    }
}
