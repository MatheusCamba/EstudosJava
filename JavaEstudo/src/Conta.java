public class Conta {
    private double saldo;
    int agencia;
    private int numero;
    Cliente titular;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public String sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return "O valor de " + valor + " foi sacado com sucesso!";
        } else{
            return "Saldo insuficiente.";
        }

    }

    public boolean transferir(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
}
