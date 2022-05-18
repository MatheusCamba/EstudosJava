public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.depositar(200);
        System.out.println("Saldo da primeira " + primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta;
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
        System.out.println(segundaConta.getSaldo());

        Conta terceiraConta = new Conta();
        terceiraConta.depositar(600);
        System.out.println(terceiraConta.getSaldo());

        segundaConta.depositar(100);
        System.out.println(primeiraConta.getSaldo());
        System.out.println(segundaConta.getSaldo());

        if (primeiraConta.getSaldo() == segundaConta.getSaldo()){
            System.out.println("São as mesmas contas.");
        } else {
            System.out.println("Contas diferentes");
        }

    }
}
