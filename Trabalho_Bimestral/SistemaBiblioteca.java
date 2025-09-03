import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBiblioteca {
    private static ArrayList<Livro> livros = new ArrayList<>();
    private static ArrayList<Estudante> estudantes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        // Adicionando alguns estudantes para teste. Os livros serão carregados do arquivo.
        estudantes.add(new Estudante("Ciência da Computação", "2º", "João da Silva", "12345"));
        estudantes.add(new Estudante("Análise e Desenvolvimento de Sistemas", "1º", "Maria Oliveira", "67890"));
        
        // NOVO: Carregar os livros ao iniciar o programa
        livros = GerenciadorArquivo.carregarLivros();

        do {
            exibirMenu();
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Opção inválida. Digite um número.");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine(); // Consumir a linha pendente

            switch (opcao) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    adicionarEstudante();
                    break;
                case 4:
                    listarEstudantes();
                    break;
                case 5:
                    emprestarLivro();
                    break;
                case 6:
                    devolverLivro();
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        // NOVO: Salvar os livros antes de fechar o programa
        GerenciadorArquivo.salvarLivros(livros);
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n--- Sistema de Gerenciamento de Livros ---");
        System.out.println("1. Adicionar Livro");
        System.out.println("2. Listar Livros");
        System.out.println("3. Adicionar Estudante");
        System.out.println("4. Listar Estudantes");
        System.out.println("5. Emprestar Livro");
        System.out.println("6. Devolver Livro");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    private static void adicionarLivro() {
        System.out.println("\n--- Adicionar Novo Livro ---");
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ano de Publicação: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Editora: ");
        String editora = scanner.nextLine();
        
        livros.add(new Livro(codigo, titulo, autor, ano, editora));
        System.out.println("Livro adicionado com sucesso!");
    }

    private static void listarLivros() {
        System.out.println("\n--- Lista de Livros ---");
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for (Livro livro : livros) {
            System.out.println("Código: " + livro.getCodigo() + ", Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
        }
    }
    
    private static void adicionarEstudante() {
        System.out.println("\n--- Adicionar Novo Estudante ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Nº de Registro Acadêmico: ");
        String ra = scanner.nextLine();
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        System.out.print("Período: ");
        String periodo = scanner.nextLine();
        
        estudantes.add(new Estudante(curso, periodo, nome, ra));
        System.out.println("Estudante adicionado com sucesso!");
    }

    private static void listarEstudantes() {
        System.out.println("\n--- Lista de Estudantes ---");
        if (estudantes.isEmpty()) {
            System.out.println("Nenhum estudante cadastrado.");
            return;
        }
        for (Estudante estudante : estudantes) {
            System.out.println("Nome: " + estudante.getNome() + ", RA: " + estudante.getNumeroRegistroAcademico() + ", Curso: " + estudante.getCurso());
            if (!estudante.getLivrosEmprestados().isEmpty()) {
                System.out.println("  Livros Emprestados:");
                for (Livro livro : estudante.getLivrosEmprestados()) {
                    System.out.println("    - " + livro.getTitulo());
                }
            }
        }
    }

    private static void emprestarLivro() {
        System.out.println("\n--- Emprestar Livro ---");
        System.out.print("Digite o Nº de Registro Acadêmico do estudante: ");
        String raEstudante = scanner.nextLine();
        System.out.print("Digite o código do livro: ");
        int codigoLivro = scanner.nextInt();
        
        Estudante estudanteEncontrado = buscarEstudantePorRA(raEstudante);
        Livro livroEncontrado = buscarLivroPorCodigo(codigoLivro);
        
        if (estudanteEncontrado != null && livroEncontrado != null) {
            estudanteEncontrado.adicionarLivro(livroEncontrado);
        } else {
            System.out.println("Erro: Estudante ou livro não encontrado.");
        }
    }

    private static void devolverLivro() {
        System.out.println("\n--- Devolver Livro ---");
        System.out.print("Digite o Nº de Registro Acadêmico do estudante: ");
        String raEstudante = scanner.nextLine();
        System.out.print("Digite o código do livro a ser devolvido: ");
        int codigoLivro = scanner.nextInt();
        
        Estudante estudanteEncontrado = buscarEstudantePorRA(raEstudante);
        Livro livroEncontrado = buscarLivroPorCodigo(codigoLivro);
        
        if (estudanteEncontrado != null && livroEncontrado != null) {
            estudanteEncontrado.removerLivro(livroEncontrado);
        } else {
            System.out.println("Erro: Estudante ou livro não encontrado.");
        }
    }

    private static Estudante buscarEstudantePorRA(String ra) {
        for (Estudante estudante : estudantes) {
            if (estudante.getNumeroRegistroAcademico().equals(ra)) {
                return estudante;
            }
        }
        return null;
    }

    private static Livro buscarLivroPorCodigo(int codigo) {
        for (Livro livro : livros) {
            if (livro.getCodigo() == codigo) {
                return livro;
            }
        }
        return null;
    }
}