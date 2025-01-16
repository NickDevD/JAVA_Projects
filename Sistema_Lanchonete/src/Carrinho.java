import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Item> itens;

    public Carrinho(){
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item){
        itens.add(item);
    }

    public void removerItem(int codItem){
        for (int i = 0; i < itens.size() ; i++) {
            if (itens.get(i).getCodigo() == codItem){
                System.out.println(itens.get(i).getNome()+" foi removido do carrinho!");
                itens.remove(i);

            }
        }
    }

    public void calcularPreco(){
        double valor = 0;
        for (int i = 0; i < itens.size(); i++) {
            valor += itens.get(i).getPreco();
        }

        System.out.println("O total é: "+valor);
    }

}
