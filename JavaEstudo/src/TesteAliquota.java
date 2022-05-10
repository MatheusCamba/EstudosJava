public class TesteAliquota {
    public static void main(String[] args) {
        double porcentagemIR;
        double salario = 2500;

        if(salario >= 1900 && salario <= 2800) {
            porcentagemIR = 7.5;
            System.out.println("Sua alíquota é de " + porcentagemIR + "%");
            System.out.println("Pode deduzir na declaração o valor de R$ 142");
        } else if (salario >= 2800.01  && salario <= 3751) {
            porcentagemIR = 15.0;
            System.out.println("Sua alíquota é de " + porcentagemIR + "%");
            System.out.println("Pode deduzir na declaração o valor de R$ 350");
        } else if (salario >= 3751.01   && salario <= 4664) {
            porcentagemIR =  22.5;
            System.out.println("Sua alíquota é de " + porcentagemIR + "%");
            System.out.println("Pode deduzir na declaração o valor de R$ 636");
        }
    }
}
