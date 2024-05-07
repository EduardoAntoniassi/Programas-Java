import javax.swing.JOptionPane;

public class ex7pooaula24 {
    
            //Aluno: Eduardo Lourenço Antoniassi;
            
            public static void main(String[] args) {
                exibirMenu();

            }
        
            public static void exibirMenu() {
                String[] opcoes = {
                        "Exercício 1",
                        "Exercício 2",
                        "Exercício 3",
                        "Exercício 4",
                        "Exercício 5",
                        "Exercício 6",

                };
        
                String escolha = (String) JOptionPane.showInputDialog(null,
                        "Escolha um exercício para executar:",
                        "Menu de Exercícios",
                        JOptionPane.QUESTION_MESSAGE,null, opcoes, opcoes[0]);
        
                if (escolha != null) {

                    switch (escolha) {
                        case "Exercício 1":
                            exercicio1();
                            break;

                        case "Exercício 2":
                            exercicio2();
                            break;

                        case "Exercício 3":
                            exercicio3();
                            break;

                        case "Exercício 4":
                            exercicio4();
                            break;

                        case "Exercício 5":
                            exercicio5();
                            break;

                        case "Exercício 6":
                            exercicio6();
                            break;

                    }

                } else {
                    JOptionPane.showMessageDialog(null, 
                    "Nenhuma opção foi selecionada.");

                }
            }
        
            public static void exercicio1() {
                JOptionPane.showMessageDialog(null, "Você escolheu o Exercício 1!");

                String nome = JOptionPane.showInputDialog("Nome do produto: ");
                double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da produto: "));
                double valorDesconto;
        
                if(valor >= 50 && valor < 200){
                    valorDesconto = valor - valor * 0.05;
                }
        
                else if(valor >= 200 && valor < 500){
                    valorDesconto = valor - valor * 0.06;
                }
        
                else if(valor >= 500 && valor < 1000){
                    valorDesconto = valor - valor * 0.07;
                }
        
                else{
                    valorDesconto = valor - valor * 0.08;
                }
        
                JOptionPane.showMessageDialog(null, 
                        
                        "Nome do produto: " + nome +
                        "\nValor original do produto: R$" + valor +
                        "\nValor do produto com desconto: R$" + valorDesconto);
        
                    System.exit(0);
            }
        
            // Função para o Exercício 2
            public static void exercicio2() {

                JOptionPane.showMessageDialog(null, "Você escolheu o Exercício 2!");
                int[] resistencias = new int[4];
        
                for(int i = 0; i < resistencias.length; i++){
        
                    String entrada = JOptionPane.showInputDialog("Insira a resistência do " + (i + 1) + " reistor");
                    resistencias[i] = Integer.parseInt(entrada);
        
                }
        
                int menor = resistencias[0];
                int maior = resistencias[0];
        
                for(int i = 1; i < resistencias.length; i++){
        
                    if (resistencias[i] < menor) {
                        menor = resistencias[i];
                    }
                    if (resistencias[i] > maior) {
                        maior = resistencias[i];
                    }
        
                }
        
                int sumresistencia = 0;
        
                for(int i = 0; i < resistencias.length; i++) {
        
                    sumresistencia += resistencias[i];
                }
        
                JOptionPane.showMessageDialog(null,
        
                        "A menor resistência é: " + menor +
                        "\nA maior resistência é: " + maior +
                        "\nA resistência equivalente é: " + sumresistencia);

                System.exit(0);
            }
        
            // Função para o Exercício 3
            public static void exercicio3() {
                JOptionPane.showMessageDialog(null, "Você escolheu o Exercício 3!");
                
                for(int i = 3; i > 0; i--){

                    String login = JOptionPane.showInputDialog("Digite seu login:");
                    String senha = JOptionPane.showInputDialog("Digite sua senha:");
        
                    if(login.equals("java8") && senha.equals("java8")){
        
                        JOptionPane.showMessageDialog(null, "Login e senha aceitos");
                        break;
        
                    } else {
        
                        JOptionPane.showMessageDialog(null, 
                        
                        "Falha, verifique login e senha!" +
                        "\nVocê ainda tem " + (i - 1) + " tentativas");
        
                    }
        
                }
        
                System.exit(0);
            }
        
            // Função para o Exercício 4
            public static void exercicio4() {
                JOptionPane.showMessageDialog(null, "Você escolheu o Exercício 4!");

                String input = JOptionPane.showInputDialog("Digite um número para ver a tabuada:");
                int numero = Integer.parseInt(input);
        
                StringBuilder tabuada = new StringBuilder();

                for (int i = 1; i <= 10; i++) {
                    tabuada.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");

                }

                JOptionPane.showMessageDialog(null, "Tabuada de " + numero + ":\n" + tabuada.toString());
                System.exit(0);
            }
        
            // Função para o Exercício 5
            public static void exercicio5() {
                JOptionPane.showMessageDialog(null, "Você escolheu o Exercício 5!");

                String frase = JOptionPane.showInputDialog("Digite uma frase:");
                String fraseSemEspacos = frase.replace(" ", "");
                String fraseInvertida = inverterFrase(fraseSemEspacos);

                JOptionPane.showMessageDialog(null, "Frase Fornecida: " + frase + 
                "\nFrase de trás pra frente: " + fraseInvertida);

            }

            private static String inverterFrase(String frase) {
            StringBuilder fraseInvertida = new StringBuilder();

            for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida.append(frase.charAt(i));

            }

            return fraseInvertida.toString();
            }
        
            // Função para o Exercício 6
            public static void exercicio6() {
                JOptionPane.showMessageDialog(null, "Você escolheu o Exercício 6!");
                String frase = JOptionPane.showInputDialog("Digite uma frase: ");

                if(frase.contains("sexo") || frase.contains("sexual")){
                JOptionPane.showMessageDialog(null, "Conteúdo impróprio");

                } else {
                JOptionPane.showMessageDialog(null, "Conteúdo liberado");
                    
                }
                System.exit(0);

            }

}

