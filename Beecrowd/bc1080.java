import java.io.IOException;
import java.util.Scanner;
public class bc1080 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    int stg = 0;
    int posicao = 1;
    
    for (int i = 1; i <= 100; i++) {
        int x = s.nextInt();
        
        if (i == 1) {
            stg = x;
            posicao = 1;
        } else if (x > stg) {
            stg = x;
            posicao = i; 
        }
    }
    System.out.println(stg);
    System.out.println(posicao);
    }
 
}