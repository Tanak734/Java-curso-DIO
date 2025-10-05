public class motor {

    private int marcha;
    private int velocidade;
    private boolean ligaDesliga;

    public motor() {
        this.velocidade = 0;
        ligaDesliga = false;
    }

    public void retornarMarcha(){
        if (ligaDesliga == false) {
            System.out.println("Ligue o carro antes de começar\n");
        } else{

            if (velocidade < 0) {
                System.out.println("A marcha nao pode ser negativa\n");
            } else if (velocidade >= 0 && velocidade < 21) {
                marcha = 1;
                System.err.printf("Sua velocidade é de %s e voce está na %s° marcha\n", velocidade, marcha);
            } else if (velocidade >= 21 && velocidade < 41) {
                marcha = 2;
                System.err.printf("Sua velocidade é de %s e voce está na %s° marcha\n", velocidade, marcha);
            } else if (velocidade >= 41 && velocidade < 61) {
                marcha = 3;
                System.err.printf("Sua velocidade é de %s e voce está na %s° marcha\n", velocidade, marcha);
            } else if (velocidade >= 61 && velocidade < 81) {
                marcha = 4;
                System.err.printf("Sua velocidade é de %s e voce está na %s° marcha\n", velocidade, marcha);
            } else if (velocidade >= 81 && velocidade < 101) {
                marcha = 5;
                System.err.printf("Sua velocidade é de %s e voce está na %s° marcha\n", velocidade, marcha);
            } else if (velocidade >= 101 && velocidade < 121) {
                marcha = 6;
                System.err.printf("Sua velocidade é de %s e voce está na %s° marcha\n", velocidade, marcha);
            } else {
                System.out.println("Nao foi possivel determinar a sua velocidade\n");
            } 
        }   
    }

    public void ligarCarro(){
        if (ligaDesliga == false) {
            System.out.println("O carro esta desligado\n");
            System.out.println("Ligando...\n");
            System.out.println("O carro foi ligado\n");
            ligaDesliga = true;
        } else {
            System.out.println("O carro ja está ligado\n");
        }
    }
    
    public void desligarCarro(){
        if (velocidade == 0 && ligaDesliga == true) {
            System.out.println("O carro foi desligado\n");
            ligaDesliga = false;
        } else if (ligaDesliga == false) {
            System.out.println("O carro ja está desligado\n");
        }
        else {
            System.out.printf("Desacelere o carro ate a velocidade ser 0 | velocidade atual: %s \n", velocidade);
        }
    }

    public void checkCarro(){
        if (ligaDesliga == false) {
            System.out.println("O carro está desligado\n");
        } else {
            System.out.println("O carro esta ligado\n");
        }
    }

    public void acelerar(){
        if (ligaDesliga == false) {
            System.out.println("Ligue o carro antes de começar\n");
        } else{
            this.velocidade += 5;
            System.out.println("A valocidade foi aumentada em 5.\n");
        }
    }

    
    public void desacelerar(){
        if (ligaDesliga == false) {
            System.out.println("Ligue o carro antes de começar\n");
        } else{
            if (velocidade < 0) {
                velocidade = 0;
                System.out.println("A valocidade nao pode ser negativa.\n");
            } else{
                this.velocidade -= 5;              
                System.out.println("A valocidade foi diminuida em 5.\n");
            }
        }
    }


    public void checkVelocidade() {
        System.out.printf("A sua velocidade é %s\n", this.velocidade);
        
    }

    public void virarE() {
        if (ligaDesliga == false) {
            System.out.println("Ligue o carro antes de começar\n");
        } else{
            if (velocidade < 41){
                System.out.println("O carro esta virando para a esquerda\n");
            } else {
                System.out.println("O carro nao pode virar\n");
            }
        }
    }
    
    public void virarD(){
        if (ligaDesliga == false) {
            System.out.println("Ligue o carro antes de começar\n");
        } else {
            if (velocidade < 41){
                System.out.println("O carro esta virando para a direita\n");
            } else {
                System.out.println("O carro nao pode virar\n");
            }
        }
    }
}
