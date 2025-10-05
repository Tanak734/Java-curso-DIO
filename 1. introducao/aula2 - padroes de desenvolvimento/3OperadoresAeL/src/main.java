import javax.swing.plaf.TreeUI;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("voce tem quantos anos");
        int age = scanner.nextInt();
        System.out.println("Voce é emancipado");
        boolean isEmancipad = scanner.nextBoolean();
        boolean canDrive = age > 17 || (isEmancipad && age > 15);
        System.out.printf("voce pode dirigir? (%s)", canDrive);

    }
}
