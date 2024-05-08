import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ex1dia8 {
    public static void main(String[] args) {
        
        //Aluno: Eduardo Lourenço Antoniassi;
        
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];

        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Digite a nota do " + (i + 1) + "º aluno:");
            notas[i] = Double.parseDouble(input);
        }

        Arrays.sort(notas);
        double[] notasdescrescentes = new double[5];
        for (int i = 0; i < 5; i++) {
            notasdescrescentes[i] = notas[4 - i];

        }

        System.out.println("Notas em ordem decrescente:");
        for (double nota : notasdescrescentes) {
            System.out.println(nota);
        
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        
        }

        double media = soma / notas.length;
        System.out.println("Média das notas: " + media);
        
        sc.close();

    }
}
