import java.util.Scanner;

public class VolumeCombustivel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int altura = scanner.nextInt();
        int combustivel = scanner.nextInt();
        int raio = scanner.nextInt();
        
        double erro = -1.000;

        double volumeEsfera = (4.0/3.0)*Math.PI*Math.pow(raio,3);
        double VolumecalotaEsfera = (Math.PI/3.0)*Math.pow(combustivel, 2)*((3.0*raio)-combustivel);
        double volumeCilindro = Math.PI*Math.pow(raio, 2)*(combustivel-raio);

        if((combustivel > altura) && (altura < 0 || combustivel < 0 || raio < 0)){
            System.out.print(erro);
        }else{
            if(combustivel<=raio){
                System.out.printf("%.3f ", VolumecalotaEsfera);
            }else if(combustivel<=(altura - raio)){
                double calculo1 = (volumeEsfera/2.0)+volumeCilindro;
                System.out.printf("%.3f ",calculo1);
            }else if(combustivel <= altura){
                double calculo2 = ((volumeEsfera + volumeCilindro) - (VolumecalotaEsfera/2.0));
                System.out.printf("%.3f ", calculo2);
            }else{
                System.out.printf("%.3f",erro);
            }
        }
        scanner.close();
    }
}
