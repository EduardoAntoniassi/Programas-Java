import java.io.IOException;
import java.util.Scanner;
public class bc1075 {
 
    public static void main(String[] args) throws IOException {
 
      Scanner s = new Scanner(System.in);
      
	  int n = s.nextInt();
	  
	   for (int i = 1; i <= 10000; i++) {
	   	
	   	 if (i % n == 2) {
	   	 System.out.printf("%d\n" ,i);
         }
 
       }
   }
}