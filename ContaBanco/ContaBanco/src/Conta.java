public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 0;
    
    public Conta(){
        this.agencia=AGENCIA_PADRAO;
        this.numero=SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        
    }
    @Override
public void depositar(double valor) {
    saldo += valor;
    
}
@Override
public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
    
}
    
    
protected int agencia;
protected int numero;
protected double saldo;

public int getAgencia() {
    return agencia;
}
public int getNumero() {
    return numero;
}
public double getSaldo() {
    return saldo;
}

}
