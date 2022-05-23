public class EditorVideo extends Funcionario {

    public double getBonificacao(){
        System.out.println("Chamando bonificacao do Editor");
        return super.getBonificacao() + 500;
    }

}
