import java.util.Scanner;

public class aula10 {

    /**
    
    Imprima os números quadrados perfeitos de 1 a 1000. 
    Um número quadrado perfeito é um número inteiro positivo que é o produto de si mesmo.
    Em outras palavras, é o resultado da multiplicação de um número por ele mesmo.
    Por exemplo, 1, 4, 9, 16, 25, 36, 49, 64, 81 e 100 são números quadrados perfeitos.

    **/
    public static void main(String[] args) {
        System.out.println("Numeros quadrados de 1 a 1000: ");

        for (int i =1; i * i <= 1000; i++ ){

            int quadrado = i * i;

            System.out.println(quadrado);

        }
    }
    
}