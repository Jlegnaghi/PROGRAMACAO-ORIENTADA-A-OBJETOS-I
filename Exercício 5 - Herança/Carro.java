class Carro extends Veiculo {
    int cavalos;
    int qtdPorta;

    public Carro(String cor, String marca, int ano, String modelo, String placa, double valorFipe, int cavalos, int qtdPorta) {
        super(cor, marca, ano, modelo, placa, valorFipe);
        this.cavalos = cavalos;
        this.qtdPorta = qtdPorta;
    }
    
    @Override
    public double calcularIPVA() {
        int anoAtual = java.time.Year.now().getValue();
        int idade = anoAtual - this.ano;

        if (idade > 20) {
            return 0.0;
        } else {
            return super.calcularIPVA();
        }
    }
}