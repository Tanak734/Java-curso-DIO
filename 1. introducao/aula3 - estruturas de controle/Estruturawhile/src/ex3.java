
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        var scanner = new  Scanner(System.in);
        
        System.out.println("Digite um numero    ");
        int num1 = scanner.nextInt();
        
        int num2; 
        do { 
            System.out.printf("Digite outro numero que deve ser maior que %s  \n", num1);
            num2 = scanner.nextInt();
        
            if (num2 <= num1) {
                System.out.printf("Voce digitou um numero menor que %s \n", num1);
            }
        } while (num2 <= num1);
        
        System.out.println("escolha entre 'par' ou 'impar'  ");
        String set = scanner.next().toLowerCase();

        while (!set.equals("par") && !set.equals("impar")) {
            System.out.print("Erro: Escolha a opção 'par' ou 'impar'");
        }
        
        System.out.printf("\nnumeros %ses entre %s e %s: ", set, num1, num2);

        for (int i = num2; i >= num1; i--) {
            if ((set.equals("par") && i % 2 == 0) || (set.equals("impar")) && i % 2 != 0) {
                System.out.printf("\n%s ", i);
            }
        }
        

    }   
}
