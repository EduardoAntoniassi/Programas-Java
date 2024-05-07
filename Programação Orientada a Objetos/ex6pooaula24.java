import javax.swing.JOptionPane;

public class ex6pooaula24 {

    //Aluno: Eduardo Lourenço Antoniassi;
    
    public static void main(String[] args) {

    String frase = JOptionPane.showInputDialog("Digite uma frase: ");

    if(frase.contains("sexo") || frase.contains("sexual")){

        JOptionPane.showMessageDialog(null, "Conteúdo impróprio");

    }else{

        JOptionPane.showMessageDialog(null, "Conteúdo liberado");
        
    }

    }

}
