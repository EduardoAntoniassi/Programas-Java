import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

public class atendimento {

    public static void main(String[] args) {
    
        JFrame frame = new JFrame("Mensagem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        LocalDateTime agora = LocalDateTime.now();
        int diaDaSemana = agora.getDayOfWeek().getValue();
        int hora = agora.getHour();
        
        String mensagem;
        if (diaDaSemana >= 1 && diaDaSemana <= 5 && hora >= 8 && hora < 17) {
            mensagem = "Estamos Atendendo";
        } else {
            mensagem = "Expediente Encerrado";
        }
        
        String texto = String.format("%s - %dh - %s", agora.getDayOfWeek(), agora.getHour(), mensagem);
        
        JLabel label = new JLabel(texto, JLabel.CENTER);
        frame.add(label, BorderLayout.CENTER);
        
        JButton okButton = new JButton("OK");
        okButton.addActionListener(e -> System.exit(0));
        frame.add(okButton, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }
}
