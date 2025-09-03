import java.util.Scanner;

public class aula6 {
    
    /**

    Faça um programa em que o usuário informe um número. O programa deverá informar se esse número é: 
    negativo, positivo, par ou ímpar. 

    **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");

        int num = sc.nextInt();

        if (num < 0){
            System.out.println("O número é negativo.");
        }
        else if(num > 0){
            System.out.println("O número é positivo.");
        }
        else {
            System.out.println("O número é zero.");
        }

        if (num % 2 == 0){
            System.out.println("O número é par.");
        }else{
            System.out.println("O número é impar.");
        }        
    }
}