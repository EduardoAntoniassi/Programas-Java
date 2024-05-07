import java.io.IOException;
public class bc1095 {
 
    public static void main(String[] args) throws IOException {
 
        int set;
        set = 1;
        
        int jot;
        jot = 60;
        
    for (int i = 0; i <= 12; i++) {
     
     System.out.printf("I=%d J=%d\n" ,set ,jot);  
     
     set = set + 3;
     jot = jot - 5;
    }
    }
 
}