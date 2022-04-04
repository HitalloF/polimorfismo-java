public class ContaPoupança extends  Conta{

    @Override
    public void saldo() {
        System.out.println("Conta Poupança: "+(this.total + 400));
    }
}
