public class DadosEConversao {
    public static void main(String[] args) {
        double salario = 1270.5;
        int valor = (int)salario;

        System.out.println(valor);

        float pontoFlutuante = 3.14f; //(float) 3.14;
        long numeroGrande = 3265656565656l;
        short valorPequeno = 2121;
        byte b = 127;

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;
        System.out.println(total);
    }
}
