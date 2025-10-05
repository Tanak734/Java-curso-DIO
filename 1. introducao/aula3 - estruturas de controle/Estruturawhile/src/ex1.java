
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero");
        int n = scanner.nextInt();
        System.out.printf("Tabuada do %s: \n", n);
            for (int i = 0; i <= 10 ; i++) {
                int result = n * i;
                System.out.printf("%s X %s = %s \n", n, i, result);

            }

        }
    }

