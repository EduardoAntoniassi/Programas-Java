import java.io.IOException;
import java.util.Scanner;
public class bc1018 {
 
    public static void main(String[] args) throws IOException {
 
      Scanner s = new Scanner(System.in);
      
      int v = s.nextInt();
      
    System.out.printf("%d\n" ,v);
	System.out.printf("%d nota(s) de R$ 100,00\n" ,v/100);
	v = v % 100;
	
	System.out.printf("%d nota(s) de R$ 50,00\n" ,v/50);
	v = v % 50;
	
	System.out.printf("%d nota(s) de R$ 20,00\n" ,v/20);
	v = v % 20;
	
	System.out.printf("%d nota(s) de R$ 10,00\n" ,v/10);
	v = v % 10;
	
	System.out.printf("%d nota(s) de R$ 5,00\n" ,v/5);
	v = v % 5;
	
	System.out.printf("%d nota(s) de R$ 2,00\n" ,v/2);
	v = v % 2;
	
	System.out.printf("%d nota(s) de R$ 1,00\n" ,v/1);
	v = v % 1;
	
    }
 
}