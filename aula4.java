import java.util.Scanner;

public class aula4 {

    /**

    Faça um programa que calcula o IMC de uma pessoa
    IMC = peso/altura²

    
    **/
    public static void main(String[] args) {      

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso em kg (ex: 75,5): ");

        double peso = sc.nextDouble();
        
        System.out.print("Digite sua altura em metros (ex: 1,75): ");

        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + String.format("%.2f", imc));

        if (imc < 18.5){
            System.out.println("Sua Classificação do IMC é 'Magreza' e Obesidade (GRAU) '0' ");
        }
        else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Sua Classificação do IMC é 'Normal' e Obesidade (GRAU) '0' ");
        }
        else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sua Classificação do IMC é 'Sobrepeso' e Obesidade (GRAU) 'I' ");
        }
        else if(imc >= 30.0 && imc <= 39.9){
            System.out.println("Sua Classificação do IMC é 'Obesidade' e Obesidade (GRAU) 'II' ");
        }else{
            System.out.println("Sua Classificação do IMC é 'Obesidade Grave' e Obesidade (GRAU) 'III' ");
        };

        /**
        
        imc                 Classificação      Obesidade (grau)
        18,5                Magreza	           0
        18,5 e 24,9         Normal	           0
        25,0 e 29,9         Sobrepeso	       I
        30,0 e 39,9         Obesidade	       II
        40,0                Obesidade Grave	   III

        **/
    }
}