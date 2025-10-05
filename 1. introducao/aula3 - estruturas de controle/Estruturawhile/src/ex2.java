
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu peso em kg");
        float peso = scanner.nextFloat();
        
        System.out.println("Insira seu altura em metros");
        float altura = scanner.nextFloat();
        
        float IMC = (peso/(altura * altura));

        System.out.printf("Seu IMC: %.2f ", IMC);

        if (IMC <= 18.5) {
            System.out.println("abaixo do peso");
        }
        else if ( IMC > 18.5 && IMC <= 24.9) {
            System.out.println("Peso ideal");
        }
        else if (IMC > 24.9 && IMC <= 29.9) {
            System.out.println("Levemente acima do peso");
        }
        else if (IMC > 29.9 && IMC <= 34.9) {
            System.out.println("Obesidade grau 1");
        }
        else if (IMC > 34.9 && IMC <= 39.9) {
            System.out.println("Obesidade grau 2 (severa)");
        }
        else {
            System.out.println("Obesidade grau 3 (morbida)");
        }
    }
}
