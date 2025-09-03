public class App {
    public static void main(String[] args) {

        Lista lista = new Lista(5);

        lista.inserirValores();

        lista.imprimir();

        System.out.println("Maior elemento: " + lista.maior());

        System.out.println("Quantidade de pares: " + lista.contarPares());

        System.out.println("Média da lista: " + lista.media());
    }
}
