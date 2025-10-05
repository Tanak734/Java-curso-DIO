public abstract class Ingresso {
    protected String nomeFilme;
    protected double valorFilme;
    protected boolean condicaoDublado; // dublado ou legendado

    public Ingresso(String nomeFilme, double valorFilme, boolean tipoFilme){
        this.nomeFilme = nomeFilme;
        this.valorFilme = valorFilme;
        this.condicaoDublado = condicaoDublado;
    }
    
    public abstract void retornoValor();
    
}