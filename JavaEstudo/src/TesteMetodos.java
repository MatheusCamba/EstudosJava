public class TesteMetodos {
    public static void main(String[] args) {
        Conta contaPedro = new Conta();
        contaPedro.depositar(200);
        System.out.println("Valor da conta do Pedro: " + contaPedro.getSaldo());

        Conta contaMatheus = new Conta();
        contaMatheus.depositar(300);
        System.out.println("Valor da conta do Matheus: " + contaMatheus.getSaldo());

        contaPedro.transferir(100, contaMatheus);
        System.out.println("Valor da conta do Pedro atualizado: " + contaPedro.getSaldo());
        System.out.println("Valor da conta do Matheus atualizado: " + contaMatheus.getSaldo());

        contaMatheus.sacar(300);
        System.out.println("Valor da conta do Matheus atualizado depois" +
                " sacar: " + contaMatheus.getSaldo());
    }
}
