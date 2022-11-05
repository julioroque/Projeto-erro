package obra;

public class cadastro {
     public String email;
    public int senha;
    public String Nomeusuario;
    
    public cadastro (String email, int senha,String NomeUsuario){
    this.email = email;
    this.senha = senha;
    this.Nomeusuario = NomeUsuario; 
    }

    cadastro() {
        
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNomeusuario() {
        return Nomeusuario;
    }

    public void setNomeusuario(String Nomeusuario) {
        this.Nomeusuario = Nomeusuario;
    }

    

    
    
}
