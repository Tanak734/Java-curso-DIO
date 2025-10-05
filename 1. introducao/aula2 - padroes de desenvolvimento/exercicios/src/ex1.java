import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        var baseYear = 2025;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga seu nome");
        String name = scanner.next();
        System.out.println("Diga seu ano de nascimento");
        int bornYear = scanner.nextInt();
        var age = baseYear - bornYear;
        System.out.printf("Olá %s, voce tem %s anos", name, age);

    }
}
