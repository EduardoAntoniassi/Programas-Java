import javax.swing.JOptionPane;

public class ex3dia8 {
    public static void main(String[] args) {
        
        //Aluno: Eduardo Lourenço Antoniassi;
        
        String[] opcoesIdioma = {"Português", "Inglês"};
        
        int idiomaescolhido = JOptionPane.showOptionDialog(null, "Escolha o idioma:", "Selecionar Idioma",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesIdioma, opcoesIdioma[0]);

        if (idiomaescolhido == JOptionPane.CLOSED_OPTION) {
            return; 

        }

        int messelecionado = Integer.parseInt(JOptionPane.showInputDialog("Forneça o número do mês:"));

        String mesPorExtenso = getMesPorExtenso(messelecionado, idiomaescolhido);

        if(idiomaescolhido == 0){
            JOptionPane.showMessageDialog(null, "Idioma: Português\nO mês é: " + messelecionado + " - " + mesPorExtenso);

        } else if (idiomaescolhido == 1){
            JOptionPane.showMessageDialog(null, "Idioma: Inglês\nO mês é: " + messelecionado + " - " + mesPorExtenso);
        }
        
    }

    public static String getMesPorExtenso(int messelecionado, int idioma) {
        String[][] meses = {
           
            {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", 
            "Outubro", "Novembro", "Dezembro"},
            
            {"January", "February", "March", "April", "May", "June", "July", "August", "September", 
            "October", "November", "December"}
        };

        if (messelecionado < 1 || messelecionado > 12) {
            return "Mês inválido";
        }

        return meses[idioma][messelecionado - 1];
    }
}