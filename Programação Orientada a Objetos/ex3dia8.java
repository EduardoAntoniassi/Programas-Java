import javax.swing.JOptionPane;

public class ex3dia8 {
    public static void main(String[] args) {
     
        String[] opcoesIdioma = {"Português", "Inglês"};
        
        int idiomaEscolhido = JOptionPane.showOptionDialog(null, 
        "Escolha o idioma:", 
        "Selecionar Idioma",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesIdioma, opcoesIdioma[0]);

        if (idiomaEscolhido == JOptionPane.CLOSED_OPTION) {
            return; 
        }

        int numeroMes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mês (1-12):"));

        String mesPorExtenso = getMesPorExtenso(numeroMes, idiomaEscolhido);
        JOptionPane.showMessageDialog(null, "O mês é: " + mesPorExtenso);
        
    }

    public static String getMesPorExtenso(int numeroMes, int idioma) {
        String[][] meses = {
            
            {"Janeiro", "Fevereiro", "Março", "Abril",
            "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"},
            
            {"January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"}
        };

        if (numeroMes < 1 || numeroMes > 12) {
            return "Mês inválido";
        }

        return meses[idioma][numeroMes - 1];
    }
}