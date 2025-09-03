class Veiculo {
    String cor;
    String marca;
    int ano;
    String modelo;
    String placa;
    double valorFipe;

    public Veiculo(String cor, String marca, int ano, String modelo, String placa, double valorFIPE) {
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
        this.placa = placa;
        this.valorFipe = valorFIPE;
    }
    
    public double calcularIPVA() {
    	return valorFipe * 0.02;
    }
}