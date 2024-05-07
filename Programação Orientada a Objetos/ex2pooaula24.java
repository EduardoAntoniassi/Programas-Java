import javax.swing.JOptionPane;

public class ex2pooaula24 {
    
    public static void main(String[] args) {
        
        //Aluno: Eduardo Lourenço Antoniassi;
        
        int[] resistencias = new int[4];

        for(int i = 0; i < resistencias.length; i++){

        String entrada = JOptionPane.showInputDialog("Insira a resistência do " + (i + 1) + "º reistor");
        resistencias[i] = Integer.parseInt(entrada);

        }

        int menor = resistencias[0];
        int maior = resistencias[0];

        for(int i = 1; i < resistencias.length; i++){

            if (resistencias[i] < menor) {
                menor = resistencias[i];
            }

            if (resistencias[i] > maior) {
                maior = resistencias[i];
            }

        }

        int sumresistencia = 0;

        for(int i = 0; i < resistencias.length; i++) {

            sumresistencia += resistencias[i];
        }

        JOptionPane.showMessageDialog(null, 
            
            "A menor resistência é: " + menor + 
            "\nA maior resistência é: " + maior +
            "\nA resistência equivalente é: " + sumresistencia);

    }

}
