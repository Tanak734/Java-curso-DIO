import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("informe um numero de 1 a 7");
        int option = scanner.nextInt();
        switch (option) {
            case 1, 7 -> {
                var day = option == 1 ? "domingo " : "sabado";
                yield String.format("hoje é %s, fim de semana", day);
            }
            case 2 -> System.out.println("segunda");
            case 3 -> System.out.println("terca");
            case 4 -> System.out.println("quarta");
            case 5 -> System.out.println("quinta");
            case 6 -> System.out.println("sexta");
            default -> System.out.println("Opção invalida");  
        }
    }
}
