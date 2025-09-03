import java.util.ArrayList;

public class Estudante {
    
    private String curso;
    private String periodo;
    private String nome;
    private String numeroRegistroAcademico;
    private ArrayList<Livro> livrosEmprestados;

    public Estudante(String curso, String periodo, String nome, String numeroRegistroAcademico) {
        this.curso = curso;
        this.periodo = periodo;
        this.nome = nome;
        this.numeroRegistroAcademico = numeroRegistroAcademico;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getCurso() {
        return curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroRegistroAcademico() {
        return numeroRegistroAcademico;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
    
    public boolean adicionarLivro(Livro livro) {
        if (livrosEmprestados.size() >= 3) {
            System.out.println("Erro: O estudante já atingiu o limite de 3 livros emprestados.");
            return false;
        }
        livrosEmprestados.add(livro);
        System.out.println("Livro '" + livro.getTitulo() + "' emprestado para " + this.nome);
        return true;
    }
    
    public boolean removerLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            System.out.println("Livro '" + livro.getTitulo() + "' devolvido por " + this.nome);
            return true;
        }
        System.out.println("Erro: O estudante não tem este livro emprestado.");
        return false;
    }
}