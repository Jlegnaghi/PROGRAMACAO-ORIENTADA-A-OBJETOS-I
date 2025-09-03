class Moto extends Veiculo {
    int cilindradas;

    public Moto(String cor, String marca, int ano, String modelo, String placa, double valorFipe, int cilindradas) {
        super(cor, marca, ano, modelo, placa, valorFipe);
        this.cilindradas = cilindradas;
    }
    
    @Override
    public double calcularIPVA() {
        if (this.cilindradas < 170) {
            return 0.0;
        } else {
            return super.calcularIPVA();
        }
    }
}