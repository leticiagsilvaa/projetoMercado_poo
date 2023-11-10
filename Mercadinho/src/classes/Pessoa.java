public class Pessoa {
    private int cpf;
    private String nome;
    private String endereço;
    private String telefone;

    public Pessoa (int cpf, String nome, String endereço, String telefone){
        this.cpf = cpf;
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    // Métodos
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + getCpf());
    }
}
