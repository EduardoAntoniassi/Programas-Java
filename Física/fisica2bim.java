import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Apresentação esboço do problema 45 da parte de Problemas Adicionais do Capítulo 21 do livro de Halliday, referente a Cargas Elétricas;
//Aluno: Eduardo Lourenço Antoniassi;
//C. COMP - UNESPAR - 2º ano - 2º Bimestre

public class fisica2bim {
    public static void main(String[] args) {

        int valmolecula = 2;  
        String vale = "1e";   

        double qtdmc = 1.00 * 6.02e23 * valmolecula * 1.60e-19;
        
        JFrame frame = new JFrame("Capítulo 21, Problema Adicional 45 - Cargas Elétricas");
        frame.setSize(600, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel enunciadoLabel = new JLabel("Quantos megacoulombs de carga elétrica positiva existem em 1,00 molde hidrogênio (H2) neutro?");
        enunciadoLabel.setBounds(10, 10, 600, 40);
        frame.add(enunciadoLabel);

        JLabel valmoleculaLabel = new JLabel("Valor da molécula: " + valmolecula + "p");
        valmoleculaLabel.setBounds(10, 60, 360, 25);
        frame.add(valmoleculaLabel);

        JLabel molLabel = new JLabel("Valor do mol: 6,02 * 10^23");
        molLabel.setBounds(10, 75, 360, 25);
        frame.add(molLabel);

        JLabel valpLabel = new JLabel("Valor de P: " + vale);
        valpLabel.setBounds(10, 90, 360, 25);
        frame.add(valpLabel);

        JLabel valeLabel = new JLabel("Valor de e: 1,60 * 10^-19");
        valeLabel.setBounds(10, 105, 360, 25);
        frame.add(valeLabel);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 140, 100, 25);
        frame.add(calcularButton);

        JLabel qtdmcLabel = new JLabel("Quantidade de MegaCoulombs: ");
        qtdmcLabel.setBounds(130, 140, 240, 25);
        frame.add(qtdmcLabel);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                qtdmcLabel.setText("Quantidade de MegaCoulombs: " + String.format("%.2e", qtdmc));
            }
        });

        frame.setVisible(true);
    }
}
