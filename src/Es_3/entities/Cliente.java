package Es_3.entities;

public class Cliente {
    private String codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private String data;

    public Cliente(String cod,String nome1,String cog,String mail, String data1){
        codiceCliente=cod;
        nome=nome1;
        cognome=cog;
        email=mail;
        data=data1;

    }

    @Override
    public String toString() {
        return "Carrello{" +
                "codiceCliente='" + codiceCliente + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
