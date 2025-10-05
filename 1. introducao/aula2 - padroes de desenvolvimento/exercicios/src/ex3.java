import java.util.Scanner;

public class ex3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do lado");
        float width = scanner.nextFloat();
        System.out.println("Digite o valor da altura");
        float heigth = scanner.nextFloat();
        float area = width * heigth;
        System.out.printf("A area de seu retangulo é de %s", area);
    }
}
