public class App {
    public static void main(String[] args) {
        // cria um estoque com capacidade para 3 produtos
        Estoque estoque = new Estoque(3);

        // insere alguns produtos (já preenchidos, sem Scanner)
        Produto p1 = new Produto("Arroz", 25.90, 10);
        Produto p2 = new Produto("Feijão", 8.50, 20);
        Produto p3 = new Produto("Macarrão", 4.30, 15);

        estoque.inserirProduto(p1);
        estoque.inserirProduto(p2);
        estoque.inserirProduto(p3);

        // imprime a lista de produtos
        estoque.imprimirProdutos();
    }
}
