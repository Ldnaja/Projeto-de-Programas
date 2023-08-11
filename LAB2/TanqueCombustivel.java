import java.util.Scanner;

public class TanqueCombustivel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double altura = scanner.nextDouble();
        int escolha = scanner.nextInt();
        

        if(escolha == 1){
            System.out.printf("%.4f",(Math.PI/3.0)*Math.pow(altura, 2)*((3.0*raio) - altura));
        }
        if(escolha == 2){
            System.out.printf("%.4f",(4.0/3.0)*(Math.PI)*Math.pow(raio, 3)-(Math.PI/3.0)*Math.pow(altura, 2)*((3.0*raio) - altura));
        }
        scanner.close();
    }
}
