import java.io.IOException;
import java.util.Scanner;
public class bc1047 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    int h1 = s.nextInt();
    int m1 = s.nextInt();
    int h2 = s.nextInt();
    int m2 = s.nextInt();
         
    if (h1 == m1 == (h2 == m2)) {
        System.out.println("O JOGO DUROU 24 HORA(S) E 0 MIMUTO(S)\n");
    }
    }
}