import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        
        System.err.println("Digite a quantidade de valor inicial da conta");
        double deposito = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(deposito);

        int opcao;
        do {
            System.err.println("\n\n === Digite uma das opções abaixo ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar dinheiro");
            System.out.println("3 - Consultar Cheque Especial");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Checar Uso do Cheque");
            System.out.println("0 - Sair");
            
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Digite a quantidade de valor que sera depositado");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositarDinheiro(valorDeposito);
                    break;
                case 3:
                    conta.consultarChequeEspecial();
                    break;
                case 4:
                    System.out.println("Digite a quantidade de valor que sera sacado");
                    double valorSaque = scanner.nextDouble();
                    conta.sacarDinheiro(valorSaque);
                    break;
                case 5:
                    System.out.println("Digite a quantidade de valor do boleto");
                    double pagBoleto = scanner.nextDouble();
                    conta.pagarBoleto(pagBoleto);
                    break;
                case 6:
                    conta.checkCheque();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção nao valida");
            }
        } while (opcao != 0);

        scanner.close();
        
    }
}
