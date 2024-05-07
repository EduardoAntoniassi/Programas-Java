import java.io.IOException;
import java.util.Scanner;
public class bc1020 {
 
    public static void main(String[] args) throws IOException {
 
       Scanner s = new Scanner(System.in);
       
       int btd = s.nextInt();
       
       int ano = btd / 365;
       btd = btd % 365;
       
       int mes = btd / 30;
       btd = btd % 30;
       
       int qtdbtd = btd;
       
       System.out.printf("%d ano(s)\n" , ano);
       System.out.printf("%d mes(es)\n" , mes);
       System.out.printf("%d dia(s)\n" , qtdbtd);
 
    }
 
}