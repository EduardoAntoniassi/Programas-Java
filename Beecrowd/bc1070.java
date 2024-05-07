import java.io.IOException;
import java.util.Scanner;
public class bc1070 {
 
    public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    
    int impar = s.nextInt();
    int soma = 0;
    
    while (soma < 6) {
        if (impar % 2 != 0) {
            soma++;
            System.out.println(impar);
        }
        impar++;
    }
    s.close();
    }
 
}