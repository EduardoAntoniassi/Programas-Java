import java.io.IOException;
import java.util.Scanner;
public class bc1115 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    for(int i = 0; i <= 100; i++) {
        
        int x = s.nextInt();
        int y = s.nextInt();
        
        if(x > 0 && y > 0) {
            System.out.println("primeiro");
            
        } else if (x > 0 && y < 0) {
            System.out.println("quarto");
            
        } else if (x < 0 && y > 0) {
            System.out.println("segundo");
            
        } else if (x < 0 && y < 0) {
            System.out.println("terceiro");
            
        } else if (x == 0 || y == 0) {
            break;
        
        }
    }
    s.close();
    }
 
}