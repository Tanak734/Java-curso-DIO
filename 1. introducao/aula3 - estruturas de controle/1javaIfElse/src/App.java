import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Infome seu nome");
        String name = scanner.next();
        System.out.println("Informe sua idade");
        int age = scanner.nextInt();
        System.out.println("Voce é emancipado? | s OR n");
        var isEmancipad = scanner.next().equalsIgnoreCase("s");
        
        // maneira comum
        if (age >= 18) {
            System.out.printf("%s tem %s anos, voce pode dirigir", name, age);
        } else if (age >= 16 && isEmancipad) {
            System.out.printf("%s voce é emancipado (%s), voce pode dirigir", name, isEmancipad);
        } else {
            System.out.printf("%s voce nao pode dirigir", name, age);
        }

        // elvis operator

        var canDrive = (age >= 18) || (age >= 16 && isEmancipad);
        var message = canDrive ?
                name + ", voce pode dirigir" :
                name + ", voce nao pode dirigir";
        
        System.out.println(message);
    }
}
