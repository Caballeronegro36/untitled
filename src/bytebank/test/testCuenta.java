package bytebank.test;

import bytebank.modelo.CuentCorriente;
import bytebank.modelo.CuentaAhorros;

public class testCuenta {
    public static void main(String[] args) {

        CuentCorriente cc = new CuentCorriente(1,1);
        CuentaAhorros ca = new CuentaAhorros(2,1);

        cc.depositar(2000);
        cc.transfiere(1000,ca);

        System.out.println(cc.getsaldo());
        System.out.println(ca.getsaldo());
    }
}
