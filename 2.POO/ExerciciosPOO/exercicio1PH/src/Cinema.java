public class Cinema {
    public static void main(String[] args) {
        var ingME1 = new MeiaEntrada(44.5,"blade runner 2049", false);
        var ingME2 = new MeiaEntrada(10.5,"Kung foo panda", true);
        var ingEF1 = new EntradaFamilia("Os sem floresta", 43.2, true, 2);        
        var ingEF2 = new EntradaFamilia("Kimetsu: castelo infinito", 100, false, 5);

        System.out.println(ingME1.retornoValor());
        System.out.println(ingME2.retornoValor());
        System.out.println(ingEF1.retornoValor());
        System.out.println(ingEF2.retornoValor());

    }
}
