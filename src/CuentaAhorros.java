public class CuentaAhorros extends Cuenta{
    public CuentaAhorros(int agencia,int numero) {
        super(agencia, numero);
    }

    public CuentaAhorros() {
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        super.depositar(valor);
    }
}
