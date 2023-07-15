package bytebank.modelo;

public class Contador extends Funcionario {

    public Contador(String nombre, String documento, double salario) {
        super(nombre, documento, salario);
    }

    public double getBonificacion() {
        System.out.println("Ejecutando desde contador");
        return 200;
    }
}
