import javax.swing.JOptionPane;

    public class ex1pooaula24 {

    public static void main(String[] args) {

        //Aluno: Eduardo Lourenço Antoniassi;

        String produto = JOptionPane.showInputDialog("Insira o nome do produto:");
        String valor = JOptionPane.showInputDialog("Insira o valor do produto:");
        
        double produtoval = Double.parseDouble(valor);

          if (produtoval < 0) {
            JOptionPane.showMessageDialog(null, "Valor não válido!");

          } else if (produtoval >= 50 && produtoval < 200){

            double desconto = produtoval * 0.05;
            double novoValor = produtoval - desconto;

            JOptionPane.showMessageDialog(null,
                    "Nome do produto: " + produto + "\n" +
                            "Valor original do produto: R$" + produtoval+ "\n" +
                            "Valor do produto com desconto: R$" + novoValor);

          } else if (produtoval >= 200 && produtoval < 500){

            double desconto = produtoval * 0.06;
            double novoValor = produtoval - desconto;

            JOptionPane.showMessageDialog(null,
                    "Nome do produto: " + produto + "\n" +
                            "Valor original do produto: R$" + produtoval + "\n" +
                            "Valor do produto com desconto: R$" + novoValor);

          } else if (produtoval >= 500 && produtoval < 1000){

            double desconto = produtoval * 0.07;
            double novoValor = produtoval - desconto;

            JOptionPane.showMessageDialog(null,
                    "Nome do produto: " + produto + "\n" +
                            "Valor original do produto: R$" + produtoval + "\n" +
                            "Valor do produto com desconto: R$" + novoValor);

          } else if (produtoval >= 1000){

            double desconto = produtoval * 0.08;
            double novoValor = produtoval - desconto;

            JOptionPane.showMessageDialog(null,
                    "Nome do produto: " + produto + "\n" +
                            "Valor original do produto: R$" + produtoval + "\n" +
                            "Valor do produto com desconto: R$" + novoValor);

            }

     }

}
