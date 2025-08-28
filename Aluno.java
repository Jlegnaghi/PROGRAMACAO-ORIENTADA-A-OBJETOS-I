public class Aluno {

    /*
    Crie uma classe chamada Aluno com os seguintes atributos: nome, matricula,nota1 e nota2.
    a. Crie o construtor para esse método.
    b. Crie um método chamado calcularMedia() que retorna a média entre as duas notas.
    c. Crie um método chamado imprimir() que mostra os dados do aluno.
    d. Crie um método chamado aprovado() que retorna o estado do aluno (aprovado/exame/reprovado) 
    */

    //Atributos
    String nome;
    double nota1;
    double nota2;
    int matricula;

    //Construtor
    public Aluno (String nome, double nota1, double nota2, int matricula){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.matricula = matricula;
    }

    //Metodo para calcular a media
    public double calcularMedia(){
        return (this.nota1 + this.nota2) / 2.0;
    }

    // Metodo para imprimir os dados
    public void imprimirDados() {
        System.out.println("--- Dados do Aluno ---");
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Média: " + this.calcularMedia());
        System.out.println("----------------------");
    }
    
    //Metodo para retorna o estado do aluno

    public String aprovado() {
        double media = this.calcularMedia();
        if (media >=7.0){
            return "Aprovado";
        } else if (media >= 5.0){
            return "Exame";
        } else {
            return "Reprovado";
        }
    }
}