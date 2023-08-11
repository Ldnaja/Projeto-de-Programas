import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float a,b,c;
        a = scanner.nextFloat();
        b = scanner.nextFloat();;
        c = scanner.nextFloat();

        float s = (a+b+c)/2;

        if(a+b>c){
            float A = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.printf("%.2f",A);
        }else{
            System.out.println("Triangulo invalido");
        }
        scanner.close();
    }
}
