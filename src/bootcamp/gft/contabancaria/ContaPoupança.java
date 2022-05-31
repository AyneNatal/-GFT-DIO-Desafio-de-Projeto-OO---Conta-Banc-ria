package bootcamp.gft.contabancaria;

public class ContaPoupança extends ContaBancaria{
    private final double RENDIMENTO_MENSAL = 0.05;
    int quantidadeMesesDeRendimento;

    @Override
    public String mostraSaldo() {
        double saldoComRendimento = (getSaldo() + (getSaldo() * RENDIMENTO_MENSAL) * quantidadeMesesDeRendimento);
        return String.format("Seu saldo com rendimentos de %d meses é: %.2f%n",
                quantidadeMesesDeRendimento, saldoComRendimento);
    }

    public ContaPoupança(int quantidadeMesesDeRendimento) {
        this.quantidadeMesesDeRendimento = quantidadeMesesDeRendimento;
    }
}
