import javax.swing.JOptionPane;

public class ex4pooaula24 {
    
    //Eduardo Lourenço Antoniassi;
    
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Digite um número para ver a tabuada:");
        int numero = Integer.parseInt(input);
    
        StringBuilder tabuada = new StringBuilder();

        for (int i = 1; i <= 10; i++) {

            tabuada.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");

        }

        JOptionPane.showMessageDialog(null, "Tabuada de " + numero + ":\n" + tabuada.toString());
        }
    
}
