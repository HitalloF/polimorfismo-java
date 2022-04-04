public class ContaCorrente extends  Conta {

    @Override
    public void saldo() {
        System.out.println("Conta Corrente: "+(this.total + 300));
    }
}
