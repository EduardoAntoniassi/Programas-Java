import java.io.IOException;
import java.util.Scanner;
public class bc1114 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    for(int i = 0; i <= 100; i++){
    
    int senha = s.nextInt();
    if(senha == 2002) {
        System.out.println("Acesso Permitido");
        break;
        
    } else {
        System.out.println("Senha Invalida");
        
    }
    }
    
    }
 
}