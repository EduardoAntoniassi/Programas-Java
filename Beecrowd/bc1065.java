import java.io.IOException;
import java.util.Scanner;
public class bc1065 {
 
    public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    
    int pares = 0;
    for (int i = 0; i < 5; i++) {
    int ns = s.nextInt();
    
       if (ns % 2 == 0) {
           pares++;
       }
        
    }
    System.out.printf("%d valores pares\n" ,pares);
    s.close();
    }
 
}