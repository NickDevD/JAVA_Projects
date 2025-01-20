public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("arroz", 1, 5.99);
        p1.setNome("Arroz");

        Produto p2 = new Produto("feijão", 2, 9.55);

        Carrinho c = new Carrinho();
        c.adicionarProduto(p1);
        c.removerProduto(1);
        c.adicionarProduto(p2);
        c.calcularPreco();



    }
}
