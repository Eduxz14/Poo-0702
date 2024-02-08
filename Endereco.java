public class Endereco {
    
    String rua;
    String numero;
    String cep;
    String bairro;
    String cidade;
    String estado;


    public Endereco(String rua, String numero, String cep, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Endereco [rua=" + rua + ", numero=" + numero + ", cep=" + cep + ", bairro=" + bairro + ", cidade="
                + cidade + ", estado=" + estado + "]";
    }


}
