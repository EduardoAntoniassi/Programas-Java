import java.io.IOException;
import java.util.Scanner;
public class bc1116 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    int qtd = s.nextInt();
    
    for(int i = 0; i <= qtd; i++) {
        
        double x = s.nextDouble();
        double y = s.nextDouble();
        
        double div = x / y;
        
           if(y == 0) {
               System.out.println("divisao impossivel\n");
               
           } else {
               System.out.printf("%.1f\n" ,div);
               
           }
    }
 
    }
 
}