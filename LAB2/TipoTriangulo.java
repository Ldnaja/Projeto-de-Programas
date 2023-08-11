import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int ladoA = scanner.nextInt();
        int ladoB = scanner.nextInt();
        int ladoC = scanner.nextInt();


        if(((ladoA+ladoB)<=ladoC) && (ladoA>0 && ladoB>0 && ladoC>0)){
            System.out.println("invalido");
        }else{

            if((ladoA==ladoB)&&(ladoB==ladoC)){
                System.out.println("equilatero");
            }
            else if((ladoA==ladoB)||(ladoA==ladoC)||(ladoB==ladoC)){
                System.out.println("isosceles");
            }
            else if((ladoA!=ladoB)&&(ladoB!=ladoC)){
                System.out.println("escaleno");
            }
        }
        scanner.close();
    }
}
