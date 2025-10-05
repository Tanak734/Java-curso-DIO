
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        //lista normal
        // List<String> test = new ArrayList<>();
        // test.add("a");
        // System.out.println(test);
        // System.out.println(test);

        //lista de instancia
        List<User> users = new ArrayList<>();
        var user = new User (1,"felipe");
        users.add(user);
        users.add(new User (3, "andre"));
        users.add(new User (2, "pedro"));
        users.contains(user);
        System.out.println(users.size());
        System.out.println(users.isEmpty());
        System.out.println(users.get(0));
        System.out.println(users.contains(user));
        System.out.println(users.contains(new User(5, "renan")));
        System.out.println(users);

    }
}
