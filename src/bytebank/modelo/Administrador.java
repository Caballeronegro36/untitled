package bytebank.modelo;

public class Administrador extends Funcionario implements Autenticable {
    private AutenticacionUtil util;
    public Administrador(String nombre, String documento, double salario) {
        super(nombre, documento, salario);
        this.util = new AutenticacionUtil();
    }


    @Override
    public double getBonificacion() {
        return this.getSalario();
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
