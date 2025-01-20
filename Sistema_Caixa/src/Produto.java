public class Produto {
    private String nome;
    private int idProduto;
    private double preco;

    public Produto(String nome, int idProduto, double preco){
        this.nome = nome;
        this.idProduto = idProduto;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Mensagem(){
        System.out.println("O " +nome+" foi adicionado ao carrinho");
    }
}
