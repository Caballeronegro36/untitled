package bytebank.test;

import bytebank.modelo.Administrador;
import bytebank.modelo.Gerente;
import bytebank.modelo.Sistemainterno;

public class testSistemainterno {
    public static void main(String[] args) {
        Sistemainterno sistema = new Sistemainterno();
        Gerente gerente = new Gerente("Jovani","546546",1000);
        Administrador admin = new Administrador("Victor","546546",2000);


        gerente.setClave("Alura");
        admin.setClave("Alura");
        sistema.autenticar(gerente);
        sistema.autenticar(admin);
    }
}
