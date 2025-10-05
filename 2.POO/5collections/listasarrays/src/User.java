public class User {
    private int code;
    private String nome;

    public User(int code, String nome){
        this.code = code;
        this.nome = nome;
    }

    public int getcode() {
        return code;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return String.format("{id: %d | nome: %s}", this.code, this.nome);
    }
    public void setcode(){
        this.code = code;
    }
}
