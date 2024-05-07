import java.io.IOException;
import java.util.Scanner;
public class bc1078 {
 
    public static void main(String[] args) throws IOException {
 
     Scanner s = new Scanner(System.in);
     
     int n = s.nextInt();
     
     for (int i = 1; i <=10; i++) {
    
      int x = i * n;
      System.out.printf("%d x %d = %d\n" ,i ,n ,x);
     
     }
    
    }

 
}