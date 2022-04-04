public class main {

    public static void main(String[] args) {

        Conta c;

        c = new ContaCorrente();
        c.saldo();

        c = new ContaPoupança();
        c.saldo();

    }

}
