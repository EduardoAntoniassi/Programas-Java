import java.io.IOException;
import java.util.Scanner;
public class bc1002 {
 
    public static void main(String[] args) throws IOException {
 
          Scanner s = new Scanner(System.in);
          
          double R = s.nextDouble();
          double n = 3.14159;
          double A = n * (R*R);
          
          System.out.printf("A=%.4f\n" ,A);
         s.close();
    }
 
}