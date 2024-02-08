import java.util.ArrayList;

public class Contato {
    
    String nome;
    String telefone = "0000";
    String email;
    String dataNascimento;
    ArrayList<Endereco> enderecos;

    public Contato(String nome, String telefone, String email, String dataNascimento) {
        this.nome = nome;
        System.out.println(this.telefone);
        this.telefone = telefone;
        System.out.println(this.telefone);
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.enderecos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Contato Nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", dataNascimento="
                + dataNascimento + ", endereco=" + enderecos;
    }

    

}
