public class testReferencia {
    private static String clave;

    public static void main(String[] args) {

        //elemto mas generico puede ser adaptado
        Funcionario funcionario = new Gerente("Marcos","1254654",1000);
        System.out.println(funcionario.getNombre());


        Gerente gerente = new Gerente("Jimena","57468754",20000);
        System.out.println(gerente.getNombre());
        gerente.setClave("Alura");
        System.out.println(gerente.iniciarSesiom(clave));

    }
}
