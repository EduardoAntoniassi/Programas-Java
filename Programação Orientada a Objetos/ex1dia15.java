public class ex1dia15 {

    //Aluno: Eduardo Lourenço Antoniassi;
    
    private boolean status;

    public ex1dia15() {
        this.status = false;

    }

    public void ligar(int tempo) {
  
        this.status = true;
        
        for (int i = tempo; i > 0; i--) {
            System.out.println("Bomba ligada. Tempo Restante: " + i + " segundos.");
            
            try {
                Thread.sleep(1000);
            
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
        
        desligar();

    }

    public void desligar() {
        this.status = false;
        System.out.println("Bomba desligada.");

    }

    public static void main(String[] args) {
        ex1dia15 bomba = new ex1dia15();
        bomba.ligar(5); 

    }
}