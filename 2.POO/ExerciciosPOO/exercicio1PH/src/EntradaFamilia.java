public class EntradaFamilia extends Ingresso {

    private int qntPessoas;

    public EntradaFamilia(String nomeFilme, double valorFilme, boolean condicaoDublado, int qntPessoas){
        super(nomeFilme, valorFilme, condicaoDublado);
        this.qntPessoas = qntPessoas;
    }

    @Override
    public void retornoValor(){
        var dublado = condicaoDublado == true ? "dublado" : "legendado";
        var calculo = valorFilme * qntPessoas;
        if (qntPessoas > 3) {
            calculo *= 0.95;
            System.out.println("Um desconto de 5% foi aplicado");
            System.out.printf("O filme %s %s ira custar R$ %s ", nomeFilme, dublado, calculo);
        } else {
            System.out.printf("O filme %s %s ira custar R$ %s ", nomeFilme, dublado, calculo);
        }
    }
}
