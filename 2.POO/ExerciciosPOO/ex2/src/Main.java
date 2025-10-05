import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int opcao;
        
        // System.err.println("Defina a velocidade inicial do carro");
        // int velocidadeInicial = scanner.nextInt();
        // var carro1 = new motor(velocidadeInicial);

        var carro = new motor();

        do {
            System.out.println("======= Digite uma das opções abaixo ======");
            System.out.println("1 - Ligar carro");
            System.out.println("2 - Desligar carro");
            System.out.println("3 - Checar o carro");
            System.out.println("4 - Acelerar");
            System.out.println("5 - Desacelerar");
            System.out.println("6 - Checar a velocidade");
            System.out.println("7 - Checar a marcha");
            System.out.println("8 - Virar para a esquerda");
            System.out.println("9 - Virar para a direita");
            System.out.println("0 - Sair");
            
            opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        carro.ligarCarro();
                        break;
                    case 2:
                        carro.desligarCarro();
                        break;
                    case 3: 
                        carro.checkCarro();
                        break;
                    case 4:
                        carro.acelerar();
                        break;
                    case 5:
                        carro.desacelerar();
                        break;
                    case 6:
                        carro.checkVelocidade();
                        break;
                    case 7:
                        carro.retornarMarcha();
                        break;
                    case 8:
                        carro.virarE();
                        break;
                    case 9:
                        carro.virarD();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Nao foi possivel determinar essa opção");
           } 
        } while (opcao != 0);

        scanner.close();
    }
}
