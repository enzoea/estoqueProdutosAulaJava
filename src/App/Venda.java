package App;

public class Venda {
    Cliente cliente;
    Produto produto;
    Vendedor vendedor;

    public Venda(Cliente cliente, Produto produto, Vendedor vendedor) {
        this.cliente = cliente;
        this.produto = produto;
        this.vendedor = vendedor;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
}
