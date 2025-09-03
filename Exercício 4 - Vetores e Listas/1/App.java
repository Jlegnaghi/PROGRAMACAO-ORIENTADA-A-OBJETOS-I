public class App {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(2, 2);

        matriz.inserirValores();

        matriz.imprimir();

        int soma = matriz.somar();
        System.out.println("Soma dos elementos: " + soma);

        matriz.multiplicar(2);

        System.out.println("Matriz após multiplicar por 2:");
        matriz.imprimir();
    }
}
