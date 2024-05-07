import java.io.IOException;
import java.util.Scanner;
public class bc1094 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    int qtd = s.nextInt();
    String animal;
    
    for (int i = 0; i <= qtd; i++) {
      int x = s.nextInt();
      animal = s.next();
  
    int total = x;
    int totalratos;
    int totalcoelhos;
    int totalsapos; 
    

     
      if (animal.equals("R")) {
         totalratos = x;
         double porcentr = (totalratos * 100) / total;
         System.out.printf("Total de ratos: %d\n" ,totalratos);
         System.out.printf("Percentual de ratos: %.2f\n" ,porcentr);

      } else if (animal.equals("S")) {
         totalsapos = x;
         double porcents = (totalsapos * 100) / total;
         System.out.printf("Total de sapos: %d\n" ,totalsapos); 
         System.out.printf("Percentual de sapos: %.2f\n" ,porcents);

      } else if (animal.equals("C")) {
         totalcoelhos = x;
         double porcentc = (totalcoelhos * 100) / total;
         System.out.printf("Total de coelhos: %d\n" ,totalcoelhos);
         System.out.printf("Percentual de coelhos: %.2f\n" ,porcentc);

      }

       System.out.printf("Total: %d cobaias\n" ,total);
      
       //System.out.printf("Total: %d cobaias\n" ,total);
       //System.out.printf("Total de coelhos: %d\n" ,totalcoelhos);
       //System.out.printf("Total de ratos: %d\n" ,totalratos);
       //System.out.printf("Total de sapos: %d\n" ,totalsapos);
       //System.out.printf("Percentual de coelhos: %.2f %\n" ,porcentc);
       //System.out.printf("Percentual de ratos: %.2f %\n" ,porcentr);
       //System.out.printf("Percentual de sapos: %.2f %\n" ,porcents);
 
    }
     
    }
 
}       
      