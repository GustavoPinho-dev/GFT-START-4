package exercicio3e4;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(001, "Gustavo", 1000);
        ContaCorrente contaCorrente = new ContaCorrente(002, "João", 1000);

        // Rendimento mensal
        System.out.println("Rendimento mensal da Conta Poupança: R$" + contaPoupanca.rendimento());
        System.out.println("Rendimento mensal da Conta Corrente: R$" + contaCorrente.rendimento());

        // Imposto
        System.out.println("Imposto sobre o valor em Conta Poupança: R$" + contaPoupanca.calcularImposto());
        System.out.println("Impsoto sobre o valor em Conta Corrente: R$" + contaCorrente.calcularImposto());

    }
}
