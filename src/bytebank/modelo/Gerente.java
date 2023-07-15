package bytebank.modelo;

public class Gerente extends Funcionario implements Autenticable {
    private AutenticacionUtil util;
    public Gerente(String nombre, String documento, double salario) {
        super(nombre, documento, salario);
        this.util = new AutenticacionUtil();
    }

    @Override
    public double getBonificacion() {
        System.out.println("Ejecutando desde gerente");
        return super.getSalario() + this.getSalario() * 0.05;
    }
    @Override
    public boolean iniciarSesiom(String clave) {
        return this.util.iniciarSesion(clave);
    }
    @Override
    public void setClave(String clave) {
        this.util.iniciarSesion(clave);
    }
}

