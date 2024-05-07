import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class bc1060 {
 
    public static void main(String[] args) throws IOException {
 
    Locale.setDefault(Locale.US);
    Scanner s = new Scanner(System.in);
    
    int soma = 0;
    for(int i = 0; i < 6; i++) {
        double ns = s.nextDouble();
        if (ns > 0) soma++;
    }
    System.out.printf("%d valores positivos\n" ,soma);
    }
 
}