package bytebank.test;

import bytebank.modelo.Contador;
import bytebank.modelo.Funcionario;
import bytebank.modelo.Gerente;

import static java.lang.System.out;

public class testGerente {
    private static String clave;

    public static void main(String[] args) {

        Gerente jovani = new Gerente("jvoani","4556213546",6000);
        jovani.setClave("Sala");
        out.println(jovani.iniciarSesiom(clave));
        out.println(jovani.getSalario());
        out.println(jovani.getBonificacion());


        Funcionario victor = new Contador("victor","456546213",2000);
        out.println(victor.getSalario());
        out.println(victor.getBonificacion());
    }
}
