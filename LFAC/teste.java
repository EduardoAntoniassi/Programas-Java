import java.util.Scanner;

public class teste {
 
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
     
    System.out.println("Insira o Primeiro valor\n");
    double a = s.nextDouble();
    System.out.println("Insira o Segundo valor\n");
    double b = s.nextDouble();
    
    double divide = a / b;

    System.out.printf("Divide = %.2f" ,divide);
    
    s.close();

    }
 
}
