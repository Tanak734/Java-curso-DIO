import java.util.Scanner;

public class ex2 {
    public static void main (String[] args) {
        System.out.println("Digite o valor do lado");
        Scanner scanner = new Scanner(System.in);
        float width = scanner.nextFloat();
        float area = width * width;
        System.out.printf("Sua area é de %s", area);

    }
}
