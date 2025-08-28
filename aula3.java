import java.util.Scanner;

public class aula3 {

    /**

    Faça um programa para calcular a área e o perímetro de um círculo
    Perímetro = 2πr Área = πr²
    
    **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double pi =  3.14159;

        double perimetro = 2 * pi * raio;

        double area = pi * raio * raio;

        System.out.println("O perímetro do círculo é: " + String.format("%.2f", perimetro));

        System.out.println("A área do círculo é: " + String.format("%.2f", area));
    }
}