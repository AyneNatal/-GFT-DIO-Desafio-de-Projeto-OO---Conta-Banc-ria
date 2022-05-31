package bootcamp.gft.contabancaria;

public class ContaTestes {
    public static void main(String[] args) {
        //Nova Conta Corrente:
        ContaBancaria cliente01 = new ContaCorrente(500.00);
        cliente01.setSaldo(3220.10);
        cliente01.setNomeCliente("Genivaldo Abracadabra");
        cliente01.setNumeroConta("123.456-2");
        cliente01.setCodBanco("260");
        cliente01.setCpf("012.987.654-21");
        System.out.println(cliente01.mostraInfosCliente());

        //Movimentando a Conta Corrente:
        System.out.println(cliente01.deposito(1232.00));;
        System.out.println(cliente01.transferencia(2050.00, "260", "321.675-1"));
        System.out.println(cliente01.saque(5000.00));
        System.out.println(cliente01.mostraSaldo());
        System.out.println("\n-------------------------------------\n");

        //Nova Conta Poupança:
        ContaBancaria cliente02 = new ContaPoupança(7);
        cliente02.setSaldo(100000.00);
        cliente02.setNomeCliente("Adalsija Noruega Filipinas");
        cliente02.setNumeroConta("543.123.9");
        cliente02.setCodBanco("237");
        cliente02.setCpf("135.269.321.10");
        System.out.println(cliente02.mostraInfosCliente());

        //Movimentando a Conta Poupança:
        System.out.println(cliente02.deposito(10500.00));
        System.out.println(cliente02.transferencia(1670.00, "237", "444.555-2"));
        System.out.println(cliente02.saque(300.00));
        System.out.println(cliente02.mostraSaldo());
    }
}
