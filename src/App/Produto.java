package App;

class Produto {
    String nome;
    int estoque;

    Produto(String nome, int estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

    void mostrarProduto() {
        System.out.println("--------------------------------------------");
        System.out.println("----- Cadastro de produto com sucesso ------");
        System.out.println("--------------------------------------------");
        System.out.println("Produto: " + this.nome);
        System.out.println("Estoque: " + this.estoque);
    }

    // Função com retorno - Para visulaizar informações
    public String getNome() {
        return nome;
    }

    // Função sem retorno - para alterar informações
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Função com retorno - Para visulaizar informações
    public int getEstoque() {
        return estoque;
    }

    // Função sem retorno - para alterar informações
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}