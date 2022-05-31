package bootcamp.gft.contabancaria;

public abstract class ContaBancaria {
    private String codBanco;
    private String numeroConta;
    private String nomeCliente;
    private String cpf;
    private double saldo;

    public String saque (double valorSaque){
        boolean saldoSuficiente = this.saldo > valorSaque;
        if (saldoSuficiente){
            saldo -= valorSaque;
            return String.format("Saque Realizado, seu saldo é de: %.2f%n", this.saldo);
        } else {
            return String.format("Saldo Insuficiente, seu saldo é de: %.2f%n", this.saldo);
        }
    }

    public String deposito (double valorDeposito){
        saldo += valorDeposito;
        return String.format("Deposito Realizado com Sucesso, seu saldo é de: %.2f%n", this.saldo);
    }

    public String transferencia (double valorTransferencia, String codBancario, String numContaDestino){
        boolean saldoSuficiente = this.saldo > valorTransferencia;
        if (saldoSuficiente){
            saldo -= valorTransferencia;
            return String.format("Transferência Realizada com Sucesso para a conta %s.%nSeu saldo é de: %.2f%n",
                    numContaDestino, (this.saldo));
        } else {
            return String.format("Saldo Insuficiente, seu saldo é de: %.2f%n", this.saldo);
        }
    }

    public String mostraInfosCliente (){
        return "Cliente: " + this.nomeCliente + "\nCPF: " + this.cpf +
                "\nConta: " + this.numeroConta;
    }

    public String mostraSaldo (){
        return "Seu saldo é: %.2f" + this.saldo;
    }

    //getters and setters:

    public String getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
