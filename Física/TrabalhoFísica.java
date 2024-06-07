import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrabalhoFísica extends JFrame {
    private JTextField fallField;
    private JTextField distField;
    private JLabel timekeyLabel;
    private JLabel timeboatLabel;
    private JLabel velboatLabel;

    public TrabalhoFísica() {

        setTitle("EXECUÇÃO - QUESTÃO 53");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JOptionPane.showMessageDialog(null , 
        "Uma chave cai verticalmente de uma ponte que está 45 m acima da água.\n" +
        "A chave atinge um barco de brinquedo que está se movendo com velocidade constante e se encontrava a"+
        " 12 m do ponto de impacto quando a chave foi solta." +
        "\nQual é a velocidade do barco?\n\n" +
        "Valores de referência para teste.\n Queda: 45\n Distância: 12\n\n" + 
        "Resultados de Referência:\nTempo de queda da chave: 3,03\n" +
        "Tempo de percurso do barco: 3,03\n Velocidade do barco: 3,96"
        , "ENUNCIADO - QUESTÃO 53" , JOptionPane.INFORMATION_MESSAGE);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2, 5, 5));

        JLabel fallLabel = new JLabel("Altura da queda (m): ");
        fallField = new JTextField();

        JLabel distLabel = new JLabel("Distância até o barco (m): ");
        distField = new JTextField();

        inputPanel.add(fallLabel);
        inputPanel.add(fallField);
        inputPanel.add(distLabel);
        inputPanel.add(distField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));

        JButton calculateButton = new JButton("CALCULAR");
        calculateButton.addActionListener(new CalculateButtonListener());
        buttonPanel.add(calculateButton);

        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new GridLayout(3, 1, 5, 5));

        timekeyLabel = new JLabel("Tempo de queda da chave: ");
        timeboatLabel = new JLabel("Tempo de percurso do barco: ");
        velboatLabel = new JLabel("Velocidade do barco: ");

        outputPanel.add(timekeyLabel);
        outputPanel.add(timeboatLabel);
        outputPanel.add(velboatLabel);

        add(inputPanel);
        add(buttonPanel);
        add(outputPanel);
        setVisible(true);

    }

    private class CalculateButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {

                double fall = Double.parseDouble(fallField.getText());
                double dist = Double.parseDouble(distField.getText());
                double g = 9.8;

                double timekey = Math.sqrt((2 * fall) / g);
                double velboat = dist / timekey;
                double timeboat = timekey;

                timekeyLabel.setText(String.format("Tempo de queda da chave: %.2f s", timekey));
                timeboatLabel.setText(String.format("Tempo de percurso do barco: %.2f s", timeboat));
                velboatLabel.setText(String.format("Velocidade do barco: %.2f m/s", velboat));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "VALORES INVÁLIDOS", "ERRO", JOptionPane.ERROR_MESSAGE);
            
            }
        }
    }

    public static void main(String[] args) {
        new TrabalhoFísica();

    }
}
