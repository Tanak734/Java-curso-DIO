public abstract class usuarios {
    protected String nomeUser;
    protected String emailUser;
    protected String senhaUser;
    protected boolean admin;
    protected boolean logado;

    public usuarios(String nome, String email, String senha){
        this.nomeUser = nome;
        this.emailUser = email;
        this.senhaUser = senha;
    }

    public abstract void login();
    public abstract void logoff();
    public abstract void mudarDados();
    public abstract void mudarSenha();
}
