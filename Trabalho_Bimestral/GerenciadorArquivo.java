import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorArquivo {

    public static void salvarLivros(ArrayList<Livro> livros) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("livros.txt"))) {
            for (Livro livro : livros) {
                // Formato: codigo;titulo;autor;anoPublicacao;editora
                String linha = String.format("%d;%s;%s;%d;%s",
                    livro.getCodigo(),
                    livro.getTitulo(),
                    livro.getAutor(),
                    livro.getAnoPublicacao(),
                    livro.getEditora()
                );
                writer.println(linha);
            }
            System.out.println("Lista de livros salva com sucesso no arquivo 'livros.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    public static ArrayList<Livro> carregarLivros() {
        ArrayList<Livro> livros = new ArrayList<>();
        File arquivo = new File("livros.txt");
        
        if (!arquivo.exists()) {
            System.out.println("Arquivo 'livros.txt' não encontrado. Iniciando com lista vazia.");
            return livros;
        }
        
        try (Scanner fileScanner = new Scanner(arquivo)) {
            while (fileScanner.hasNextLine()) {
                String linha = fileScanner.nextLine();
                String[] dados = linha.split(";");
                
                if (dados.length == 5) {
                    try {
                        int codigo = Integer.parseInt(dados[0]);
                        String titulo = dados[1];
                        String autor = dados[2];
                        int ano = Integer.parseInt(dados[3]);
                        String editora = dados[4];
                        livros.add(new Livro(codigo, titulo, autor, ano, editora));
                    } catch (NumberFormatException e) {
                        System.out.println("Erro de formato nos dados: " + linha);
                    }
                }
            }
            System.out.println("Lista de livros carregada com sucesso a partir de 'livros.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo: " + e.getMessage());
        }
        return livros;
    }
}