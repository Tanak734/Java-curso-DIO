import java.math.BigDecimal;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valorCompra = scanner.nextLine();
        System.out.println(calcularDesconto(valorCompra));
        scanner.close();
    }

    public static String calcularDesconto(String valorCompra) {
        BigDecimal valor = new BigDecimal(valorCompra);
        BigDecimal descontoPercentual;
        
        BigDecimal range1 = new BigDecimal("50.00");
        BigDecimal range2 = new BigDecimal("100.00");
        

        // TODO: Verifique se o valor é menor que 50.00:
        if (valor.compareTo(range1) < 0) {
            descontoPercentual = BigDecimal.ZERO;
        }

        // TODO: Verifique se o valor é entre 50.00 e 100.00 (inclusive):
        else if (valor.compareTo(range1) >= 0 && valor.compareTo(range2) <= 0) {
            descontoPercentual = new BigDecimal("10");
        }

        // TODO: Caso contrário, o valor é maior que 100.00:
        else {
            descontoPercentual = new BigDecimal("20");
        }

        return "Desconto de " + descontoPercentual.intValue() + "%";
        
        // TODO: Retorne a string formatada com o desconto aplicado, conforme exigido no desafio:
        

    }
}