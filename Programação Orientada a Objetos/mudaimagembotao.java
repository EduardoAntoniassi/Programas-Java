import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mudaimagembotao {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Mostra Imagem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());
        
        JButton button = new JButton("Passe o mouse");
        button.setPreferredSize(new Dimension(150, 50));
        
        JLabel imageLabel = new JLabel();
        ImageIcon icon = new ImageIcon("\"C:\\Users\\Eduar\\OneDrive\\Área de Trabalho\\Faculdade\\2º ano\\Linguagens Orientadas a Objetos\\javiris.png\""); // Insira o caminho para a sua imagem
        imageLabel.setIcon(icon);
        imageLabel.setVisible(false);
        
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                imageLabel.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                imageLabel.setVisible(false);
            }
        });

        frame.add(button, BorderLayout.NORTH);
        frame.add(imageLabel, BorderLayout.CENTER);
        
        frame.setVisible(true);
    }
}
