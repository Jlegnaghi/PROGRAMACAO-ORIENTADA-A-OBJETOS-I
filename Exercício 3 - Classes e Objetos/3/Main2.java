public class Main2 {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("João Silva",9.0 , 8.5, 12345);
        
        aluno1.imprimirDados();

        System.out.println("Status: " + aluno1.aprovado());
        
        System.out.println("\n----------------------\n");

        Aluno aluno2 = new Aluno("Maria Souza", 6.5, 5.5, 54321);
        
        aluno2.imprimirDados();
        System.out.println("Status: " + aluno2.aprovado());
        
        System.out.println("\n----------------------\n");

        Aluno aluno3 = new Aluno("Carlos Pereira", 4.0, 3.0, 987654);
        
        aluno3.imprimirDados();
        System.out.println("Status: " + aluno3.aprovado());
    }
}