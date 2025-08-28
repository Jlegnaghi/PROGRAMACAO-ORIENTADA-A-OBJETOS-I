import java.util.Scanner;

public class aula9 {

    /**

    Faça um programa que imprima o fatorial de 1 a N. O usuário deverá digitar o valor de N.

    **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo (N) para calcular os fatorias ate ele: ");
        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("O valor de N deve ser um numero inteiro nao-negativo.");
        } else {
            for (int i = 1; i <= N; i++){
                long fatorial = 1;

                for (int j = 1; j <= i; j++){
                    fatorial = fatorial * j;
                }

                System.out.println("O fatorial de " + i + " é " + fatorial);
            }
        }
    }    
}