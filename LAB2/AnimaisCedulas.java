import java.util.Scanner;

public class AnimaisCedulas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int nota = scanner.nextInt();

        String cedula;
        
        switch (nota){
            case 2:
                cedula = "Tartaruga";
                break;
            case 5:
                cedula = "Tartaruga";
                break;
            case 10:
                cedula = "Tartaruga";
                break;
            case 20:
                cedula = "Tartaruga";
                break;
            case 50:
                cedula = "Tartaruga";
                break;
            case 100:
                cedula =   "Tartaruga";
                break;
            default:
                cedula = "erro";
                break;
        }
        System.out.println(cedula);
        scanner.close();
    }
}