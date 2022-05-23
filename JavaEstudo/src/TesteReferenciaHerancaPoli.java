public class TesteReferenciaHerancaPoli {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Paulo");
        g1.setSalario(5000.0);

        Funcionario f = new Funcionario();
        f.setNome("Furlan");
        f.setSalario(3000.0);

        Designer d = new Designer();
        d.setNome("Sheldon");
        d.setSalario(2500.0);

        EditorVideo ev = new EditorVideo();
        ev.setNome("Leo");
        ev.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(d);
        controle.registra(ev);

        System.out.println(controle.getSoma());
    }
}
