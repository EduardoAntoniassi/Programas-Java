import java.util.Random;

public class ex2dia8 {
    public static void main(String[] args) {

        Random rand = new Random();

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", 
        "Setembro", "Outubro", "Novembro", "Dezembro"};

        int indice = rand.nextInt(12);

        String messorteado = meses[indice];
        System.out.println("Mês sorteado: " + messorteado);

    }
}
