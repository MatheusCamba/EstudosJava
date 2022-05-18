public class TesteContaSemCliente {
    public static void main(String[] args) {
        Conta contaJoao = new Conta();
        System.out.println(contaJoao.getSaldo());

        contaJoao.titular = new Cliente();
        System.out.println(contaJoao.titular);

        contaJoao.titular.nome = "Joao";
        System.out.println(contaJoao.titular.nome);
    }
}
