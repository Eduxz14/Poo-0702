public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua de teste" , "77", "06784123", "Jardim das casas", "Cotia", "SP");
        Endereco endereco2 = new Endereco("Rua de teste" , "77", "06784123", "Jardim das casas", "Cotia", "SP");
        Endereco endereco3 = new Endereco("Rua de teste" , "77", "06784123", "Jardim das casas", "Cotia", "SP");
        Contato contato = new Contato("Jailson", "985647851", "Emaildeteste@gmail.com "  , "11/02/2010");
        
        //contato.endereco = "Rua lagoa do sombrio";

        contato.enderecos.add(endereco);
        contato.enderecos.add(endereco2);
        contato.enderecos.add(endereco3);
        System.out.println(contato);

    }
    
}
