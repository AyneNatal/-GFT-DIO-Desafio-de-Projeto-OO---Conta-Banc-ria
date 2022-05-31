package bootcamp.gft.contabancaria;

public class ContaCorrente extends ContaBancaria{
    private final double LIMITE_CHEQUE_ESPECIAL;

    @Override
    public String saque(double valorSaque) {
        boolean saldoSuficiente = (LIMITE_CHEQUE_ESPECIAL + getSaldo()) > valorSaque;
        if (saldoSuficiente){
            setSaldo(getSaldo() - valorSaque);
            return String.format("Saque Realizado, seu saldo é de: %.2f%n", (getSaldo() + LIMITE_CHEQUE_ESPECIAL));
        } else {
            return String.format("Saldo Insuficiente, seu saldo é de: %.2f%n", (getSaldo() + LIMITE_CHEQUE_ESPECIAL));
        }
    }

    @Override
    public String transferencia(double valorTransferencia, String codBancario, String numContaDestino) {
        boolean saldoSuficiente = (LIMITE_CHEQUE_ESPECIAL + getSaldo()) > valorTransferencia;
        if (saldoSuficiente){
            setSaldo(getSaldo() - valorTransferencia);
            return String.format("Transferência Realizada com Sucesso para a conta %s.%nSeu saldo é de: %.2f",
                    numContaDestino, (getSaldo() + LIMITE_CHEQUE_ESPECIAL));
        } else {
            return String.format("Saldo Insuficiente, seu saldo é de: %.2f",
                    (LIMITE_CHEQUE_ESPECIAL + getSaldo()));
        }
    }

    @Override
    public String mostraSaldo() {
        return String.format("Seu saldo com o limite especial é: %.2f%nSaldo: %.2f | Cheque Especial: %.2f",
                (LIMITE_CHEQUE_ESPECIAL + getSaldo()), getSaldo(), LIMITE_CHEQUE_ESPECIAL);
    }

    public ContaCorrente(double limiteChequeEspecial) {
        this.LIMITE_CHEQUE_ESPECIAL = limiteChequeEspecial;
    }
}
