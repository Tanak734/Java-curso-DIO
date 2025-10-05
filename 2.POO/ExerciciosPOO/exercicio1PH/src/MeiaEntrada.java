public class MeiaEntrada extends Ingresso {
    
    public MeiaEntrada(double valorFilme, String  nomeFilme, boolean condicaoDublado){
        super(nomeFilme, valorFilme, condicaoDublado);
    }

    @Override
    public void retornoValor() {
        var calculo = valorFilme/2;
        var dublado = condicaoDublado == true ? "O filme é dublado" : "O filme é legendado";

        System.out.printf("O filme %s custa R$ %s e %s", nomeFilme, calculo, dublado);
    }
}
