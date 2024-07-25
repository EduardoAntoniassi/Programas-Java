import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mudacorbotao {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Muda cor do botão");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.getContentPane().setBackground(Color.YELLOW);
        
        
        JButton button = new JButton("Trocar");
        button.setPreferredSize(new Dimension(100, 50));
        
        
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(Color.ORANGE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(UIManager.getColor("control"));
            }
        });
        
        frame.getContentPane().setLayout(new GridBagLayout());
        frame.getContentPane().add(button);

        frame.setVisible(true);
    }
}
