import java.util.Scanner;

public class ex4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma idade");
        int age1 = scanner.nextInt();
        System.out.println("Digite outra idade");
        int age2 = scanner.nextInt();
        int diff = age1 - age2;
        System.out.printf("A diferença entre as duas idade é de %S", diff);
    }
}
