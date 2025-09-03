import java.util.Scanner;

public class Matriz {
    int[][] dados;
    int linhas;
    int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.dados = new int[linhas][colunas];
    }

    public void inserirValores() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para posição [" + i + "][" + j + "]: ");
                dados[i][j] = sc.nextInt();
            }
        }
    }

    public void imprimir() {
        System.out.println("Matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(dados[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int somar() {
        int soma = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma += dados[i][j];
            }
        }
        return soma;
    }

    public void multiplicar(int valor) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                dados[i][j] = dados[i][j] * valor;
            }
        }
    }
}

