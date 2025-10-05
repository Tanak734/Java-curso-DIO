import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //
        System.out.println("Informe seu nome: ");
        String name = scanner.next();
        System.out.println("informe sua idade: ");
        int age = scanner.nextInt();
        System.out.printf("ola %s sua idade é %s", name, age);

    }
}