import java.io.IOException;
import java.util.Scanner;
public class bc1016 {
 
    public static void main(String[] args) throws IOException {
 
      Scanner s = new Scanner(System.in);
      
      int dist = s.nextInt();
      
      int v = dist * 2;
      
      System.out.println(v + " minutos");
      s.close();
    }
 
}