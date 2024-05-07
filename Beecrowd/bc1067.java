import java.io.IOException;
import java.util.Scanner;
public class bc1067 {
 
    public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    
    int impar = s.nextInt();
    for (int i = 0; i <= impar; i++) {
        if (i % 2 != 0) {
            System.out.println(i);
        }
    }
    }
 
}