import java.util.Scanner;

public class teste {
 
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
     
    double a = s.nextDouble();
    double b = s.nextDouble();
    
    double divide = a / b;

    System.out.printf("Divide = %.2f" ,divide);
    
    s.close();
    
    }
 
}
