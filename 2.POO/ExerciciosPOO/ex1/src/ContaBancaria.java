public class ContaBancaria {

    private double saldo; // dinheiro real
    private double valorUsadoChequeEspecial;  // Quanto ja foi usado do cheque especial
    private double limiteChequeEspecial; // limite adicional que o banco oferece




    public ContaBancaria(double depositoInicial) {
        if (depositoInicial < 0) {
            System.out.println("nao é possivel adiconar valores negativos");
        }
        this.saldo = depositoInicial;

        if (depositoInicial <= 500){
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }
        this.valorUsadoChequeEspecial = 0;
    }

    public void depositarDinheiro(double valor){
        if (valor <= 0) {
            System.out.println("\nNão é possivel depositar valores negativos ou valor igual a 0");
        } 
        if (valorUsadoChequeEspecial > 0) {
            double taxa = valor * 0.2;
            double valorDisponivel = valor - taxa;
            System.err.printf("Como voce usou o cheque especial, o valor para pagar é de %s", valorDisponivel);

            if (valorDisponivel >= 0) {
                System.out.printf("A taxa de 20% sobre o cheque especial ultilizado é de %.2f R$", taxa);
                valor += valorDisponivel;
                valorUsadoChequeEspecial = 0;
            } else {
                valorUsadoChequeEspecial -= (valor/0.2);
                System.out.printf("A parte da taxa do cheque especial paga é: %.2f", valor);
            }
        } else {
            saldo += valor;
        }

        System.out.printf("Deposito de %.2f R$  foi realizado com sucesso", valor);
    }

    public void consultarSaldo(){
        if (saldo < 0) {
            this.saldo = 0;
        }
        System.out.printf("\nO seu saldo é de %.2f R$", saldo);
    }
 
    public void consultarChequeEspecial (){
        System.out.printf("\nO seu valor disponivel de cheque especial é de %.2f R$", limiteChequeEspecial);
    }
    
    public void sacarDinheiro(double valor){
        if (valor <= 0) {
            System.out.println("O saque nao pode ser negativo e nem 0");
        }

        double disponivel = this.saldo + this.limiteChequeEspecial;

        if (valor > disponivel){
            System.out.println("ERRO: Saldo e Limite insuficientes para o saque");
            return;
        }
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            double valorUsarCheque = valor - saldo;
            this.saldo = 0;
            valorUsadoChequeEspecial += valorUsarCheque;
        }
        
        System.out.printf("Saque de %.2f R$ foi realizado com sucesso", valor);
    }


    public void pagarBoleto(double valor) {
        sacarDinheiro(valor);
    }


    public boolean checarUsoChequeEspecial() {
        return valorUsadoChequeEspecial > 0;
    }

    public void checkCheque() {
        if (checarUsoChequeEspecial()) {
            System.out.println("Voce esta usando o cheque especial");
        } else {
            System.out.println("Voce nao esta usando o cheque especial");
        }
    }
}
