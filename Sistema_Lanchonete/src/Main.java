public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("Carne de boi", 12.99, 1);
        Item item2 = new Item("Frango", 10.99, 2);

        Carrinho c = new Carrinho();
        c.adicionarItem(item1);
        c.adicionarItem(item2);
        c.calcularPreco();


    }
}
