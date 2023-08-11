import java.util.Scanner;

public class OperacoesString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();

        int nomeTam = nome.length();
        String first = nome.substring(0, 1);
        String last = nome.substring(nomeTam-1, nomeTam);
        String maiusculo = nome.toUpperCase();
        String minusculo = nome.toLowerCase();
        String substituir = nome.replace("a", "e");
        char letraA = 'a';char letraE = 'e';char letraI = 'i';char letraO = 'o';char letraU = 'u';
        int cont = 0;

        System.out.println(nomeTam);
        System.out.println(first);
        System.out.println(last);
        System.out.println(maiusculo);
        System.out.println(minusculo);
        System.out.println(substituir);
        for(int i=0;i<nome.length();i++){
            if(i%2==0){
                System.out.print(nome.charAt(i));
            }
        }
        for(int i=0;i<nome.length();i++){
            if( (minusculo.charAt(i)==letraA) || (minusculo.charAt(i)==letraE) || (minusculo.charAt(i)==letraI) || (minusculo.charAt(i)==letraO) || (minusculo.charAt(i)==letraU)){
                cont += 1;
            }
        }
        System.out.print("\n");
        System.out.print(cont);
        
        
        scanner.close();
    }
}
