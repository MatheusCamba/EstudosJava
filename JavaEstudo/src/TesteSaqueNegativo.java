public class TesteSaqueNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(200);
        System.out.println(conta.sacar(300));

        System.out.println(conta.sacar(100));
    }
}
