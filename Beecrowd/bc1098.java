import java.io.IOException;
public class bc1098 {
 
    public static void main(String[] args) throws IOException {
 
        double set = 0;
        double jot = 1;
        double jot2 = 2;
        double jot3 = 3;
        
    for (int i = 0; i <= 10; i++) {
     
     System.out.printf("I=%f J=%.1f\n" ,set ,jot);  
     System.out.printf("I=%f J=%.1f\n" ,set ,jot2);
     System.out.printf("I=%f J=%.1f\n" ,set ,jot3); 
     
     set = set + 0.2;
     jot = jot + 0.2;
     jot2 = jot2 + 0.2;
     jot3 = jot3 + 0.2;

    }
    }
 
}