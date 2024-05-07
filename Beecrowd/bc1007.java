import java.io.IOException;
import java.util.Scanner;
public class bc1007 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    int d = s.nextInt();
    
    int DIFERENCA = ((a * b) - (c * d));
    
    System.out.printf("DIFERENCA = %d\n" ,DIFERENCA);
    s.close();
    }
 
}