
import java.util.Scanner;

public class Gerente extends usuarios {

    Scanner scanner = new Scanner(System.in);    
    
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
        super.logado = false;
        super.admin = true;
    }
    

    @Override
    public void login(){
        
        if (logado == true){
            System.out.println("Voce ja está logado");
        } else{
            System.out.println("Digite as informaçoes abaixo para fazer o login");
            System.out.println("Digite seu nome:");
            var nomeLogin = scanner.next();
            var emailLogin = scanner.next();
            System.out.println("Digite sua senha:");
            var senhaLogin = scanner.next();
            
            if (nomeUser == nomeLogin && emailUser == emailLogin && senhaUser == senhaLogin){
                super.logado = true;
                System.out.println("O login foi feito com sucesso");
            } else {
                System.out.println("O login falhou, tente novamente ");
            }
        }

    }

    @Override
    public void logoff(){
        System.out.printf("O user <%s> saiu", nomeUser);
    }

    @Override
    public void mudarDados(){
        var opcao = scanner.nextInt();
        String entradaN;
        String entradaE;
        System.out.println("Qual dado voce deseja mudar");
        System.out.println("1 - nome");
        System.out.println("2 - email");
        
        switch (opcao) {
            case 1:
                System.out.println("Insira o novo nome");
                entradaN = scanner.next();
                entradaN = nomeUser;
                System.out.println("O Nome foi alterado");
                break;
            
            case 2:
                System.out.println("Insira o novo email");
                entradaE = scanner.next();
                entradaE = emailUser;
                System.out.println("O Email foi alterado");
                break;
        }
    }
    @Override
    public void mudarSenha(){
        System.out.println("Digite a senha atual");

        var entradaS = scanner.next();
        if (entradaS == senhaUser){
            System.out.println("Digite a nova senha:");
            var senhaNova = scanner.next();
            senhaNova = super.senhaUser;
        }
        
    }
    
    public void gerarRelatorio(){
        System.out.println("O relatorio foi gerado");
    }
    
    public void consultarVenda(){
        System.out.println("O Registro de vendas gerado");
    }


}
