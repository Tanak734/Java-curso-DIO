
import java.util.Objects;

public class User {
    private int code;
    private String name;

    public User(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("{id: %s | name: %s}", code, name);
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) return true;
        if ((isNull(obj)) || (!(obj instanceof User user))) return false;
        return this.code == user.getCode() && Objects.equals(user.getName(), this.name);
    }
}   