public abstract class Cuenta {
    double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();


    private static int total;
    public Cuenta(int agencia, int numero){

        if (agencia <= 0 ){
            System.out.println("No se permite 0");
            this.agencia = 1;
        }else {
            this.agencia = agencia;
        }
        total++;
        System.out.println("Sevan creando: " + total + " Cuentas");
    }

    public Cuenta() {

    }

    public void depositar (double valor){
        this.saldo += valor;
    }
    //Metodo para sacar dinero
    public boolean retirar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    //Metodo para transferir dinero
    public boolean transfiere(double valor, Cuenta destino){
        if(this.saldo >= valor){
            this.retirar(valor);
            //this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public double getsaldo(){
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }
}