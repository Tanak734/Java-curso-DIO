import br.com.dio.dao.UserDAO;
import br.com.dio.model.MenuOption;
import br.com.dio.model.UserModel;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static UserDAO dao = new UserDAO();
    public static void main(String[] args){

        int opcaoSys;

        do {
            System.out.println("Bem vindo ao sistema de usuarios");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Buscar por ID");
            System.out.println("5 - Listar users");
            System.out.println("6 - sair");
            opcaoSys = scanner.nextInt();


            var operacao = MenuOption.values()[opcaoSys -1];
            switch (operacao) {
                case SAVE -> dao.save(requestToSave());
                case UPDATE ->  dao.update(requestToUpdate());
                case DELETE -> dao.delete(requestId());
                case FIND_BY_ID -> dao.findById(requestId());
                case FIND_ALL -> dao.findAll();
                case EXIT -> System.exit(0);
            }

        } while (opcaoSys != 6);
    }

    public static long requestId(){
        System.out.println("Informe o ID do usuario");
        return scanner.nextLong();
    }



    public static UserModel requestToSave(){
        System.out.println("Informe o nome do usuario");
        var name = scanner.next();
        System.out.println("Informe o email do usuario");
        var email = scanner.next();
        System.out.println("Informe a data de nascimento do usuario (dd/MM/yyyy)");
        var dataStr = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var data = OffsetDateTime.parse(dataStr, formatter);
        var user = new UserModel(0,name, email, data);
        return user;
    }

    public static UserModel requestToUpdate(){
        System.out.println("Informe o id do usuario");
        var id = scanner.nextLong();
        System.out.println("Informe o nome do usuario");
        var name = scanner.next();
        System.out.println("Informe o email do usuario");
        var email = scanner.next();
        System.out.println("Informe a data de nascimento do usuario (dd/MM/yyyy)");
        var dataStr = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var data = OffsetDateTime.parse(dataStr, formatter);
        var user = new UserModel(id,name, email, data);
        return user;
    }
}
