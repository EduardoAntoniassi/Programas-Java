import java.io.IOException;
import java.util.Scanner;
public class bc1048 {

    public static void main(String[] args) throws IOException {
 
      Scanner s = new Scanner(System.in);
      
      double sal = s.nextDouble();
      
      if (sal < 400.01 && sal > 0) {
          double neosal = sal + (sal * 0.15);
          System.out.printf("Novo salario: %.2f\n" ,neosal);
          System.out.printf("Reajuste ganho: %.2f\n" ,sal * 0.15);
          System.out.println("Em percentual: 15 %");
      
      } else if (sal < 800.01 && sal > 0) {
           double neosal = sal + (sal * 0.12);
          System.out.printf("Novo salario: %.2f\n" ,neosal);
          System.out.printf("Reajuste ganho: %.2f\n" ,sal * 0.12);
          System.out.println("Em percentual: 12 %");
     
      } else if (sal < 1200.01 && sal > 0) {
          double neosal = sal + (sal * 0.10);
          System.out.printf("Novo salario: %.2f\n" ,neosal);
          System.out.printf("Reajuste ganho: %.2f\n" ,sal * 0.10);
          System.out.println("Em percentual: 10 %");
     
      } else if (sal < 2000.01 && sal > 0) {
          double neosal = sal + (sal * 0.07);
          System.out.printf("Novo salario: %.2f\n" ,neosal);
          System.out.printf("Reajuste ganho: %.2f\n" ,sal * 0.07);
          System.out.println("Em percentual: 7 %");
      
      } else if (sal > 2000 && sal > 0) {
          double neosal = sal + (sal * 0.04);
          System.out.printf("Novo salario: %.2f\n" ,neosal);
          System.out.printf("Reajuste ganho: %.2f\n" ,sal * 0.04);
          System.out.println("Em percentual: 4 %");
      }
      s.close();
    }
}