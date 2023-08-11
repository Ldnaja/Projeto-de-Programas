import java.util.Scanner;

public class RotaOrtodromica {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int raio = 6371;

        double latitude1, latitude2, longitude1,longitude2;
    
        latitude1=scanner.nextDouble();
        longitude1=scanner.nextDouble();
        latitude2=scanner.nextDouble();
        longitude2=scanner.nextDouble();

        double radiLat1 = Math.toRadians(latitude1);
        double radiLat2 = Math.toRadians(latitude2);
        double radLong1 = Math.toRadians(longitude1);
        double radLong2 = Math.toRadians(longitude2);

        double teste = Math.sin(radiLat1)*Math.sin(radiLat2) + Math.cos(radiLat1) * Math.cos(radiLat2) * Math.cos(radLong1-radLong2);

        double d = raio * Math.acos(teste);
    
        System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km",latitude1,longitude1,latitude2,longitude2,d);

        scanner.close();
    }
}