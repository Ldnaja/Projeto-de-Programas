import java.util.Scanner;

public class AngryBirds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Velocidade = scanner.nextInt();
        int angulo = scanner.nextInt();
        double distancia = scanner.nextDouble();

        int modVelocidade = Math.abs(Velocidade);
        double anguloRadians = Math.toRadians(angulo);
        int modVelocidadex2 = modVelocidade * modVelocidade;

        double result = (modVelocidadex2 * Math.sin(2*anguloRadians))/9.8;
        double result1 = Math.abs(result - distancia);

        if ( result1 < 0.1 ){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        scanner.close();
    }
}