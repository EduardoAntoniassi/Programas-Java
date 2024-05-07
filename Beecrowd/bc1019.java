import java.io.IOException;
import java.util.Scanner;
public class bc1019 {
 
    public static void main(String[] args) throws IOException {
 
       Scanner s = new Scanner(System.in);
       
       int seg = s.nextInt();
       
       int hora = seg / 3600;
       seg = seg % 3600;
       
       int min = seg / 60;
       seg = seg % 60;
       
       int qtdseg = seg;
       
       System.out.printf("%d:%d:%d\n" ,hora ,min ,qtdseg);
       s.close();
    }
 
}