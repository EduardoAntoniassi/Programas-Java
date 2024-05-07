import java.io.IOException;
public class bc1097 {
 
    public static void main(String[] args) throws IOException {
 
        int set = 1;
        int jot = 7;
        int jot2 = 6;
        int jot3 = 5;
        
    for (int i = 0; i < 5; i++) {
     
     System.out.printf("I=%d J=%d\n" ,set ,jot);  
     System.out.printf("I=%d J=%d\n" ,set ,jot2);
     System.out.printf("I=%d J=%d\n" ,set ,jot3); 
     
     set = set + 2;
     jot = jot + 2;
     jot2 = jot2 + 2;
     jot3 = jot3 + 2;

    }
    }
 
}