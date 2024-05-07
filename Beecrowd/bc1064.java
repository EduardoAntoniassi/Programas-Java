import java.io.IOException;
import java.util.Scanner;
public class bc1064 {
 
    public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    
    int soma = 0;
    double media = 0;
    for (int i = 0; i < 6; i++) {
        double ns = s.nextDouble();
        if (ns > 0) {
        soma++;
        media += ns;
        }
    }
    
    media = media / soma;
    System.out.printf("%d valores positivos\n" ,soma);
    System.out.printf("%.1f\n" ,media);
    }
 
}