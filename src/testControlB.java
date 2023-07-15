public class testControlB {
    public static void main(String[] args) {

        Funcionario funcionario = new Contador("Diego","546554",2000);

        Gerente gerente = new Gerente("Jimena","4565783",10000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(funcionario);
        controlBonificacion.registrarSalario(gerente);

        Contador contador = new Contador("alexia","654654",5000);
        controlBonificacion.registrarSalario(contador);
    }
}
