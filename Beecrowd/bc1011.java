import java.io.IOException;
import java.util.Scanner;
public class bc1011 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    double R = s.nextDouble();
    double pi = 3.14159;
    double VOL = (4 / 3.0) * pi * (R * R * R);
    
    System.out.printf("VOLUME = %.3f\n" ,VOL);
    
    }
}