import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        int num1 = scanner.nextInt();
        System.out.println("digite o segundo numero");
        int num2 = scanner.nextInt();
        //System.out.printf("a soma de %s + %s é igual a %s", num1, num2, num1 + num2);
        System.out.println(num1 + " + " + num2 +  " + " + num1 + num2);
    }
}
