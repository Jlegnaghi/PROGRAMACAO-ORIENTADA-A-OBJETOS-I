import java.util.Scanner;

public class aula7 {

    /**

    Altere o programa do exercício 1 para imprimir uma mensagem na tela quando o número for múltiplo de 3 ou múltiplo de 5.

    **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");

        int num = sc.nextInt();

        if ((num % 3 == 0) && (num % 5 == 0)){
            System.out.println("O número é múltiplo de 3 e de 5.");
        }else if(num % 3 == 0){
            System.out.println("O número é múltiplo de 3.");
        }else if(num % 5 == 0){
            System.out.println("O número é múltiplo de 5.");
        }else {
            System.out.println("Nao é múltiplo de 3 nem de 5.");
        }
    }
}