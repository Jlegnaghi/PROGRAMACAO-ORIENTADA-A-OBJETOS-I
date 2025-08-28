import java.util.Scanner;

public class aula8 {

    /**

    Faça um programa que imprima os números de 1 a N. O usuário deverá digitar o valor de N. 

    **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para o final N: ");

        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("O Valor do N deve ser um numero inteiro positivo.");
        }else {
            System.out.println("Imprimindo numeros de 1 a " + N + ":");
            for (int i = 1; i <= N; i++){
                System.out.println(i);
            }
        }

    }    
}
