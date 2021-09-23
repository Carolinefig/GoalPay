package goal.pay.Models.Requests;

public class Login {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String vemail) {
        email = vemail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String vsenha) {
        senha = vsenha;
    }

    private String senha;
}
