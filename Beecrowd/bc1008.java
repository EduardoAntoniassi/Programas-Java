import java.io.IOException;
import java.util.Scanner;
public class bc1008 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    int n = s.nextInt();
    int h = s.nextInt();
    double o = s.nextDouble();
    
    double SALARY = o * h;
    
    System.out.printf("NUMBER = %d\n" ,n);
    System.out.printf("SALARY = U$ %.2f\n" ,SALARY);
    s.close();
    }
 
}