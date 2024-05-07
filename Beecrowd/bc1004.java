import java.io.IOException;
import java.util.Scanner;
public class bc1004 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    int a = s.nextInt();
    int b = s.nextInt();
    int PROD = a * b;
    
    System.out.printf("PROD = %d\n" ,PROD);
    s.close();
    }
 
}