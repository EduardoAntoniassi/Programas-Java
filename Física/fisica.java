import java.util.Scanner;

public class fisica {
    
 public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Qual é a quantidade de pontos?\n");
    
    int points = s.nextInt();
    int[] ptsdst = new int[points];
    int soma = 0;

    System.out.println("Qual a distância dos pontos");
    for(int i = 0; i < points; i++){

        int numeros = s.nextInt();

        ptsdst[i] = numeros;

        soma += ptsdst[i];
    }
    int valorfinal = ptsdst[points - 1];
    int rest = valorfinal - ptsdst[0];
    System.out.printf("Distância Percorrida = %d\n", soma);
    System.out.printf("Deslocamento = %d\n" ,rest);
    
    s.close();
 }
}
