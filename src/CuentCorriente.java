public class CuentCorriente extends Cuenta {
    public CuentCorriente(int agencia, int numero) {
        super(agencia, numero);
    }
    public CuentCorriente() {
    }

    @Override
    public boolean retirar(double valor) {
        double comision = 0.2;
        return super.retirar(valor + comision);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }
}
