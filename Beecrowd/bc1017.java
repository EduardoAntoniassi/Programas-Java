import java.io.IOException;
import java.util.Scanner;
public class bc1017 {
 
    public static void main(String[] args) throws IOException {
 
      Scanner s = new Scanner(System.in);
      
      double vel = s.nextDouble();
      double tempo = s.nextDouble();
      
      double dist = (vel * tempo) / 12;
      
      System.out.printf("%.3f\n" ,dist);
      s.close();
    }
 
}