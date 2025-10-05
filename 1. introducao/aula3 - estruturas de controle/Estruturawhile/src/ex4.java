
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("digite um numero");
        int num1 = scanner.nextInt();

        int num2;
        
        do { 
            System.out.println("\ndigite outro numero");
            num2 = scanner.nextInt();
            int resultado = (num1 % num2);
            
            if (resultado != 0) {
                System.out.printf("\nO resto da divisão de %s por %s é de '%s', tente outro valor ate dar 0\n", num1, num2, resultado);
            }
            
            else {
                System.out.printf("O resto da divisão de %s por %s é de '%s'", num1, num2, resultado);
                break;
            }

        } while (num1 % num2 != 0);
    }
}
