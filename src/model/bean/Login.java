package model.bean;

public class Login {

    private String nome_login;
    private String email_login;
    private String senha_login;

    public Login(String nome, String senha) {

        this.nome_login = nome;
        this.senha_login = senha;

    }

    public Login(String nome, String email, String senha) {

    }

    public String getNome_login() {
        return nome_login;
    }

    public void setNome_login(String nome_login) {
        this.nome_login = nome_login;
    }

    public String getEmail_login() {
        return email_login;
    }

    public void setEmail_login(String email_login) {
        this.email_login = email_login;
    }

    public String getSenha_login() {
        return senha_login;
    }

    public void setSenha_login(String senha_login) {
        this.senha_login = senha_login;
    }

}
