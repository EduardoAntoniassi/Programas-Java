import java.io.IOException;
import java.util.Scanner;
public class bc1066 {
 
    public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    
    int pares = 0;
    int impares = 0;
    int positivo = 0;
    int negativo = 0;        
    
    for (int i = 0; i < 5; i++){
     int ns = s.nextInt();
        if (ns % 2 == 0) {
            pares++;
            
        } if (ns % 2 != 0) {
            impares++;
            
        } if (ns > 0) {
            positivo++;
            
        } if (ns < 0) {
            negativo++;

        }
    }
      System.out.printf("%d valor(es) par(es)\n" ,pares);
      System.out.printf("%d valor(es) impar(es)\n" ,impares);
      System.out.printf("%d valor(es) positivo(s)\n" ,positivo);
      System.out.printf("%d valor(es) negativo(s)\n" ,negativo);
      s.close();
   }
}