import java.io.IOException;
import java.util.Scanner;
public class bc1021 {
 
    public static void main(String[] args) throws IOException {
 
       Scanner s = new Scanner(System.in);
       
       double valinf = s.nextDouble();
       int val = 0;

       System.out.println("NOTAS:");
       
       val = (int) valinf / 100;
       System.out.printf("%d nota(s) de R$ 100.00\n" ,val);
       valinf = valinf % 100.0;

       val = (int) valinf / 50;
       System.out.printf("%d nota(s) de R$ 50.00\n" ,val);
       valinf = valinf % 50.0;

       val = (int) valinf / 20;
       System.out.printf("%d nota(s) de R$ 20.00\n" ,val);
       valinf = valinf % 20.0;

       val = (int) valinf / 10;
       System.out.printf("%d nota(s) de R$ 10.00\n" ,val);
       valinf = valinf % 10.0;

       val = (int) valinf / 5;
       System.out.printf("%d nota(s) de R$ 5.00\n" ,val);
       valinf = valinf % 5.0;

       val = (int) valinf / 2;
       System.out.printf("%d nota(s) de R$ 2.00\n" ,val);
       valinf = valinf % 2.0;

       valinf = valinf * 100.0;
       System.out.println("MOEDAS:");

       val = (int) valinf / 100;
       System.out.printf("%d moeda(s) de R$ 1.00\n" ,val);
       valinf = valinf % 100.0;

       val = (int) valinf / 50;
       System.out.printf("%d moeda(s) de R$ 0.50\n" ,val);
       valinf = valinf % 50.0;

       val = (int) valinf / 25;
       System.out.printf("%d moeda(s) de R$ 0.25\n" ,val);
       valinf = valinf % 25.0;

       val = (int) valinf / 10;
       System.out.printf("%d moeda(s) de R$ 0.10\n" ,val);
       valinf = valinf % 10.0;

       val = (int) valinf / 5;
       System.out.printf("%d moeda(s) de R$ 0.05\n" ,val);
       valinf = valinf % 5.0;

       val = (int) valinf / 1;
       System.out.printf("%d moeda(s) de R$ 0.01\n" ,val);
       valinf = valinf % 1.0;
    }
 
}