import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class mostraimagem {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Mostrar e Ocultar Imagem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null); 
        
        
        JButton showButton = new JButton("Mostrar");
        showButton.setBounds(150, 10, 100, 30);
        
        JButton hideButton = new JButton("Ocultar");
        hideButton.setBounds(260, 10, 100, 30); 
        
        
        JLabel imageLabel = new JLabel();
        ImageIcon icon = new ImageIcon("\"C:\\Users\\Eduar\\OneDrive\\Área de Trabalho\\Faculdade\\2º ano\\Linguagens Orientadas a Objetos\\javiris.png\""); // Insira o caminho para a sua imagem
        imageLabel.setIcon(icon);
        imageLabel.setBounds(200, 200, icon.getIconWidth(), icon.getIconHeight());
        imageLabel.setVisible(false); 
        
        
        Random random = new Random();
        showButton.addActionListener(e -> {
            int x = random.nextInt(frame.getWidth() - icon.getIconWidth());
            int y = random.nextInt(frame.getHeight() - icon.getIconHeight() - 50);
            imageLabel.setBounds(x, y, icon.getIconWidth(), icon.getIconHeight());
            imageLabel.setVisible(true);
        });

        hideButton.addActionListener(e -> imageLabel.setVisible(false));
        
       
        frame.add(showButton);
        frame.add(hideButton);
        frame.add(imageLabel);
        
        
        frame.setVisible(true);
    }
}
