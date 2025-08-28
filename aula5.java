import java.util.Scanner;

public class aula5 {

    /**

    Faça um programa que converta temperaturas de Celsius para Kelvin e Fahrenheit.
    F = C * 9 / 5 + 32 K = C + 273.15
    
    **/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temp;

        System.out.print("Entre com a Temperatura a ser convertida: ");

        temp = sc.nextDouble();

        double f = temp * 9 / 5 + 32;

        double k = temp + 273.15;

       System.err.println("A temperatura :" + temp + ", convertida em Fahrenheit é: " + f);

       System.err.println("A temperatura :" + temp + ", convertida em Kelvin é: " + k);

    }
    
}