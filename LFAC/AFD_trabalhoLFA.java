//Importação do Scanner para armazenamento de váriaveis e Java Swing para exibição em tela
import java.util.Scanner;

public class AFD_trabalhoLFA {
    public static void main(String[] args) {
    
        //Cadastro do Scanner e Váriaveis
        Scanner sc = new Scanner(System.in);
        int estadoinicial, qtdestados, qtdsimbol, qtdestadosfinais;
        int invalidsimbols = 0;
    
        //Inserção do Estado Inicial
        System.out.println("Insira o estado Inicial");
        estadoinicial = sc.nextInt();
        
        //Inserção da quantidade de estados
        System.out.println("Insira a quantidade de estados");
        qtdestados = sc.nextInt();

        //Inserção da quantidade de estados Finais
        System.out.println("Insira a quantidade de estados Finais");
        qtdestadosfinais = sc.nextInt();
        int[] estadofinal = new int[qtdestadosfinais];

        //Inserção do estado Final caso ele seja único
        if(qtdestadosfinais == 1){
            System.out.println("Insira o estado Final");
            estadofinal[0] = sc.nextInt();

        //Inserção dos estados Finais, caso não seja único
        } else if (qtdestadosfinais > 1){

            for(int i = 0; i < qtdestadosfinais; i++){

                //Diferentes tipos de pergunta para cada caso de quantidade, para ficar mais coerente com a situação
                if(i == 0){
                    System.out.println("Insira o primeiro estado Final:");
                    estadofinal[i] = sc.nextInt();
    
                } else if(i == (qtdestadosfinais - 1)) {
                    System.out.println("Insira o último estado Final:");
                    estadofinal[i] = sc.nextInt();
    
                } else {
                    System.out.printf("Insira o estado final %d" ,i);
                    estadofinal[i] = sc.nextInt();
                
                }
    
            }

        }

        //Inserção da quantidade de símbolos do alfabeto
        System.out.println("Insira a quantidade de símbolos do alfabeto");
        qtdsimbol = sc.nextInt();
        char[] simbol = new char[qtdsimbol];

        //Inserção dos respectivos símbolos
        for(int i = 0; i < qtdsimbol; i++){
            System.out.printf("Insira o símbolo %dº:\n" ,i+1);
            simbol[i] = sc.next().charAt(0);

        }

        //Exibição da Tabela de Transição por matriz
        System.out.println("===== TABELA DE TRANSIÇÃO =====");
        for (int i = 0; i < qtdestados + 1; i++){
            for(int j = 0, x = 0; j < qtdsimbol + 1; j++){

                //Anulação da posição 0,0 para dividir os simbolos dos estados em aparência de matriz
                if(i == 0){
                    if(i == j){
                        System.out.printf("%3c ", ' ');

                    //Escreve os simbolos em ordem pós posição 0,0
                    } else {
                        System.out.printf("%4c " ,simbol[x]);
                        x++;

                    }
                
                //Inserção dos estados em posição x,0, no qual pula horizontalmente a posição 0,0 e escreve os estados
                } else if(i > 0 && j == 0){
                    System.out.printf("%c%d%2c", 'Q', i, ' ');  

                //Escreve as posições de transição, caso x,y sejam diferentes de 0
                } else {
                    System.out.printf("%2d,%d ", i, j);

                }
            }
            //Divide a estética para ficar em forma de matriz
            System.out.println();

        }
        
        //Pede a inserção do valor das transições
        System.out.println("Preencha as transições:");
        int[][] transiçoes = new int[100][100];

        //Matriz para armazenamento das funções de transição
        for(int i = 1; i < qtdestados + 1; i++){
            for(int j = 1; j < qtdsimbol + 1; j++){
                System.out.printf("\n%d,%d: ", i, j);
                transiçoes[i][j] = sc.nextInt();

            }
        }

        System.out.println("===== NOVA TABELA DE TRANSIÇÃO =====");
        for (int i = 0; i < qtdestados + 1; i++){
            for(int j = 0, x = 0; j < qtdsimbol + 1; j++){

                //Anulação da posição 0,0 para dividir os simbolos dos estados em aparência de matriz
                if(i == 0){
                    if(i == j){
                        System.out.printf("%3c ", ' ');

                    //Escreve os simbolos em ordem pós posição 0,0
                    } else {
                        System.out.printf("%4c " ,simbol[x]);
                        x++;

                    }

                //Inserção dos estados em posição x,0, no qual pula horizontalmente a posição 0,0 e escreve os estados
                } else if(i > 0 && j == 0){
                    System.out.printf("%c%d%2c", 'Q', i, ' ');  

                //Escreve as posições de transição, caso x,y sejam diferentes de 0
                } else {
                    System.out.printf(" %3d ",transiçoes[i][j]);

                }
            }
            //Divide a estética para ficar em forma de matriz
            System.out.println();

        }
        
        System.out.println("\nDigite a palavra a ser testada:");
        String palavra = sc.next();

        // //Matriz de comparação das funções de transição para ver se é possível
        // for(int i = 1; i < palavra.length(); i++){
        //     char letra = palavra.charAt(i);

        // }

        // For de verificação se as letras da palavra entram de acordo com os símbolos diponibilizados anteriormente
        for(int i = 0; i < palavra.length(); i++){
            int indicesimbol = -1;

            for (int j = 0; j < qtdsimbol; j++) {
                if (palavra.charAt(i) == simbol[j]) {
                indicesimbol = j;

                } else {
                    invalidsimbols++;

                }
                
            }
            
            if (indicesimbol == -1) {
                System.out.printf("A palavra contém %d símbolos inválidos.\n" ,invalidsimbols);
                break;
                
            }
        }

        sc.close();

    }
}
