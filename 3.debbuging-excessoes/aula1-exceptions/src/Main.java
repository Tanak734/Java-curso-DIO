


public class Main {
    public static void main(String[] args) {
            String frase = "teste";
            String novaFrase = null;
            try {
                novaFrase = frase.toUpperCase();
            }
            catch(NullPointerException e) {
                //TRATAMENTO DA exceção
                System.out.println("O frase inicial está nula, para solucional tal o problema, foi lhe atribuito um valor default.");
                frase = "123";
                novaFrase = frase.toUpperCase();
            }
            System.out.println("Frase antiga: "+frase);
            System.out.println("Frase nova: "+novaFrase);
    }
}