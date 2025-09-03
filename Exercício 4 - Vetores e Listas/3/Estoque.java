public class Estoque {
    Produto[] produtos; // vetor de produtos
    int tamanho;
    int indiceAtual = 0; // controla quantos produtos já foram inseridos

    public Estoque(int tamanho) {
        this.tamanho = tamanho;
        this.produtos = new Produto[tamanho];
    }

    // método para inserir produto no estoque
    public void inserirProduto(Produto p) {
        if (indiceAtual < tamanho) {
            produtos[indiceAtual] = p;
            indiceAtual++;
        } else {
            System.out.println("Estoque cheio! Não é possível adicionar mais produtos.");
        }
    }

    // método para imprimir lista de produtos
    public void imprimirProdutos() {
        System.out.println("=== Lista de Produtos ===");
        for (int i = 0; i < indiceAtual; i++) {
            System.out.println("Nome: " + produtos[i].nome +
                               " | Preço: " + produtos[i].preco +
                               " | Quantidade: " + produtos[i].quantidade);
        }
    }
}
