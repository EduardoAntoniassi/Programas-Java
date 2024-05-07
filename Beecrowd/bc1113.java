import java.io.IOException;
import java.util.Scanner;
public class bc1113 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    int x = s.nextInt();
    int y = s.nextInt();
    
    for(int i = 0; i <= 100; i++) {
        
    if(x > y){
        System.out.println("Descrescente");
        
    } else if (x < y) {
        System.out.println("Crescente");
        
    }
    }
    s.close();
    }
 
}