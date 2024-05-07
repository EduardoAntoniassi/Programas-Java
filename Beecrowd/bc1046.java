import java.io.IOException;
import java.util.Scanner;
public class bc1046 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    int h1 = s.nextInt();
    int h2 = s.nextInt();
         
         if (h1 < h2) {
          int hx = h2 - h1;
          System.out.printf("O JOGO DUROU %d HORA(S)\n" ,hx);   
         
         } else if (h2 < h1) {
            int hx = ((24 - h1) + h2);
            System.out.printf("O JOGO DUROU %d HORA(S)\n" ,hx);
        
         } else if (h1 == h2) {
             System.out.printf("O JOGO DUROU 24 HORA(S)\n");
         
         }
         s.close();
    }
}