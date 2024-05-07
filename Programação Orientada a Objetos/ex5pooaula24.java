import javax.swing.JOptionPane;

public class ex5pooaula24 {
    
    //Aluno: Eduardo Lourenço Antoniassi;
    
    public static void main(String[] args) {
        
    String frase = JOptionPane.showInputDialog("Digite uma frase:");
    String fraseSemEspacos = frase.replace(" ", "");
    String fraseInvertida = inverterFrase(fraseSemEspacos);

    JOptionPane.showMessageDialog(null, "Frase Fornecida: " + frase +
    "\nFrase de trás pra frente: " + fraseInvertida);

    }

    private static String inverterFrase(String frase) {
        StringBuilder fraseInvertida = new StringBuilder();
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida.append(frase.charAt(i));
        }
        
        return fraseInvertida.toString();

    }

}
