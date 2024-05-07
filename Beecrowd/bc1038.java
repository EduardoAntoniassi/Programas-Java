import java.io.IOException;
import java.util.Scanner;
public class bc1038 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        
        int cod = s.nextInt();
        int qua = s.nextInt();
        
        if (cod == 1){
            double cq = qua * 4.00;
            System.out.printf("Total: R$ %.2f\n" ,cq);
       
        } else if (cod == 2) {
            double xs = qua * 4.50;
            System.out.printf("Total: R$ %.2f\n" ,xs);
            
        } else if (cod == 3) {
            double xb = qua * 5.00;
            System.out.printf("Total: R$ %.2f\n" ,xb);
            
        } else if (cod == 4) {
            double ts = qua * 2.00;
            System.out.printf("Total: R$ %.2f\n" ,ts);
            
        } else if (cod == 5) {
            double rf = qua * 1.50;
            System.out.printf("Total: R$ %.2f\n" ,rf);
        }
    }
 
}