import javax.swing.JOptionPane;

public class ex3pooaula24 {
    
    public static void main(String[] args) {

        //Aluno: Eduardo Lourenço Antoniassi;
        
        for(int i = 3; i > 0; i--){

            String login = JOptionPane.showInputDialog("Digite seu login:");
            String senha = JOptionPane.showInputDialog("Digite sua senha:");

            if(login.equals("java8") && senha.equals("java8")){

                JOptionPane.showMessageDialog(null, "Login e senha aceitos");
                break;

            } else {

                JOptionPane.showMessageDialog(null, 
                
                "Falha, verifique login e senha!" +
                "\nVocê ainda tem " + (i - 1) + " tentativas");

            }

        }
    
    }
}
