import java.util.Scanner;

public class Lista {
    int[] elementos;
    int tamanho;

    public Lista(int tamanho) {
        this.tamanho = tamanho;
        this.elementos = new int[tamanho];
    }

    public void inserirValores() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor da posição [" + i + "]: ");
            elementos[i] = sc.nextInt();
        }
    }

    public int maior() {
        int maior = elementos[0];
        for (int i = 1; i < tamanho; i++) {
            if (elementos[i] > maior) {
                maior = elementos[i];
            }
        }
        return maior;
    }

    public int contarPares() {
        int qtd = 0;
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] % 2 == 0) {
                qtd++;
            }
        }
        return qtd;
    }

    public double media() {
        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += elementos[i];
        }
        return (double) soma / tamanho;
    }

    public void imprimir() {
        System.out.print("Lista: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}
