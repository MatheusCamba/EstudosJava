public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario pedro = new Funcionario();
        pedro.setNome("Pedro");
        pedro.setSalario(3000.0);
        pedro.setCpf("111222333-55");

        System.out.println(pedro.getNome());
        System.out.println(pedro.getCpf());
        System.out.println(pedro.getSalario());
    }
}
