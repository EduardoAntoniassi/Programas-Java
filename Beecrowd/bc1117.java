import java.io.IOException;
import java.util.Scanner;
public class bc1117 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    double validada = 0;
    double notavalida = 0;
    
    while(validada != 2) {
        
        double nota1 = s.nextDouble();
        
        if(nota1 >= 0 && nota1 <= 10) {
            notavalida += nota1;
            validada += 1;
            
        } else {
            System.out.println("nota invalida");
            
        }
    }
    
    double media = notavalida / 2;
    System.out.printf("media = %.2f\n" ,media);
    }
 
}