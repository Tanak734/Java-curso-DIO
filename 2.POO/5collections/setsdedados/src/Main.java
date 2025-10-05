
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       Set<User> users = new HashSet<>();
       users.add(new User(1, "andre"));
       users.add(new User(2, "carlos"));
       users.add(new User(3, "andreia"));
       users.add(new User(4, "felipe"));
       users.add(new User(1, "andre"));
       System.out.println(users);
    }
}
