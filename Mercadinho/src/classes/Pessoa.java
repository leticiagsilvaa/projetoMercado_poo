package classes;

public abstract class Pessoa {
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String cpf, String nome, String endereco, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
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
    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    // Métodos abstratos

    public abstract void exibirInformacoes();

    public abstract void atualizarInformacoes(String atributo, String novoValor);

    // Método toString

    public String toString() {
        return getNome() + "{" +
                "cpf: " + getCpf() + '\'' +
                ", endereco: '" + getEndereco() + '\'' +
                ", telefone: '" + getTelefone() + '\'' +
                '}';
    }
}
