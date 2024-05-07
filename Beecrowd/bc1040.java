import java.io.IOException;
import java.util.Scanner;
public class bc1040 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        
        double N1 = s.nextDouble();
        double N2 = s.nextDouble();
        double N3 = s.nextDouble();
        double N4 = s.nextDouble();
        
        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
        
        System.out.printf("Media: %.1f\n" ,media);
        
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.\n");
            
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.\n");
            
        } else {
            System.out.println("Aluno em exame.");
            
            double N5 = s.nextDouble();
            
            double mediaex = (N5 + media) / 2;
            System.out.printf("Nota do exame: %.1f\n" ,N5);
            
            if (mediaex >= 5.0) {
            System.out.println("Aluno aprovado.");
            System.out.printf("Media final: %.1f" ,mediaex);
            
            } else if (mediaex <= 4.9) {
              System.out.println("Aluno reprovado.");
              System.out.printf("Media final: %.1f" ,mediaex);  
            }
        }
    }
 
}