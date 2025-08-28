public class Livro {

    // Atributos
    String titulo;
    String autor;
    // Adicionando Editora
    String editora;
    int anoPublicacao;

    // Construtor
    public Livro(String titulo, String autor, String editora, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        // Adicionando Editora
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    // Método para imprimir os dados
    public void imprimirDados() {
        System.out.println("--- Dados do Livro ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        // Adicionando Editora
        System.out.println("Editora: " + this.editora);
        System.out.println("Ano de Publicação: " + this.anoPublicacao);
        System.out.println("----------------------");
    }
}