public class App {
    public static void main(String[] args) {
    	
        Carro carro = new Carro("Prata", "Ford", 206, "Fusion", "ASZ-0E04", 30000.00, 162, 4);

        Moto moto = new Moto("Preta", "Honda", 2010, "CG 125 KS", "ASN-2023", 6000.00, 124);


        System.out.println("=== Dados do Carro ===");
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Cor: " + carro.cor);
        System.out.println("Placa: " + carro.placa);
        System.out.println("Valor FIPE: " + carro.valorFipe);
        System.out.println("Cavalos: " + carro.cavalos);
        System.out.println("Portas: " + carro.qtdPorta);

        System.out.println();


        System.out.println("=== Dados da Moto ===");
        System.out.println("Modelo: " + moto.modelo);
        System.out.println("Marca: " + moto.marca);
        System.out.println("Ano: " + moto.ano);
        System.out.println("Cor: " + moto.cor);
        System.out.println("Placa: " + moto.placa);
        System.out.println("Valor FIPE: " + moto.valorFipe);
        System.out.println("Cilindradas: " + moto.cilindradas);
        
        System.out.println();
        
        System.out.println("=== Carro ===");
        System.out.println("Modelo: " + carro.modelo + " | IPVA: R$ " + carro.calcularIPVA());

        System.out.println("\n=== Moto 1 ===");
        System.out.println("Modelo: " + moto.modelo + " | IPVA: R$ " + moto.calcularIPVA());
    }
}