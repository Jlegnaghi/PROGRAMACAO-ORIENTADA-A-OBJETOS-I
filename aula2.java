import java.util.Scanner;

public class aula2 {

    /**

    Faça um programa que pergunta o nome do usuário e responde com “Olá, [nome]!”
    
    **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;

        System.out.print("Digite seu Nome: ");

        texto = sc.nextLine();

        System.out.println("Olá, " + texto + "! Bem Vindo ao mundo da programação.");
    }
}