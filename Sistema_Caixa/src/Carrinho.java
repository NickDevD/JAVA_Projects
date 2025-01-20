import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> produtos;

    public Carrinho(){
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removerProduto(int idProduto){
        for (int i = 0; i < produtos.size() ; i++) {
            if (produtos.get(i).getIdProduto()==idProduto){
                System.out.println(produtos.get(i).getNome()+" foi removido do carrinho");
                produtos.remove(i);
            }
        }

    }

    public void calcularPreco(){
        double valor = 0;
        for (int i = 0; i < produtos.size() ; i++) {
            valor += produtos.get(i).getPreco();
        }
        System.out.println("Valor total: "+valor);
    }
}
