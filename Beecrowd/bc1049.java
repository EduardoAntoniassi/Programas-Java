import java.io.IOException;
import java.util.Scanner;
public class bc1049 {
 
    public static void main(String[] args) throws IOException {
 
     Scanner s = new Scanner(System.in);
      String ver, tip, pref; 
      ver = s.nextLine();
      tip = s.nextLine();
      pref = s.nextLine();
   
      if (ver.equalsIgnoreCase("vertebrado")) {
          if (tip.equalsIgnoreCase("ave")){
              if (pref.equalsIgnoreCase("carnivoro")){
                  System.out.println("aguia");
              } else {
                  System.out.println("pomba");
              }
          }
      }
       
       if (ver.equalsIgnoreCase("vertebrado")) {
          if (tip.equalsIgnoreCase("mamifero")){
              if (pref.equalsIgnoreCase("onivoro")){
                  System.out.println("homem");
              } else {
                  System.out.println("vaca");
              }
          }
       }
       
       if (ver.equalsIgnoreCase("invertebrado")) {
          if (tip.equalsIgnoreCase("inseto")){
              if (pref.equalsIgnoreCase("hematofago")){
                  System.out.println("pulga");
              } else {
                  System.out.println("lagarta");
              }
          }
       }
       
       if (ver.equalsIgnoreCase("invertebrado")) {
          if (tip.equalsIgnoreCase("anelideo")){
              if (pref.equalsIgnoreCase("hematofago")){
                  System.out.println("sanguessuga");
              } else {
                  System.out.println("minhoca");
              }
          }
       }
       s.close();
    }
}