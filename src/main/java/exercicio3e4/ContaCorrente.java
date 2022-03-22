package exercicio3e4;

public class ContaCorrente extends Conta implements Imposto{
    // Atributos
    double rendimento;

    // Construtor
    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    // Encapsulamento
    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    // Métodos
    @Override
    public double rendimento() {
        return this.getSaldo() * 0.03;
    }

    @Override
    public double calcularImposto() {
        this.setRendimento(rendimento());
        return this.getRendimento() * 0.25;
    }
}
