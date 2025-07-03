package App;

public class Cliente {
    String nome;
    String cpf;
    String contato;
    int idade;

    public Cliente(String nome, String cpf, String contato, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
        this.idade = idade;
    }

    void mostrarCliente(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Cpf: "+ this.cpf);
        System.out.println("Contato: " + this.contato);
        System.out.println("Idade: "+ this.idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
