
public abstract class Pessoa {
    private String cpf;
    private String nome;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Métodos abstratos

    public abstract void exibirInformacoes();

    public abstract void atualizarInformacoes(String atributo, String novoValor, int valor);

    // Método toString

    public String toString() {
        return getNome() + "{" +
                "cpf: " + getCpf() + "}";
    }
}
