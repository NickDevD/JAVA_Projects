public class Item {
    // Declaração da classe Item, que representa um item com nome e preço.

    private int codigo;
    private String nome; // Atributo privado para armazenar o nome do item.
    private double preco; // Atributo privado para armazenar o preço do item.

    public Item(String nome, double preco, int codigo){ // Construtor da classe Item.
        this.nome = nome; // Atribui o valor do parâmetro 'nome' ao atributo 'nome' do objeto.
        this.preco = preco; // Atribui o valor do parâmetro 'preco' ao atributo 'preco' do objeto.
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome(){ // Método getter para obter o nome do item.
        return nome;
    }

    public double getPreco(){ // Método getter para obter o preço do item.
        return preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) { // Método setter para modificar o nome do item.
        this.nome = nome;
    }

    public void setPreco(double preco) { // Método setter para modificar o preço do item.
        this.preco = preco;
    }

    public void apresentar() {
        System.out.println("Nome do item: "+nome+", Preço: R$"+preco+", Código do item"+codigo);
    }
}