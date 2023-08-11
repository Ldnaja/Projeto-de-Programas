import java.util.Scanner;

public class Xadrez {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int matriz [][] = new int [num][num];

        for(int i=0; i<matriz.length;i++){
            if(i%2 ==0){

            for(int j=0; j<matriz.length; j++){
                System.out.print("* ");
            
            }
            } else{
                for(int j=0; j<matriz.length; j++){
                    if(j==0){

                        System.out.print(" ");
                    }
                    System.out.print("* ");

                }
            }
            System.out.println();
        }

        scan.close();
    }
}